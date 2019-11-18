package com.cl.scala.c5

object ArrayTest extends App {
  val a = new Array[Int](10)
  a(0) = 1
  for(i <-0 until  a.length){
    print(a(i)+" ")
  }
  println()
  val b = Array("heeo","loo")
  b(0) = "hi"
  for(i <-0 until b.length){
    print(b(i)+" ")
  }

  println()
  val c = Array("heeo",34)
  for(i <-0 until c.length){
    print(c(i)+" ") //自动类型推断，c是Array[Any](2)公共类型Any
  }

  println()
  println(a.sum+" "+a.max)
  scala.util.Sorting.quickSort(a)
  println(a.mkString(" "))
}
