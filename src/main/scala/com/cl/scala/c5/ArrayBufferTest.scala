package com.cl.scala.c5
import scala.collection.mutable.ArrayBuffer
object ArrayBufferTest extends App{

  val a = ArrayBuffer[Int]()
  a+=1
  println(a.mkString(" "))
  a+=(2,3,4,5)
  println(a.mkString(" "))
  a++=Array(6,7,8,9,10)
  println(a.mkString(" "))
  a.insert(5,6)
  println(a.mkString(" "))
  a.insert(6,7,8,9,10) //index=6的位置插入7，8，9，10
  println(a.mkString(" "))
  a.trimEnd(5) //尾部开始截断5个元素
  println(a.mkString(" "))
  a.remove(1,3) //index=1移除3个元素
  println(a.mkString(" "))
  //
  val b = a.toArray
  println(b.mkString(" "))
  println(b.getClass)
  val c = b.toBuffer
  println(c.getClass)

  for(i <- 0 until b.length){
    print(b(i)+" ")
  }
  println()
  for(i <- 0 until(b.length,2)){
    print(b(i)+" ")
  }
  println()
  for(i <- (0 until(b.length)).reverse){
    print(b(i)+" ")
  }
  println()
  for(e<-b){
    print(e+" ")
  }

}
