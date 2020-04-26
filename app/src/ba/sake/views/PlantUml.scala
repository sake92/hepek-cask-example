package ba.sake.views

import scalatags.Text.all._
import ba.sake.views.templates.CaskHepekPage
import ba.sake.views.utils.Imports.Bundle._, Grid._, Classes._
import ba.sake.hepek.plantuml.PlantumlHelpers._

case class PlantUml() extends CaskHepekPage {

  override def pageSettings =
    super.pageSettings.withTitle("Hepek Panels")

  override def pageContent = row(
    h3("Plant UML example of `while` loop:"),
    div(txtAlignCenter)(
      plantSvg("""
      @startuml
      skinparam backgroundColor #EEEBDC
      skinparam shadowing false

      start

      partition While {
        while (**condition?**) is (Yepp)
          :while loop statements;
          -[#blue,bold]-> loop;
        endwhile (Nope)
      }

      :other statements;

      @enduml
      """)
    )
  )
}
