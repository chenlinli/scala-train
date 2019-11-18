package com.cl.scala.c13

object TypeArgs9 extends App{
  val leo = new Card[Master]("Leo")
  val j = new Card[Professional]("Jacvk")

  def enter(card:Card[Master]): Unit ={
    println("welcome  to the meeting")
  }
  enter(leo) //
  enter(j) //P是M的子类，协变：Card[Professional]是Card[Master的子类

  val a = new Card2[Master]("leo")
  val b = new Card2[Professional]("jack")
  def enter2(card:Card2[Master]): Unit ={
    println("welcome  to the meeting")
  }
  enter2(a)
  //  enter2(b)  //只允许Card[Master]类型
  def enter3(card:Card3[Professional]): Unit ={
    println("welcome  to the meeting")
  }
  val c = new Card3[Professional]("leo")
  val d = new Card3[Master]("jack")
  enter3(c)
  enter3(d) //[]接收T和其父类

}
class Master
class Professional extends Master

class Card[+T](val name:String) //只允许匹配T类型和T的子类
class Card2[T](val name:String) //只允许匹配T类型
class Card3[-T](val name:String) //允许T类型和T的父类