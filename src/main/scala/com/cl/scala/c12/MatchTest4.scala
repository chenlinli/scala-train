package com.cl.scala.c12

object MatchTest4 extends App {
  def judgeIdentify(p:Person): Unit ={
    p match {
      case Teacher(name,subject) => println("teecher name "+name+" subject " +subject)
      case Studdent(name,classroom)=>println("student name "+name+" classroom "+classroom)
      case _=>println("go out if the schoool pr we will call police")
    }
  }
  judgeIdentify(Studdent("cl","c11"))
  judgeIdentify(Teacher("ll","math"))//有伴生对象
  judgeIdentify(new Person)
}

class Person{
}
case class Teacher(name:String,subject:String) extends Person
case class Studdent(name:String,classroom:String) extends Person

