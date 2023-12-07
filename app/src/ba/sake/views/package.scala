package ba.sake.views

import ba.sake.hepek.bootstrap5.BootstrapBundle

val Bundle = locally {
  val b = BootstrapBundle.default
  import b.*

  val customGrid = Grid.withScreenRatios(
    Grid.screenRatios
      .withAll(Ratios.default.withSingle(1, 4, 1))
      .withSm(None)
      .withXs(None)
  )
  b.withGrid(customGrid)
}
