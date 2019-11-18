package com.cl.scala.c7

import scala.beans.BeanProperty

object SimpleClassTest {
  def main(args: Array[String]): Unit = {
//    val helloWorld = new HellloWorld
//    helloWorld.sayHello()
//    helloWorld.sayHello
//    println(helloWorld.getName)//不能加（），定义的时候没有()
    //helloWorld.name //private只能在类里面使用
//
    //    var d = new Student
    //    d.name //getter
    //    d.name = "K" //setter

//    val stu = new Student
//    stu.name
//    stu.name = "kk"
//
//    var stu2 = new Student2
//    stu2.updateName("lei")
//    println(stu2.name)

//    val s1 = new Student3
//    val s2 = new Student3
//    s1.age = 55
//    s2.age = 34
//    println(s1.olders(s2))

    val s = new Student5
    println(s.getMyAge)
    s.setMyAge(45)
  }
}

//类不用访问修饰符
class HellloWorld{
  //field
  private var name =  "heo"

  def sayHello(): Unit ={
    println("Helllo"+name)
  }
  //getter
  def getName = name
}

class Student{
  //生成public 的getter setter
  //var name = "leo"
  private var myName = "leo"  //private的getter and settter
  def name: Unit ={
    println("getter")
    "your name "+myName
  }
  def name_=(newName:String){
    println("you cannot edit youe name")
  }

}
class Student2{
  //生成public 的getter setter
  //var name = "leo"
  private var myName = "leo"  //private的getter and settter
  //部分条件改变
  def updateName(newName:String): Unit ={
    if(newName == "leo") myName = newName
    else println("you cannot access tot name "+newName)
  }
  //仅仅暴露getter
  def name ="your name:" + myName
}

class Student3{
  private var myAge = 8
  def age_=(newAge:Int): Unit ={
    if(newAge>0) myAge = newAge
    else
      println("Illegal age")
  }

  def age = myAge
  def olders(s:Student3): Boolean ={
    myAge>s.myAge  //可以访问其他类对象的private
  }
}

class Student4{
  private[this] var myAge = 8
  def age_=(newAge:Int): Unit ={
    if(newAge>0) myAge = newAge
    else
      println("Illegal age")
  }

  def age = myAge
  def olders(s:Student3): Boolean ={
//    myAge>s.myAge  //可以访问其他类对象的private
    true
  }
}

class Student5{

  @BeanProperty var myAge = 8
}