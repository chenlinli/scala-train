package com.cl.scala.c4

object ConstructorApp {
  def main(args: Array[String]): Unit = {
//    val person  = new Worker("zhangsan",30)
//    println(person.name+" "+person.age+" "+person.school)
//
//    val person2  = new Worker("lisi",3,"male")
//    println(person2.name+" "+person2.age+" "+person2.school+" "+person2.gender)
//    person2.name = "lli"
//    person2 = new Worker("ooi",2,"f");

    val student = new Student("Pl",16,"Math")
    println(student.name+" "+student.age+" "+student.major) //不能获取专业
    println(student)
  }
}
//主构造器：
class Worker(var name:String,var age:Int){
  println("Worker enter")
  val school = "hust"
  var gender:String = _
  //附属构造器：
  def this(name:String,age:Int,gender:String){
    this(name,age)
    //附属构造器第一行必须调用主构造器或其他构造器
    this.gender = gender

  }
  println("Worker exit")
}
//继承，如果是子类特有的属性，父类没有，构造函数一定要声明var/val,否则子类外访问不到该属性
class Student(name:String,age:Int,val major:String) extends Worker(name ,age){
  println("Student exit")
  override  val school = "piking"  //父类有，则需要重写
  override def toString: String = {
    "override toString  "+school
  }
  println("Student exit")
}