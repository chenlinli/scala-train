package com.cl.scala.c7

object ObjectTest extends App {
  //第一次执行Person相关于方法，一定会执行构造
//  println(Person.getEynNum)
//  println(Person.getEynNum)

  val p = new Person("leo",34)
  p.sayheloo()
//  Person.eyeNum //不能直接访问，伴生类里可以访问私有的属性
}

class Person(val name:String,val age:Int){
  def sayheloo(): Unit ={
    println(name+" "+age+" "+Person.eyeNum)
  }
}

object Person{
  //一定有眼睛,类共享的
  private var eyeNum = 2
  println("Person object ")

  def getEynNum = eyeNum

}
