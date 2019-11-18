package com.cl.scala.c3

object AgrsTest extends App {
  def sayHello(firstName:String,middleName:String = "",lastName:String = ""): Unit ={
    println(firstName+" m: "+middleName+" l："+lastName)
  }

  //可变参数
  def sum(nums:Int*)={
    var res = 0
    for(n<-nums){
      res+=n
    }
    res
  }

  def sum2(nums:Int*):Int={
    if(nums.length ==0){
      0
    }else {
      nums.head+sum2(nums.tail:_*)
    }
  }

  println(sum2(1,2,3,4,5))
  println(sum(1,2,3))
  println(sum(1,3,5,7))
  println(sum(1 to 5:_*))
  sayHello("Jhon")
  sayHello("Jhon","Mid")
  sayHello("Jhon",lastName="Mid")
}
