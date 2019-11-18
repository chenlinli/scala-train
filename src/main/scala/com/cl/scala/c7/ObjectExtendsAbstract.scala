package com.cl.scala.c7

object ObjectExtendsAbstract extends App{
  HelloImpl.sayHello("leo")
}

abstract class Hello(var message:String){
  def sayHello(name:String):Unit
}

object HelloImpl extends Hello("hello"){
  override def sayHello(name: String): Unit = {
    println(message+" , "+name)
  }
}



