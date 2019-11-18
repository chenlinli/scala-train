package com.cl.scala.c3

object FunctionApp {

  def main(args: Array[String]): Unit = {
//    println(add(2,3))
//    println(three())

    /**
      * 没有入参可以省略参数列表（）
      */
//    println(three)
//    sayHello()
//    sayHello
//    sayName("ff")
//    sayName()
    //sayName //不能省略
//    println(speed(100,10))
//    println(speed(time = 10,distance = 100))
//    println(sum2(1))
//    println(sum2(1,2,3,4))

//    var x = 1
//    var a = true
//    if(x>0) {
//      a = true
//    }
//    else {
//      a = false
//    }

    1 to 10
    1.to(10)
//
//    for(i <- 1 to 10 if i%2==0){
//      println(i)
//    }

 /*   val courses = Array("Hadoop","Soravj","Storm","Spark","Scala")
    for(course <- courses){
      println(course)
    }
    //将course作用于=>的函数
    courses.foreach(course =>println(course))
*/
    var (num,sum) = (100,0)
    while (num>0){
      sum+=num
      num-=1
    }
    println(sum)

  }
  def add(x:Int,y:Int):Int={
    x+y
  }
//  只有一行省略{}，返回类型自动判断为Int
  def three() = 1+2

  //没有返回值：":Unit="
  def sayHello(): Unit ={
    println("say hello")
  }

  //默认参数
  def sayName(name:String="cl"): Unit ={
    println(name)
  }

  //命名参数
  def speed(distance:Float,time:Float):Float={
    distance/time
  }

  //可变参数
  def sum(a:Int,b:Int):Int = {
    a+b
  }

  def sum(a:Int,b:Int,c:Int):Int = {
    a+b+c
  }

  def sum2(numbers:Int*):Int={
    var result = 0;
    for(number<- numbers){
      result+=number
    }
    result
  }


}


