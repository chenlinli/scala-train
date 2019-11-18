package com.cl.scala.c2

object WhileTest extends App {
  var n = 4
  while (n>1){
    print(n+" ")
    n-=1
  }
  println()
  for(i <- 1 to 10){
    print(i+" ")
  }

  println()
  for(i<-1 until 10){
    print(i+" ")
  }
  println()
  //增强for
  for(c<-"Hello worlfd"){
    print(c+" ")
  }

}
