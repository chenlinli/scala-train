package com.cl.scala.c9

object TraitTest4 extends App {
   val p = new Person4("Jack")
  val p2 = new Person4("Jean")
   p.makeFriends(p2)
}

trait SayHello2{
  //抽象字段，继承一定要重写
  val msg :String
  //具体方法
  def sayHello(name:String) = println("hello "+name+","+msg)
}

class Person4(val name:String) extends SayHello2 {
  override val msg = "Hello"
  def makeFriends(p:Person4): Unit ={
    sayHello(p.name)
    println("I want to be friends with you")
  }
}