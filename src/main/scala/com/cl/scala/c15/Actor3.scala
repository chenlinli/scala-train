package com.cl.scala.c15

import scala.actors.Actor

object Actor3 extends App {
  val userActor = new UserActor
  userActor.start()
  val u = new Login("eo","132")
  val re = new Register("lo","344")
  userActor!u
  userActor!re
}
case class Login(username:String,password:String)
case class Register(username:String,password:String)
class UserActor extends Actor{
  override def act(): Unit = {
    while (true){
      receive{
        case Login(username,password)=>println("login:"+username+" "+password)
        case Register(username,password)=>println("register:"+username+" "+password)
      }
    }
  }
}