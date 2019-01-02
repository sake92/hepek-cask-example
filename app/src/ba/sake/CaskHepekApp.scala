package ba.sake

import ba.sake.views.{Index, RegistrationForm}
import cask.main.MainRoutes

object CaskHepekApp extends MainRoutes {

  @cask.get("/")
  def showIndex() = Index().render

  @cask.get("/hello/:userName")
  def showHello(userName: String) = Index(userName).render

  /* form */
  @cask.get("/form")
  def showForm() = RegistrationForm().render

  @cask.postForm("/send-form")
  def acceptForm(username: String, email: String, age: Int) =
    RegistrationForm(username, email, age).render

  /* static stuff */
  @cask.staticResources("/styles")
  def styles() = "styles"

  @cask.staticResources("/scripts")
  def scripts() = "scripts"

  @cask.staticResources("/images")
  def images() = "images"

  initialize()
}
