import mill._, scalalib._

object app extends ScalaModule {

  def scalaVersion = "2.12.6"
  def ivyDeps = Agg(
    ivy"com.lihaoyi::cask:0.1.9",
    ivy"ba.sake::hepek:0.2.0"
  )

  object test extends Tests{
    def testFrameworks = Seq("utest.runner.Framework")

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.6.3",
      ivy"com.lihaoyi::requests::0.1.5"
    )
  }
}