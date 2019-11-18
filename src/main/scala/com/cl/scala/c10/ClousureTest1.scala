package com.cl.scala.c10

object ClousureTest1 extends App {
  def getGreetingFunc(mgs:String) = (name:String)=>println(mgs+","+name)
  val hi = getGreetingFunc("hi")
  val hello = getGreetingFunc("hello")

  hi("Jack") //msg在返回的函数依然取的到
  hello("Tom")
}
