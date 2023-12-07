package ba.sake.views

import Bundle._, Tags.*, Classes.*

trait CaskHepekPage extends Page {

  override def siteSettings =
    super.siteSettings
      .withName("Cask & Hepek demo")
      .withFaviconNormal("images/favicon.ico")

  override def pageSettings =
    super.pageSettings
      .withDescription("Cask & Hepek demo")

  override def styleURLs =
    super.styleURLs :+ "styles/main.css"

  override def bodyContent =
    div(clsContainerFluid)(
      Navbar.nav(
        brandUrl = "/",
        brandName = Some("Cask + Hepek"),
        left = {
          List(
            ("/form", "Form"),
            ("/panels", "Panels"),
            ("/plant-uml", "Plant UML")
          ).map { case (pageLink, pageTitle) =>
            Navbar.link(pageLink, pageTitle)
          }
        }
      ),
      pageContent
    )
}
