package com.cl.scala.c9

object TraitTest2 extends App {
   val p = new Person2("Jack")
   p.sayHello
}

trait Logger{
  //具体方法
  def log(msg:String) = println("log:"+msg)
}

class Person2(val name:String) extends Logger{
  def sayHello: Unit ={
    println("hello, I'm "+name)
    log("sayHello is invoked")
  }
}