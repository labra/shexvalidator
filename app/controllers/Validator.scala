package controllers

import play.api._
import play.api.mvc._

object Validator extends Controller {

  def validate = Action {
    Ok(views.html.index("Validating..."))
  }

}