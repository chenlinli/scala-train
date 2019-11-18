package com.cl.scala.c8

object AbstractClassTest extends App{
  val p:Person8 = new Student8("leo")
  p.sayHello
  p.age
}

abstract class Person8(val name :String){
  //抽象方法
  def sayHello:Unit

  //抽象field,没有初始值
  val age :Int
}

class Student8(name:String) extends Person8(name){
  def sayHello: Unit = {
    println("name:"+name)
  }

  //不用override
 val age:Int = 12
}