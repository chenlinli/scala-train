package com.cl.scala.c9

object TraitTest9 extends App {
  val p = new Student9("leo")
}


class Person9(val name :String){
  println("Person con")
}

trait Logger3{
  println("Logger3")
}

trait MyLogger3 extends Logger3{
  println("MyLogger3")
}

trait TimeLogger extends Logger3{
  println("TimeLogger")
}

class Student9(name:String) extends Person9(name) with MyLogger3 with TimeLogger{
  println("Student")
}

