package com.cl.scala.c15
import scala.actors.Actor
object Actor4 extends App {
  val ha = new HelloActor
  ha.start()
  ha!("hello leo")
}

class HelloActor extends Actor{
  override def act(): Unit = {
    while (true){
      receive{
        case name:String=>println("Hello，"+name)
      }
    }
  }
}

