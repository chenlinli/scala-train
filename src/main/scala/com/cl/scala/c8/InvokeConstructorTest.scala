package com.cl.scala.c8

object InvokeConstructorTest extends App{
  val s = new Student6(9)
  println(s.name+" "+s.age+" "+s.score)
}

class Person6(var name:String,var age:Int){
}

//不能var/val
class Student6(name:String,age:Int,var score:Int) extends Person6(name,age){

  def this(name:String){
    this(name,0,0)
  }

  def this(age:Int){
    this("leo",age,0)
  }
}
