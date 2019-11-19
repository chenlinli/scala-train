package com.cl.scala.advance.c1
import java.io._

import scala.io.Source
object FileOperation extends App {

  //读文件每一行
  def f1(): Unit ={
    val source = Source.fromFile("src/resources/HelloWorld.java","utf-8")
    val lineIt = source.getLines()
    for(line <- lineIt){
      println(line)
    }
    source.close()
  }

//  f1()
  //读文件每一行
  def f2(): Unit ={
    val source = Source.fromFile("src/resources/HelloWorld.java","utf-8")
    val lines = source.getLines().toArray  //getLines只能调用一次,调用完就没有了
    for(line <- lines){
      println(line)
    }
    source.close()
  }
//  f2()

  def f3(): Unit ={
    val source = Source.fromFile("src/resources/HelloWorld.java","utf-8")
    val lines = source.mkString  //getLines只能调用一次,调用完就没有了
    println(lines)
    source.close()
  }
//  f3()
  //遍历每个字符

  def f4(): Unit ={
    val source = Source.fromFile("src/resources/HelloWorld.java","utf-8")
   for(c<-source){
     println(c+" ")
   }
    source.close()
  }
//  f4()
  def f5(): Unit ={
    val source = Source.fromURL("http://www.baidu.com","utf-8")
   println(source.mkString)
    source.close()
  }
//  f5()

  //拷贝文件
  def f6(): Unit ={
    import java.io._
    val fis = new FileInputStream(new File("src/resources/HelloWorld.java"))
    val fos = new FileOutputStream(new File("src/resources/HW.java"))
    val buf = new Array[Byte](fis.available())
    fis.read(buf)
    fos.write(buf,0,buf.length)
    fis.close()
    fos.close()
  }

//  f6()
  //写文件
  def f7(): Unit ={
    import java.io._
    val pw= new PrintWriter("src/resources/test.txt")
    pw.println("hello world")
    pw.close()
  }

//  f7()
  //递归遍历子目录
  def f8(): Unit ={
    import java.io._
    def getStubIterator(dir:File): Iterator[File] ={
      val childDirs = dir.listFiles().filter(_.isDirectory)
      childDirs.iterator ++ childDirs.toIterator.flatMap(getStubIterator(_))
    }

    val it = getStubIterator(new File("E:\\Data\\scalaProj\\scala-train"))
    for( d<-it){
      println(d)
    }
  }

//  f8()
  //序列化和反序列化
  def f9(): Unit ={
    import java.io._
    @SerialVersionUID(1L) class Person(val name:String) extends Serializable{}
    val leo = new Person("leo")
    //序列化
    val oos = new ObjectOutputStream(new FileOutputStream(("src/resources/p.obj")))
    oos.writeObject(leo)
    oos.close()

    val ois = new ObjectInputStream(new FileInputStream("src/resources/p.obj"))
    val leo2 = ois.readObject().asInstanceOf[Person]
    println(leo2.name)
    println(leo==leo2)
  }

  f9()
}

