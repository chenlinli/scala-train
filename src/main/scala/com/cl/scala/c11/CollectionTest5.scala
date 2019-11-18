package com.cl.scala.c11

object CollectionTest5 extends App{
  //println(CollectionTest5.getClass.getResourceAsStream("")
  //统计单词个数
  val line1 = scala.io.Source.fromFile("src\\main\\scala\\com\\cl\\scala\\c11\\t1").mkString
  val line2 = scala.io.Source.fromFile("src/main/scala/com/cl/scala/c11/t2").mkString
  val l = List(line1,line2)
  println(l)
  var l2 = l.flatMap(_.split(" "))
  println(l2)
  var l3 = l2.map((_,1)) //每个单词形成Tuple(word,1)
  println(l3)
  val l4 = l3.map(_._2) //取Tuple的第二个元素(1)
  println(l4)
  val l5 = l4.reduceLeft(_+_)  //所有的1相加
  println(l5)
}
