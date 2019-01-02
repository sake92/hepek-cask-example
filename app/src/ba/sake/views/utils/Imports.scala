package ba.sake.views.utils

import ba.sake.hepek.bootstrap3.component.{BootstrapFormComponents, BootstrapGridComponents}

object Imports {
  
  object gridComponents extends BootstrapGridComponents

  object formComponents extends BsFormComponents
}

// form stuff
trait BsFormComponents extends BootstrapFormComponents {
  import BootstrapFormComponents._
  override def bootstrapFormType: Type = Type.Horizontal()
}
