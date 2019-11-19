package com.cl.scala.advance.c1

object OneArgExtractor extends App {

  class Person(val name:String)

  object Person{
    def unapply(arg: String): Option[String] ={
      Some(arg)
    }
  }

  val Person(name) = "leo"
  println(name)

}
