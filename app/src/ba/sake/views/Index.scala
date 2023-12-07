package ba.sake.views

import Bundle._, Tags.*, Grid._, Classes._

case class Index(name: String = "guest") extends CaskHepekPage {

  override def pageSettings =
    super.pageSettings.withTitle("Hello Cask!")

  override def pageContent = row(
    div(txtAlignCenter)(
      s"""
      # Welcome!
      
      Howdy, **$name**!

      Try to go to [/hello/:yourName](/hello/yourName)
      """.md
    )
  )

}
