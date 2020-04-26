package ba.sake.views

import scalatags.Text.all._
import ba.sake.views.templates.CaskHepekPage
import ba.sake.views.utils.Imports.Bundle._, Grid._, Classes._

case class Panels() extends CaskHepekPage {

  override def pageSettings =
    super.pageSettings.withTitle("Hepek Panels")

  override def pageContent = div(
    br,
    Panel.panel(
      panelType = Panel.Companion.Type.Primary,
      body = "header + body + footer",
      header = Some("Panel header"),
      footer = Some("Panel footer")
    ),
    hr,
    Panel.panel(
      panelType = Panel.Companion.Type.Warning,
      body = "header + body",
      header = Some("Panel header")
    ),
    hr,
    Panel.panel(
      panelType = Panel.Companion.Type.Success,
      body = "body + footer",
      footer = Some("Panel footer")
    )
  )

}