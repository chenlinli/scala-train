package com.cl.scala.c10

object FunctionTest2 extends App {

  def sayHello(name:String)=println("Hello,"+name)

//  val sayHelloFunc = sayHello _
//  sayHelloFunc("leo")
  val sayHelloFunc = (name:String)=>println("Hello,"+name)
  sayHelloFunc("ll")

}
