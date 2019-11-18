package com.cl.scala.c8

object ExtendsTest extends App{
  val stu = new Student
  println(stu.getScore)
  println(stu.getName)
//  println(stu.name)
}

class Person{
  private var name = "lei"  //只能当前类使用
  def getName = name
}


class Student extends Person{
  private var score = "A"
  //覆盖
  override def getName: String = "hi,"+super.getName
  def getScore = score
}
