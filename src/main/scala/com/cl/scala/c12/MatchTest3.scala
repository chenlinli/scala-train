package com.cl.scala.c12

object MatchTest3 extends App {
  def greeting(arr:Array[String]): Unit ={
    arr match {
      case Array("leo") => println("Hi leo")
        //指定个数
      case Array(girl1,girl2,girl3) => println("hi girl1,girl2,girl3")
        //_*表示剩余的元素，leo打头匹配
      case Array("Leo",_*) => println("hi leo,why not introduce your friends to me")
      case _=> println("hey who are you")
    }
  }
  greeting(Array("leo"))
  greeting(Array("leo","jean","tom"))
  greeting(Array("Leo","tom","jhon"))//先匹配个数就结束
  greeting(Array("Leo","tom","jhon","jerry"))
  greeting(Array("marry","Leo","tom","jhon"))

  def greeting2(list:List[String]): Unit ={
    list match {
      case "leo"::Nil => println("hi leo")
      case girl1::girl2::girl3::Nil =>println("hi girls")
      case "Leo"::tail =>println("hi leo ,introduce your friends to me ")
      case _=>println("hey,who you are")
    }
  }
  greeting2(List("leo"))
  greeting2(List("leo","jean","tom"))
  greeting2(List("Leo","tom","jhon"))//先匹配个数就结束
  greeting2(List("Leo","tom","jhon","jerry"))
  greeting2(List("marry","Leo","tom","jhon"))
}
