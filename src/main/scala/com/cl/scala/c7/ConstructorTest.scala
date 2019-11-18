package com.cl.scala.c7

class Student7(){
  private var name = ""
  private var age = 0
  //辅助构造
  def this(name:String){
    this()  //第一行一定要调用主构造函数/其他辅助构造
    this.name = name
  }

  def this(name:String,age:Int){
    this(name)
    this.age = age
  }
}

class Student6(val name:String="leo",val age:Int=45){
  println(name+":"+age)
}

object ConstructorTest extends App{
//  val s = new Student
//  val s2 = new Student("ll",20)
//  val s3 = new Student("ll")

  val s4 = new Student6("name",45)
  val s5 = new Student6()
}

