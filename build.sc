import mill._, scalalib._, scalafmt._

object app extends ScalaModule with ScalafmtModule {

  def scalaVersion = "3.3.1"

  def ivyDeps = Agg(
    ivy"com.lihaoyi::cask:0.9.1",
    ivy"ba.sake::hepek-components:0.20.0"
  )

  object test extends ScalaTests with TestModule.Utest with ScalafmtModule {
    def testFramework = "utest.runner.Framework"
    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.8.2",
      ivy"com.lihaoyi::requests::0.8.0"
    )
  }
}
