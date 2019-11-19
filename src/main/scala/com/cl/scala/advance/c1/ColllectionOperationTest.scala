package com.cl.scala.advance.c1

import scala.collection.mutable.ArrayBuffer

object ColllectionOperationTest extends  App {

  var arr = ArrayBuffer(1,2,3,4)
  println(arr.head)
  println(arr.tail)
  println(arr.length)
  println(arr.min)
  println(arr.max)
  println(arr.count(_%2==0)) //%2=0的个数
  println(arr.exists(_%2==0))
  println(arr.filter(_%2==0).mkString(" "))
  println(arr.filterNot(_%2==0).mkString(" "))

  println(arr.takeWhile(_%2!=0).mkString(" "))  //返回满足表达式的值，直到不满足表达式为止

  //原数组没有改变
  println(arr.dropWhile(_%2!=0).mkString(" ")) //删除满足表达式，直到不满足
  println(arr.take(2).mkString(" "))
  println(arr.drop(2).mkString(" "))

  println(arr.mkString(" "))
  println(arr.startsWith(ArrayBuffer(1,2)))
  println(arr.startsWith(ArrayBuffer(2,3)))

}
