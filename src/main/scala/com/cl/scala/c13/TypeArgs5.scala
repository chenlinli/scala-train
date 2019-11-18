package com.cl.scala.c13

object TypeArgs5 extends App{
  val s = new Student3("tom")
  val d = new Dog("mrary")
  //val p = new Party(s,d)
  implicit def dog2persong(oj:Object):Person3 = {
    if (oj.isInstanceOf[Dog]) {
      val dog = oj.asInstanceOf[Dog]
      new Person3(dog.name)
    }else
      null
  }
  val p = new Party2[Person3](s,d)
}
class Party2[T <%Person3](p1:T,p2:T){

}
class Person3(val name:String){
  def sayHello = println("hello , I'm "+name)

  def makeFriends(p:Person3): Unit ={
    sayHello
    p.sayHello
  }
}

class Student3(name:String) extends Person3(name){

}

class Dog(val name:String){
  def sayHello = println("Wang Wang, I'm "+name)
}

