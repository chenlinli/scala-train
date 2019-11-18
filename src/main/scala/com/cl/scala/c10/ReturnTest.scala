package com.cl.scala.c10

object RetuenTest extends App {
  def greeting(name:String):String= {
    def sayhello(name:String):String={
      return "hello,"+name //直接作为外部函数的值返回
    }
    sayhello(name) //其返回值return语句作为外部函数的返回值
  }
  println(greeting("lo"))
}
