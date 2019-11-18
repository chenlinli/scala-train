package com.cl.scala.c8

object ProtectedTest extends App {

}

class Person5{
//  private var name :String = "leo"
  protected var name :String = "leo"
  protected[this] var hobby = "game"   //只能在当前子类对象中访问，其他子类对象无法访问
}

class Student5 extends Person5{
  def sayHello(): Unit ={
    println("hello "+name) //不能访问父类private,protected可以
    println(hobby)
  }

  def makeFriends(s:Student5): Unit ={
    println("hi "+s.name +" my name "+name)
//    println("your hobby "+s.hobby + "my hobby "+hobby)
  }

}
