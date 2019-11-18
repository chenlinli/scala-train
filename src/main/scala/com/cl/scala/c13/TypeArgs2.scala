package com.cl.scala.c13

object TypeArgs2 extends App{
  def getCard[T](content:T): String ={
    if(content.isInstanceOf[Int]) "card:001,"+content
    else if(content.isInstanceOf[String]) "card:this id you card "+content
    else "card:"+content
  }

  println(getCard[String]("hello"))
  println(getCard[Int](100))
//  println(getCard[Int]("67"))
  println(getCard(0.06)) //自动推断
}
