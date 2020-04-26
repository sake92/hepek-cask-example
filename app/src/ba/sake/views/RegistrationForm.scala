package ba.sake.views

import scalatags.Text.all.{form => _, _}
import ba.sake.views.templates.CaskHepekPage
import ba.sake.views.utils.Imports.Bundle._, Grid._, Form._

case class RegistrationForm(
    username: String = "",
    email: String = "",
    age: Int = 0
) extends CaskHepekPage {

  override def pageSettings =
    super.pageSettings.withTitle("Hepek form")

  override def pageContent = row(
    h3("Form:"),
    form(action := "send-form", method := "POST")(
      row(
        third(),
        third(
          inputText()("username", "Username"),
          inputEmail()("email", "Email"),
          inputNumber(min := "18")("age", "Age"),
          inputSubmit()("Submit form!")
        ),
        third(
          Option.when(age > 0) {
            s"""
              You entered: 
              - username = $username
              - email = $email
              - age = $age
            """.md
          }
        )
      )
    )
  )
}
