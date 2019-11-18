package com.cl.scala.c13

object TypeArgs1 extends App{
  val s = new Student[Int](45656)
  println(s.getSchoolId(4565))//规定了类型一定一样
  //  println(s.getSchoolId("35445"))
  val s2 = new Student(1)
  s2.getSchoolId(2)
  //s2.getSchoolId("2")//自动类型推断为Int
}

//id可能int/String,要求两个id类型一致
class Student[T](val localId:T){
  def getSchoolId(hukouId:T) = "S"+hukouId+localId
}