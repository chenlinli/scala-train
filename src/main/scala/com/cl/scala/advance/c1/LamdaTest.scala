package com.cl.scala.advance.c1

object LamdaTest extends App {

  def f1() {
    val scoresMap = Map("leo" -> 70, "jack" -> 68, "tom" -> 80)
    val names = List("leo", "jack", "tom")

    var scores = names.map(scoresMap(_))
    println(scores)

    val scoreMap = Map("leo" -> List(80, 90, 60), "jack" -> List(70, 90, 50), "tom" -> List(60, 70, 40))
    val scoreList = names.map(scoreMap(_))
    println(scoreList)
    scores = names.flatMap(scoreMap(_))
    println(scores)

    //collect应用与偏函数
    val list = "abc".collect {
      case 'a' => 1
      case 'b' => 2
      case 'c' => 3
    }
    println(list)

    names.foreach(println(_))
  }

  def f2(): Unit = {
    val arr = List(1, 2, 3, 4, 5, 6)
    println(arr.reduceLeft(_ - _)) //1-2-3……-6 = -19
    println(arr.reduceRight(_ - _)) //1-（2-（3-（4-（5-6））））=-3
    println(arr.foldLeft(10)(_ - _)) //10-1-2-3-4-5-6:给了起始元素
    println(arr.foldRight(10)(_ - _)) //(1-(2-(3-(4-(5-(6-10)))))=7
  }

  f2()
}
