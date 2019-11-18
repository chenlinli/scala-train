package com.cl.scala.c10

object CurringTest extends App {
  def sum(a:Int,b:Int) = a+b
  println(sum(1,1))
  //返回函数(b:Int) =>a+b
  def sum2(a:Int) = (b:Int) =>a+b
  println(sum2(1)(1))
  //Curring
  def sum3(a:Int)(b:Int) = a+b
  println(sum3(1)(1))
}
