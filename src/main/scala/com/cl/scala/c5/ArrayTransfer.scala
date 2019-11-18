package com.cl.scala.c5
import  scala.collection.mutable.ArrayBuffer
object ArrayTransfer extends App {
  val a = Array(1,2,3,4,5)
  //每个元素平方
  //增强for不会改变转换后数组的类型
  val a2 = for(ele<-a) yield ele*ele
  println(a2.getClass)
  println(a2.mkString(" "))

  val b = ArrayBuffer[Int]()
  val b2 = for(ele<-b)yield ele*ele
  println(b2.getClass)
  println(b2.mkString(" "))

  //if守卫过滤
  val a3 = for(ele<-a if ele%2==0) yield ele*ele
  println(a3.mkString(" "))

  val d = a.filter(_ %2 == 0).map(_*2)  //_代表每个元素的占位符
  println(d.mkString(" "))
  val e = a.filter{_ %2 == 0}.map{_*2}  //_代表每个元素的占位符
  println(e.mkString(" "))



}
