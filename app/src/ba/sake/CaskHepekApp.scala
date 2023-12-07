package ba.sake

import ba.sake.views._
import cask.main.MainRoutes

object CaskHepekApp extends MainRoutes {

  @cask.get("/")
  def showIndex() =  "<!DOCTYPE html>" + Index().contents

  @cask.get("/hello/:userName")
  def showHello(userName: String) = 
    "<!DOCTYPE html>" + Index(userName).contents
  

  /* form */
  @cask.get("/form")
  def showForm() = "<!DOCTYPE html>" + RegistrationForm().contents
  

  @cask.postForm("/send-form")
  def acceptForm(username: String, email: String, age: Int) =
    "<!DOCTYPE html>" + RegistrationForm(username, email, age).contents

  /* others */
  @cask.get("/panels")
  def showPanels() = "<!DOCTYPE html>" + Panels().contents

  /* static stuff */
  @cask.staticResources("/styles")
  def styles() = "styles"

  @cask.staticResources("/scripts")
  def scripts() = "scripts"

  @cask.staticResources("/images")
  def images() = "images"

  initialize()
}
