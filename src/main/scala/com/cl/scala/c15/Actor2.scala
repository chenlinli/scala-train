package com.cl.scala.c15

import scala.actors.Actor

object Actor2 extends App {
  val Leo = new LeoActor
  val Jack = new JackActor(Leo)
  Leo.start()
  Jack.start()

}

case class Message(content:String,sender:Actor){

}
class LeoActor extends Actor{
  override def act(): Unit = {
    while (true){
      receive{
        case Message(content,sender)=>println("leo："+content)
          //通过引用返回消息
          sender!"please call me after 10 minutes"
      }
    }
  }
}

class JackActor(val leoActor:Actor) extends Actor{
  override def act(): Unit = {
    //向Leo发消息，并传自己引用
    leoActor!Message("Hello leo Let's play",this)
    while (true){
      receive {
        case resopnse:String=>println("Jack:"+resopnse)
      }
    }
  }
}