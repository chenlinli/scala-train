package com.cl.scala.c4

object CaseClassApp {
  def main(args: Array[String]): Unit = {
    println(Dog("wangcai").name)
  }

}
//class不用new,通常用在模式匹配里
case class Dog(name:String){

}
