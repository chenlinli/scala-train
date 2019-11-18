package com.cl.scala.c5
import scala.collection.mutable.ArrayBuffer
object TestRemove extends App{
  def f1() {
    val a = ArrayBuffer[Int]()
    //移除第一个负数以后的所有负数
    a += (1, 2, 3, 4, 5, -1, -3, -5, -7)
    var foundFirstNegative = false
    var len = a.length
    var index = 0
    while (index < len) {
      if (a(index) > 0) {
        index += 1
      } else if (!foundFirstNegative) {
        foundFirstNegative = true
        index += 1
      } else {
        a.remove(index)
        len -= 1
      }
    }
    println(a.mkString(" "))

  }

  def f2() {
    val a = ArrayBuffer[Int]()
    //移除第一个负数以后的所有负数
    a += (1, 2, 3, 4, 5, -1, -3, -5, -7)
    var foundFirstNegative = false
   val keepIndexes = for(i <- 0 until a.length if !foundFirstNegative || a(i)>=0)
     yield{
       if(a(i)<0) {
         foundFirstNegative = true
       }
       i
     }
    //保留元素放到前面
    for(i <- 0 until keepIndexes.length){
      a(i) = a(keepIndexes(i))
    }

    a.trimEnd(a.length-keepIndexes.length)
    println(a.mkString(" "))
  }
  f2()
}
