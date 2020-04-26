package ba.sake.views.utils

// try different bundles:
import ba.sake.hepek.bootstrap3.BootstrapBundle
import ba.sake.hepek.bulma.BulmaBundle
import ba.sake.hepek.w3css.W3CssBundle

object Imports {

  private val baseBundle = BootstrapBundle()
  import baseBundle._

  private val customGrid = Grid.withScreenRatios(
    Grid.screenRatios
      .withAll(Ratios().withSingle(1, 4, 1))
      .withSm(None)
      .withXs(None)
  )

  val Bundle = baseBundle.withGrid(customGrid)
}
