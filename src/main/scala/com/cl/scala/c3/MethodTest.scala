package com.cl.scala.c3

object MethodTest extends App{
  def sayHello(name:String,age:Int)={
    if(age>18) {
      printf("hi ,%s big boy", name)
      age //返回
    }
    else{
      printf("hi ,%s good boy",name)
      age //返回
    }
  }

  //有=则说明函数有返回值
  def sum(n:Int) = {
    var result = 0
    for (i<-1 to n){
      result+=i
    }
    result
  }

  //递归函数，必须给出返回类型
  def fab(n:Int):Int={
    if(n<=0){
      1
    }else{
      fab(n-1)+fab(n-2)
    }
  }
  var  age = sayHello("Lily",18)
  println()
  println(age)
  println(sum(10))
  println(fab(10))
}
