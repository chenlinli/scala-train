package com.cl.scala.c12

object MatchTest5 extends App {
  val grades = Map("leo"->"A","marry"->"B","tom"->"C")
  def getGrade(name:String): Unit ={
    var grade = grades.get(name)
    grade match {
      case Some(grade)=>println("there is you grade ")
      case None =>println("there is not your grade")
    }
  }

  getGrade("leo")
  getGrade("jacj")
}
