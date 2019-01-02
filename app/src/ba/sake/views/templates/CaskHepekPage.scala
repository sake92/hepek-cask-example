package ba.sake.views.templates

import ba.sake.hepek.bootstrap3.statik.BootstrapStaticPage
import ba.sake.hepek.html.component.CommonmarkComponents

// main template
trait CaskHepekPage extends BootstrapStaticPage with CommonmarkComponents {

  override def siteSettings = super.siteSettings
    .withName("Cask & Hepek demos")
    .withFaviconNormal("images/favicon.ico")

  override def pageSettings = super.pageSettings
    .withDescription("Cask & Hepek demos")

  override def bootstrapNavbar = None

  override def styleURLs = super.styleURLs :+ "styles/main.css"
}

