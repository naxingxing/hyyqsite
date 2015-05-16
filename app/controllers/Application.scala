package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def comingsoon = Action {
    Ok(views.html.comingsoon())
  }
  
  def testindex = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def index = Action {
    Ok(views.html.base(views.html.partialindex(), "主页"))
  }
  
  def aboutus = Action {
    Ok(views.html.base(views.html.partialaboutus(), "关于我们"))
  }
  
  def contactus = Action {
    Ok(views.html.base(views.html.partialcontactus(), "联系我们"))
  }
  
  def error404 = Action {
    Ok(views.html.base(views.html.partialerror404(), "网址错误"))
  }
  
  def blog = Action {
    Ok(views.html.base(views.html.partialblog(), "博客"))
  }
  
  def portfolio = Action {
    Ok(views.html.base(views.html.partialportfolio(), "服务简介"))
  }

  def single = Action {
    Ok(views.html.base(views.html.partialsingle(), "博客详页"))
  }

}