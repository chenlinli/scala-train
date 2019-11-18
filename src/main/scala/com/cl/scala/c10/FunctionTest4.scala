package com.cl.scala.c10

object FunctionTest4 extends App {


  def greeting(func:(String)=>Unit,name:String): Unit ={
    func(name)
  }

 greeting((name:String)=>println("Hello,"+name),"leo")
  //类型推断，匿名函数的参数类型可以省略
  greeting((name)=>println("Hello,"+name),"leo")
  //只有一个参数()可以省略
  greeting(name=>println("Hello,"+name),"leo")
  //匿名函数只有一个参数，而且匿名函数体内只有只使用这个参数一次
  // ，省略参数接收，可以使用“_"替代参数

  def triple(func:(Int) =>Int) = {
    func(3)
  }

  println(triple((num:Int)=>4*num))
  println(triple(4*_))    //3*_是个匿名函数的函数体，省略了参数部分(num:Int),函数体的num被_替代
}
