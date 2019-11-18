package com.cl.scala.c7

object ObjectEnumerationTest extends App{

  println(Season.SPRING)
  println(Season2(0))
  println(Season2.SPRING.id)
  println(Season2.SPRING.toString)
  println(Season2.withName("winter"))

  //遍历
  for(ele <-Season2.values){
    println(ele)
  }
}
object Season extends Enumeration{
  val SPRING,SUMMER,AUTUMN,WINTER = Value
}

object Season2 extends Enumeration{
  val SPRING = Value(0,"spring")
  val SUMMER = Value(1,"summer")
  val AUTUMN = Value(2,"autumn")
  val WINTER = Value(3,"winter")
}

