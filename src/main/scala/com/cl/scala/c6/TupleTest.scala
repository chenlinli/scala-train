package com.cl.scala.c6

object TupleTest extends App{
  val t = ("leo",34)
  println(t._1)
  println(t._2)

  //
  val names = Array("lero","jsck","jane")
  val ages = Array(12,34,43)
  val nameAges = names.zip(ages)
  println(nameAges) //每个元素都是Tuple
  println(nameAges.getClass)

  for((name,age)<-nameAges){
    println(name+" "+age)
  }
}
