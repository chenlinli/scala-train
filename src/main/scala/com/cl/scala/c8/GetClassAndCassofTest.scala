package com.cl.scala.c8

object GetClassAndCassofTest extends App{
  val p :Person4 = new Student4
//  println(p.isInstanceOf[Person4])
//  println(p.getClass == classOf[Person4])
  p match{
    case _:Person4 =>println("Person object")  //Person4或 其子类
    case _ =>println("unkonw type")
  }
}
class Person4

class Student4 extends Person4
