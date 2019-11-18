package com.cl.scala.c11
//集合高阶函数：接收函数参数/返回函数
object CollectionTest4 extends App{
  //每个元素添加前缀:map
  val l1 = List("Leo","Jen","Perter","Jack").map("name is " + _)
  println(l1)
  //List多行句子拆分单词：flatMap
  val l2 = List("hello world","helli me","hello you").flatMap(_.split(" "))
  println(l2)
  //foreach:打印每个单词
  List("I","have","a","beautiful","house").foreach(println(_))
  //zip:学生姓名成绩关联
  val l3 = List("Leo","Jen","Perter","Jack")
  val l4 = List(100,70,80,90)
  val l5 = l3.zip(l4)
  println(l5) //每个元素是Tuple（name,score）

  //reduce
  //reduceLeft

}
