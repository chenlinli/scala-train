package com.cl.scala.advance.c1

object DeviateFunc extends App{
  def f1(): Unit = {
    val getStudentGrade: PartialFunction[String, Int] = {
      case "leo" => 90
      case "jack" => 80
      case "marry" => 86
    }
    //语法：val 变量名：类型PartialFunction[v,T]{case ……
    //}

    println(getStudentGrade("leo"))
    //println(getStudentGrade("tom")) //报错
    println(getStudentGrade.isDefinedAt("tom")) //
    println(getStudentGrade.isDefinedAt("leo"))

  }

  f1()

}
