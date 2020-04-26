import mill._, scalalib._, scalafmt._

object app extends ScalaModule with ScalafmtModule {

  def scalaVersion = "2.13.2"
  
  def ivyDeps = Agg(
    ivy"com.lihaoyi::cask:0.6.0",
    ivy"ba.sake::hepek-components:0.7.0"
  )

  object test extends Tests with ScalafmtModule {
    def testFrameworks = Seq("utest.runner.Framework")

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.7.4",
      ivy"com.lihaoyi::requests::0.6.0"
    )
  }
}