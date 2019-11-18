package com.cl.scala.c11

object CollectionTest1 extends App{
  //不可变
  val list = List(1,2,3,4) // = List.apply(1,2,3,4)
  println(list.getClass)
  println(list.mkString(" "))
  println(list.head)
  println(list.tail)
  //::  合并head和tail
  println(0::list)

  def decorator(l:List[Int],prefix:String): Unit ={
    if(l!=Nil){
      println(prefix+l.head)
      decorator(l.tail,prefix)
    }
  }

  decorator(list,"*")

}
