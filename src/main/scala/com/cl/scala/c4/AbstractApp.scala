package com.cl.scala.c4

object AbstractApp {

  def main(args: Array[String]): Unit = {
//    val p2 = new Person2()//不能实例化
    val stu = new Student2()
    println(stu.name+" "+stu.age)
    stu.speak
  }
}

abstract class Person2{
  //抽象方法
  def speak
  //抽象属性
  val name:String
  val age:Int
}

class Student2 extends Person2 {
  override def speak: Unit = {
    println("say")
  }

  override val name: String = "Pk"
  override val age: Int = 16
}