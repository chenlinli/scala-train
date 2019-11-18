package com.cl.scala.c5

object ArrayApp extends App {

// val a = new Array[String](5);
//  println(a.toString )
//  a(1) = "hello"
//  val b = Array("a","b","c")  //object.apply
//  val c = Array(1,2,3,4,5,6)

  val d = scala.collection.mutable.ArrayBuffer[Int]()
  d+=1
  d+=2
  d+=(3,4,5)
  d ++= Array(6,7,8) //数组添加
  println(d)
  d.insert(0,0) //0位置添加0元素
  println(d)
  d.remove(1) //删除位置1
  println(d)
  d.remove(0,3)//0开始删除3个元素
  println(d)
  d.trimEnd(2)//移除最后两个元素
  println(d)
  println(d.toArray.mkString(","))//转成Array
  //正序
  for(i <- 0 until d.length){
    print(d(i)+" ")
  }
  println()
  //迭代
  for (ele <- d){
    print(ele+" ")
  }
  println()
  //逆序
  for(i <- (0 until d.length).reverse){
    print(d(i)+" ")
  }

}
