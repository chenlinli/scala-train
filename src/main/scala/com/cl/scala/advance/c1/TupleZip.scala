package com.cl.scala.advance.c1

import java.util

object TupleZip extends App{
  def fun1(): Unit ={
    val stus = Array("leo","jack","jean")
    val scores = Array(70,80,90)
    val stuScores = stus.zip(scores)
    println(stuScores.mkString("\n"))

    println()
    val map = stuScores.toMap
    println(map.mkString("\n"))
    println(map.getClass)
    println(map("jean"))
  }
  //fun1()

  def func2(): Unit ={
    import scala.collection.JavaConversions.mapAsScalaMap
    val javaScoreMap = new util.HashMap[String,Int]()
    javaScoreMap.put("lei",70)
    javaScoreMap.put("jack",80)
    javaScoreMap.put("jean",90)

    //java map->scala map
    val scalaHashMap :scala.collection.mutable.Map[String,Int]=javaScoreMap
    println(scalaHashMap("lei"))

    //scala map-->java
    import scala.collection.JavaConversions.mapAsJavaMap
    import java.awt.font.TextAttribute._
    val javaMap:java.util.HashMap[String,Int] = new util.HashMap[String,Int]()
    javaMap.putAll(scalaHashMap)//scala map -->Map
    println(javaMap.get("lei"))

  }
  func2()
}
