package com.cl.scala.c10

object FunctionTest5 extends App {
  //每个元素map操作
  var a = Array(1,2,3,4,5).map(2*_)
  println(a.mkString(" "))
  //foreach没有返回值
  (1 to 9).map("*" * _).foreach((println(_)))
  //filter:过滤，每个元素过滤
  val b = (1 to 20).filter(_%2==0)
  println(b.mkString(" "))
  //reduce：第一次是1和2乘，第二次是1*2的结果和3乘……
  val c = (1 to 9).reduceLeft(_*_) //1*2 …… *9
  println(c)
  //sortWith:元素靓靓比较，排序
  Array(3,2,5,4,10,1).sortWith(_<_)

}
