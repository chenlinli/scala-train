package com.cl.scala.c5

object ListApp extends App {

//  val a = List(1,2,3,4,5)
//  //可变
//  val l5 = scala.collection.mutable.ListBuffer[Int]()
//  l5+=2
//  l5+=(3,4)
//  l5++=List(5,6,7,8)
//  println(l5)
//  l5-=2
//  println(l5)
//  l5 -=(1)
//  println(l5)
//  l5--=List(5,6,7)
//  val l6 = l5.toList
//  println(l6)
//  val arr = l5.toArray
//  println(l5.isEmpty)
//  println(l5.tail)
//  println(l5.head)
//  println(l5.tail.head)

  def sum(nums:Int*):Int={
    if(nums.length==0){
      0
    }else{
      //sum接收可变参数，tail返回是List/Int,”:_*“转成可变数组
      nums.head+sum(nums.tail:_*)
    }
  }
  println(sum(1,2,3,4))

}
