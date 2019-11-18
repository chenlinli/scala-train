package com.cl.scala.c10

object FunctionTest3 extends App {

  def sayHello(name:String)=println("Hello,"+name)

  //匿名函数
  val sayHelloFunc = (name:String)=>println("Hello,"+name)
  //高阶
  def greeting(func:(String)=>Unit,name:String): Unit ={
    func(name)
  }

  greeting(sayHelloFunc,"leo")

  val a = Array(1,2,3,4,5).map((num:Int)=>num*num)
  println(a.mkString(" "))

  //高阶函数
  //接收msg,返回函数
  def getGreetingFun(msg:String) = (name:String)=>println(msg+" "+name)
  val func = getGreetingFun("Hello")
  func("Leo")

  val f2 = getGreetingFun("Hi")
  f2("Leo")

  //
}
