package com.cl.scala.advance.c1

import scala.xml.XML

object XmlIO extends App {
  import java.io._
  import scala.xml
  var booksxml = XML.loadFile("src/resources/books.xml")
  booksxml = XML.load(new FileInputStream("src/resources/books.xml"))
  booksxml = XML.load(new InputStreamReader(new FileInputStream("src/resources/books.xml")))

  println(booksxml.getClass) //class scala.xml.Elem
  //写外部文件
  XML.save("src/resources/books2.xml",booksxml)
}
