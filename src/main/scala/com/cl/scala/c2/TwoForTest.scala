package com.cl.scala.c2

object TwoForTest extends App{
  for(i<-1 to 9){
    for(j<-1 to 9){
      if(j==9){
        println(i*j)
      }else{
        print(i*j+" ")
      }
    }
  }

  println()
  for(i<-1 to 20 if i%2==0){
    print(i+" ")
  }

}
