package com.cl.scala.advance.c1
import scala.util.control.Breaks._
object BreakWhile extends App{
  def fun1() {
    var flag = true
    var res = 0
    var n = 0
    while (flag) {
      res += n
      n += 1
      if (n == 5) {
        flag = false
      }
    }
    println(res)
  }

  fun1()
  //bolean
  def fun2(): Unit ={
    var flag = true
    var res = 0
    for(i<-0 until(10) if flag){
      res+=i
      if(i==4){
        flag = false
      }
    }
    println(res)
  }

  fun2()

  //嵌套函数使用return
  def fun3(): Unit ={
    var res = 0
    def add_inner(): Unit ={
      for(i<-0 until(10)){
        if(i==5){
          return
        }
        res+=i
      }
    }
    add_inner()
    println(res)

  }

  fun3()

  //Breaks对象的break()
  def fun4(): Unit ={
    var res = 0
    breakable(
      for(i<-0 until(10)){
        if(i==5){
          break()
        }
        res+=i
      }
    )
    println(res)
  }
   fun4()

}
