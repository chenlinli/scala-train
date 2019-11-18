package com.cl.scala.c9

object TraitTest3 extends App {
   val p = new Student("Jack")
   p.sayHello
}

trait Person3{
  //具体方法
  val eyeNum = 2 //子类直接具有eyeNum属性
}

class Student(val name:String) extends Person3 {
  def sayHello: Unit ={
    println("hello, I'm "+name + "I have "+ eyeNum+ "eyes")

  }
}