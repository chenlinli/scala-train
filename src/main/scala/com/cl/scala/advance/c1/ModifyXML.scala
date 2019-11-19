package com.cl.scala.advance.c1

import scala.xml._

object ModifyXML extends App {
  var books = <books><book>b1</book></books>
  //增加一个子元素
  books = books.copy(child = books.child++(<book>b2</book>))
  println(books)

  //添加属性
  var book = <book>b1</book>
  book = book % Attribute(null,"id","2",Null)
  println(book)
  //修改
  book = book % Attribute(null,"id","1",Null)
  println(book)

  //增加属性
  book = book % Attribute(null,"id","2",Attribute(null,"time","2010-12-1",Null))
  println(book)
}
