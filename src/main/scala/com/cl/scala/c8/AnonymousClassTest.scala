package com.cl.scala.c8

object AnonymousClassTest extends App {

  //接收
  def greeting(p:Person7{def sayHello:String}): Unit ={
    println(p.sayHello)
  }
  //匿名内部类对象
  val p = new Person7("leo"){
    override def sayHello: String = "hi ,"+name
  }
  greeting(p)

  val p2 = new Person7("lei")
  greeting(p2)
}

class Person7(protected val name :String){
  def sayHello = "hi "+name
}

