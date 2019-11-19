package com.cl.scala.advance.c1

object XmlTest extends App {
  def f1() {
    var books = <books>
      <book>b1</book>
    </books>
    println(books.getClass) //Elem：元素
    println(books.label) //标签名
    println(books.child) //ArrayBuffer(<book>b1</book>)

    books = <books>
      <book>b1</book> <book>b2</book>
    </books>
    println(books)
    println(books.child) //ArrayBuffer(<book>b1</book>, <book>b2</book>)

    val b = <book>boo1</book> <book>boo2</book> //平级元素
    println(b.getClass) //NodeBuffer

    //NodeBuffer-->XMl文档
    println()
    import scala.xml._
    val b2 = new NodeBuffer()
    b2 += <book>b1</book>
    b2 += <book>b2</book>
    val books2: NodeSeq = b2 //b2强转
    println(books2) //拿到xml文档
    println(books2.getClass)

    //属性
    println()
    val b3 = <book id="1" price="12">b1</book>
    println(b3.attributes("id").text) //属性值
    for (attr <- b3.attributes) {
      println(attr)
    }

    println(b3.attributes.asAttrMap.mkString("\n"))
  }

  def f2(): Unit ={
    import scala.xml._
    val books = Array("b1","b2")
    val booksXml = <books><book>{books(0)}</book><book>{books(1)}</book></books>
    println(booksXml)
  }

  def f3(): Unit ={
    import scala.xml._
    val books = Array("b1","b2")
    val booksXml = <books>{
      for(book<-books)
        yield <book>{book}</book>
      }</books>

    println(booksXml)
  }
//  f2()
//  f3()
  def f4(): Unit ={
   //xml属性
  val bookIds = Map("b1"->"1","b2"->"2")
  val booksXMl = <books>{
    for((name,id) <- bookIds)
      yield <book id={id}>{name}</book>
    }</books>
  println(booksXMl)
  }
  f4()
}
