package com.cl.scala.c12

object MatchTest1 extends App {
  def judggeGrade(grade:String): Unit ={
    grade match {
      case "A"=>println("Excellent") //只会匹配一个，匹配了就停止
      case "B"=>println("Good")
      case "C" =>println("Just soso")
      case _=>println("Work harder")  //_匹配其他情况
    }
  }
  judggeGrade("B")
  judggeGrade("E")

  def judggeGrade2(name:String,grade:String): Unit ={
    grade match {
      case "A"=>println(name+" Excellent") //只会匹配一个，匹配了就停止
      case "B"=>println(name+" Good")
      case "C" =>println(name+" Just so so")
      //其他情况的等级，名字是Leo,舅舅已经Good
      case _ if name == "Leo"=>println(name+" you are good ,come on")
      case _=>println("Work harder")  //_匹配其他情况
    }
  }

  judggeGrade2("Ja","B")
  judggeGrade2("Ja","C")
  judggeGrade2("Leo ","C")
  judggeGrade2("Leo","D")
  judggeGrade2("Maee","E")

  //需要使用匹配到的值
  def judggeGrade3(name:String,grade:String): Unit ={
    grade match {
      case "A"=>println(name+"A Excellent") //只会匹配一个，匹配了就停止
      case "B"=>println(name+"B Good")
      case "C" =>println(name+"C Just so so")
      //其他情况的等级，名字是Leo,舅舅已经Good
      case hadGrade =>println(name+" you got "+hadGrade+" work harder")
    }
  }

  judggeGrade3("ja","A")
  judggeGrade3("ja","B")
  judggeGrade3("ja","C")
  judggeGrade3("ja","D")

}
