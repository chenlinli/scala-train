package com.cl.scala.c12

import java.io.{FileNotFoundException, IOException}

object MatchTest2 extends App {
  //类型模式匹配；case:类型=>代码
  def processException(e:Exception): Unit ={
    e match {
      case e1:IllegalArgumentException => println("IllegalArgumentException "+e1)
      case e2:FileNotFoundException => println("FileNotFoundException "+e2)
      case e3:IOException => println("IllegalArgumentException "+e3)
      case _:Exception => println("you can not konw which exception you had")
    }
  }
  val e = new IllegalArgumentException()
  processException(e)
  val e2 = new IndexOutOfBoundsException()
  processException(e2)
}
