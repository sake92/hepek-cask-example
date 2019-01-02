package ba.sake.views

import scalatags.Text.all._
import ba.sake.views.templates.CaskHepekPage
import ba.sake.views.utils.Imports.gridComponents._
import ba.sake.views.utils.Imports.formComponents._
import cask.endpoints.FormReader
import cask.model.{FormEntry, FormFile, FormValue, Request}

object RegistrationForm {

  def apply() = new RegistrationForm("", "", 0)
  
  def apply(username: String, email: String, age: Int) = 
    new RegistrationForm(username, email, age)
}

class RegistrationForm(username: String, email: String, age: Int) extends CaskHepekPage {

  override def pageSettings = super.pageSettings
    .withTitle("Hepek form")

  override def pageContent = row(
    formm("send-form", method := "POST")(
      row(
        third1(),
        third2(
          inputText("Username", name := "username"),
          inputEmail("Email", name := "email"),
          inputNumber("Age", name := "age", min := "18"),
          inputSubmit("Submit form!")
        ),
        third3 (
          if(age > 0) 
            s"""
              You entered: 
              - username = $username
              - email = $email
              - age = $age
            """.md
          else frag()
        )
      )
    )
  )
}
