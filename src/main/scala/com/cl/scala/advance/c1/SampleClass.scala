package com.cl.scala.advance.c1

object SampleClass extends App {
  //样例类，默认有伴生对象，apply,unapply()
  //有getter setter
  case class Person(val name:String,val age:Int)

  val p = Person("le",13) //apply

  //样例类提取器
  p match {
    case Person(name,age)=>println(name) //unapply()
  }

}
