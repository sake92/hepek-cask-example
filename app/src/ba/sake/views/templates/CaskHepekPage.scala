package ba.sake.views.templates

import scalatags.Text.all._
import ba.sake.views.utils.Imports.Bundle._, Classes._

trait CaskHepekPage extends HtmlPage {

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
      Navbar.simple(
        brandUrl = "/",
        brandName = Some("Cask + Hepek"),
        left = {
          List(("/form", "Form"), ("/panels", "Panels")).map {
            case (pageLink, pageTitle) =>
              hyperlink(pageLink)(pageTitle)
          }
        }
      ),
      pageContent
    )
}
