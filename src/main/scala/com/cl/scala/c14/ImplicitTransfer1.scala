package com.cl.scala.c14

object ImplicitTransfer1 extends App{
  implicit def object2SpeicailPerson(obj:Object):SpeicalPerson={
    if(obj.isInstanceOf[Student]){
      val stu = obj.asInstanceOf[Student]
      new SpeicalPerson(stu.name)
    } else if(obj.isInstanceOf[Older]){
      val older = obj.asInstanceOf[Older]
      new SpeicalPerson(older.name)
    } else{
      null
    }
  }
  var count = 0
  //值接收SpecialPerson
  def buySpecialTicket(p:SpeicalPerson)={
    if(p!=null) {
      count += 1
      "T-" + count
    }else {
      "can't buy ticket here.."
    }
  }
  val t = new Teacher("ee")
  val s = new Student("leo")
  val o = new Older("tom")
  val sp = new SpeicalPerson("marry")
  println(buySpecialTicket(t))
  println(buySpecialTicket(s))
  println(buySpecialTicket(o))
  println(buySpecialTicket(sp))

}

//没有任何关系，Student,Order隐式转换
class SpeicalPerson(val name:String)
class Student(val name:String)
class Older(val name:String)
class Teacher(val name:String)

