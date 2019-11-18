package com.cl.scala.c11

object CollectionTest2 extends App{
  var list = scala.collection.mutable.LinkedList(1,2,3,4,5)
  println(list.elem)
  println(list.next)

  //每个元素乘二
  var currentList = list
  while (currentList!=Nil){
    currentList.elem = currentList.elem*2
    currentList = currentList.next
  }
  println(currentList)
  println(list)
  //每隔一个元素乘二
  list = scala.collection.mutable.LinkedList(1,2,3,4,5,6,7,8,9,10,11)
  currentList = list
  var first = true
  while (currentList!=Nil && currentList.next!=Nil){
    if(first) {
      currentList.elem *= 2
      first = false
    }
    currentList = currentList.next.next //可能是Nil，
    if(currentList!=Nil){
      currentList.elem *=2
    }

  }
  println(list )
}
