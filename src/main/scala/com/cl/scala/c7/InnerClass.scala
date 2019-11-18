package com.cl.scala.c7
import scala.collection.mutable.ArrayBuffer
object InnerClass extends App{
  val c1 = new Class
  val s1 = c1.getStu("leo")  //c1的Stu类实例s1
  c1.students += s1

  val c2 = new Class
  val s2 = c2.getStu("leo")//c2的Stu类实例s2
  c2.students += s2

//  c1.students+=s2  //不能混加，不同外部类的实例的内部类不能乱加

}
class Class {

  class Stu(val name:String)
  val students =new ArrayBuffer[Stu]()
  def getStu(name:String): Stu ={
    new Stu(name)
  }
}