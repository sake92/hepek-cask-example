package ba.sake.views.templates

import ba.sake.views.utils.Imports.Bundle._

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
}
