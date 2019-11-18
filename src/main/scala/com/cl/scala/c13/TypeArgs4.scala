package com.cl.scala.c13

object TypeArgs4 extends App{
  def getIdCard[R >:Child](p:R): Unit ={
    if(p.getClass==classOf[Child])println("please tell your parents' name")
    else if(p.getClass==classOf[Father]) println("sign your name")
    else println("you are not allowed to get the id card ")
  }
  getIdCard(new Worker)
  getIdCard(new Father("Jack"))
  getIdCard(new Child("Tommy"))

}
class Father(val name:String)
class Child(name:String) extends Father(name)

