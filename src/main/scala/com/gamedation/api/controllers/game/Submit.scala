package com.gamedation.api.controllers.game

import com.plasmaconduit.conveyance.Box
import com.plasmaconduit.framework.mvc.Controller
import com.plasmaconduit.framework.{HttpRequest, HttpResponse}

final case class Submit() extends Controller {

  override def action(implicit request: HttpRequest): Box[Throwable, HttpResponse] = ???

}
