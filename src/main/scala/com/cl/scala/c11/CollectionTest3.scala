package com.cl.scala.c11

object CollectionTest3 extends App{
  val s = Set(1,2,3)  //不可变，无序，无重复
  println(s+1)
  println(s+6)
  println(s)

  //有序：插入顺序
  val s2 = scala.collection.mutable.LinkedHashSet[Int]()
  s2+=1
  s2+=2
  s2+=5
  println(s2)
  //自动排序
  val s3 = scala.collection.mutable.SortedSet("orange","apple","banana")
  println(s3.mkString(" "))
}
