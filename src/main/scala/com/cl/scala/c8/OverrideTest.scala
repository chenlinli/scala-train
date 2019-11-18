package com.cl.scala.c8

object OverrideTest extends App{
  val p = new Person2
  println(p.name)
  val s = new Student2
  println(s.age)
}

class Person2{
  val name :String = "p"
  def age:Int = 0
}

class Student2 extends Person2{
  //覆盖val
  override val name: String  = "leo"

  override def age: Int = 20
}