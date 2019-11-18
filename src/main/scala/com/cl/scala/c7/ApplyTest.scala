package com.cl.scala.c7

object ApplyTest extends App{
  val p = new Person4("leo")
  val p2 = Person4("leo") //调用apply(name:String)
}

class Person4(var name:String){

}

object Person4{
  def apply(name: String): Person4 = {
    new Person4(name)
  }
}
