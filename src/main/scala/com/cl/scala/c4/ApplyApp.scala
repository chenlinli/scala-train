package com.cl.scala.c4

object ApplyApp {

  def main(args: Array[String]): Unit = {
//    for(i <- 1 to 10){
//      AppTest.incr
//    }
//
//    println(AppTest.count)  //object本身是一个单例对象
    val b = AppTest()  //调用的是object的apply方法
    println(b)
    println("*********************************")
    val c = new AppTest()
    println(c)
    c() //调用的是class的apply

    //类名()-->object.apply
    //对象()-->clss.apply
  }
}
//伴生类
//class和object同名，则object是class的伴生对象，class是object的伴生类
class AppTest{
  def apply()= {
    println("class apply")
    //class的apply中new class
  }

}
//伴生对象
object AppTest{
  println("object enter")
  var count = 0

  def incr = {
    count += 1
  }

  //最佳实践：object.aplly去new 伴生class,使用是不用new
  def apply()= {
    println("object apply")
    //object的apply中new class
    new AppTest
  }
  println("object exit")
}
