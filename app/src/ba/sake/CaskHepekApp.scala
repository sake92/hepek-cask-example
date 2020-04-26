package ba.sake

import ba.sake.views.{Index, RegistrationForm}
import cask.main.MainRoutes

object CaskHepekApp extends MainRoutes {

  @cask.get("/")
  def showIndex() = Index()

  @cask.get("/hello/:userName")
  def showHello(userName: String) = Index(userName).contents

  /* form */
  @cask.get("/form")
  def showForm() = RegistrationForm().contents

  @cask.postForm("/send-form")
  def acceptForm(username: String, email: String, age: Int) =
    RegistrationForm(username, email, age).contents

  /* static stuff */
  @cask.staticResources("/styles")
  def styles() = "styles"

  @cask.staticResources("/scripts")
  def scripts() = "scripts"

  @cask.staticResources("/images")
  def images() = "images"

  initialize()
}
