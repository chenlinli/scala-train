package com.cl.scala.advance.c1

object NArray extends App {
  def func1() {
    //构造二维数组
    var multiDimArr1 = Array.ofDim[Double](3, 4)
    multiDimArr1(0)(0) = 1.0
    multiDimArr1(2)(0) = 1
    for (arr <- multiDimArr1) {
      for (n <- arr) {
        print(n + " ")
      }
      println()
    }
    println()

    //不规则数组
    var multiDimArr2 = new Array[Array[Int]](3)
    multiDimArr2(0) = new Array[Int](1)
    multiDimArr2(1) = new Array[Int](2)
    multiDimArr2(2) = new Array[Int](3)

    multiDimArr2(2)(2) = 3

    for (arr <- multiDimArr2) {
      for (n <- arr) {
        print(n + " ")
      }
      println()
    }
  }

  def func2(): Unit ={
    import scala.collection.JavaConversions.bufferAsJavaList
    import scala.collection.mutable.ArrayBuffer
    val command = ArrayBuffer("javac","src/resources/HelloWorld.java")
    val processBuilder = new ProcessBuilder(command) //会把command[ArrayBuffer]-->ArrayList
    val process = processBuilder.start()
    var res = process.waitFor()
    println(res)
    import scala.collection.JavaConversions.asScalaBuffer
    val cmd = processBuilder.command() //返回的ArrayList-->ArrayBuffer
    println(cmd)
  }

  func2()


}
