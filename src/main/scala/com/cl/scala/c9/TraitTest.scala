package com.cl.scala.c9

object TraitTest extends App {
   val p = new Person("Jack")
  val p2 = new Person("Jean")
  p.makeFriends(p2)
}

trait SayHello{
  def sayHello(name:String)
}

trait MakeFriends{
  def makeFriends(p:Person)
}

class Person(val name:String) extends SayHello with MakeFriends{
  def sayHello(name: String): Unit = println("Hello " + name)

  def makeFriends(p: Person): Unit = println("Hello ,I am "+name+ ",Let's be friend "+p.name)
}
