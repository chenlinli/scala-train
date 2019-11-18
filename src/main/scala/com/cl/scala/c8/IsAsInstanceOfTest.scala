package com.cl.scala.c8

object IsAsInstanceOfTest extends App {
  val p:Person3 = new Student3
  val p2 = new Person3
  println(p.getClass)
  println(p2)
  if(p.isInstanceOf[Student3]) {
    p.asInstanceOf[Student3]
  }
  println(p.getClass)
}

class Person3

class Student3 extends Person3


