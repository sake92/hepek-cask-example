package ba.sake.views

import scalatags.Text.all._
import ba.sake.views.templates.CaskHepekPage
import ba.sake.views.utils.Imports.gridComponents._

object Index {

  def apply() = new Index("guest")

  def apply(name: String) = new Index(name)
}

class Index(name: String) extends CaskHepekPage {

  override def pageSettings = super.pageSettings
    .withTitle("Hello Cask!")

  override def pageContent = row(
    third1(), 
    third2(
      s"""
        # Welcome!
        
        Howdy, **$name**!

        Try to go to [/hello/yourName](/hello/yourName)

        And [here](/form) is a form example.
      """.md
    ), 
    third3()
  )
}
