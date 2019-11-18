package com.cl.scala.c4

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    //左边的类型一定是var/val
    val person = new Person()
    person.name="May"
    //person.age = 11,不能改常量
    println(person.name+" "+person.age)
    println(person.eat)
    person.football("Barcelona")
    person.printInfo()
//    println(person.gender)
  }
}

private class Person{
  //属性
  var name:String=_
  val age:Int=10
  //var自动生成get set
  //val自动生成get
  //private [this]:修饰只能类内部使用
  private [this] val gender = "male"

  def printInfo(): Unit ={
    println("gender:"+gender)
  }
  def eat():String={
    name+" eating...."
  }

  def football(teamName:String): Unit ={
    println(name+" is watching match of "+teamName)
  }
}