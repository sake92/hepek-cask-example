package ba.sake

import io.undertow.Undertow

import utest._

object ExampleTests extends TestSuite {

  val tests = Tests {
    "CaskHepekApp" - test(CaskHepekApp) { host =>
      val success = requests.get(host)

      assert(success.text().contains("Howdy,"))

      success.statusCode ==> 200

      requests.get(s"$host/doesnt-exist", check = false).statusCode ==> 404
    }
  }

  private def test[T](example: cask.main.Main)(f: String => T): T = {
    val server = Undertow.builder
      .addHttpListener(8080, "localhost")
      .setHandler(example.defaultHandler)
      .build
    server.start()
    val res =
      try f("http://localhost:8080")
      finally server.stop()
    res
  }
}
