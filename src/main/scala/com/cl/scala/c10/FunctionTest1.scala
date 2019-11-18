package com.cl.scala.c10

object FunctionTest1 extends App {

  def sayHello(name:String)=println("Hello,"+name)

  val sayHelloFunc = sayHello _
  sayHelloFunc("leo")

}
