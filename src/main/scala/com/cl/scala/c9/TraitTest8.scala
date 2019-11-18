package com.cl.scala.c9

object TraitTest8 extends App {
  val p = new Person8("leo")
}
trait Valid{
  //抽象
  def getName:String
  //具体
  def valid:Boolean={
    getName=="leo"
  }
}

class Person8(val name :String) extends Valid{
  println(valid)

  def getName = name
}