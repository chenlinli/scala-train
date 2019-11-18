package com.cl.scala.c13

object TypeArgs7 extends App{
  val o = new Caculator(1,2)
println(o.max)
println(Ordering.getClass)
}

class Caculator[T:Ordering](val number1:T,val number2:T){
  //隐式值试试scala 上下文注入，用户不用传入
  def max(implicit order:Ordering[T]) = if(order.compare(number1,number2)>0) number1 else number2
}