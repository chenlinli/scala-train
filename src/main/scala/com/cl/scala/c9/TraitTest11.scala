package com.cl.scala.c9

object TraitTest11 extends App {

  val p3 = new Person14("Tom")
  p3.sayHello
}

class MyUtil{
  def printMessage(msg:String) = println(msg)
}

trait Logger5 extends MyUtil{
  def log(msg:String) = printMessage("log:"+msg)
}
class Person14(val name:String) extends Logger5 {
  def sayHello: Unit ={
    log("Hi,I'm "+name)
    printMessage("Hi,I'm "+name)
  }
}
