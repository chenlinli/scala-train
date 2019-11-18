package com.cl.scala.c13

object TypeArgs3 extends App{
  val s = new Student2("tom")
  val p = new Person2("leo")
  val worker = new Worker
  new Party[Person2](s,p).play
  //new Party(s,worker).play//类型不匹配
}
class Person2(val name:String){
  def sayHello = println("Hello,I'm "+name)
  def makeFriends(p:Person2): Unit ={
    sayHello
    p.sayHello
  }
}

class Student2(name:String) extends Person2(name){

}
class Worker
//T是Person2或其子类
class Party[T<:Person2](p1:T,p2:T){
  def play = p1.makeFriends(p2)
}

