package com.cl.scala.advance.c1

object UnApplyTest extends App {
  class Person(val name: String, val age: Int)

  object Person {

    def apply(name: String, age: Int) = new Person(name, age)

    //提取器：str解析成类的各个字段
    def unapply(str: String) = {
      val splitIndex = str.indexOf(" ")
      if (splitIndex == -1) None

      else Some((str.substring(0, splitIndex), str.substring(splitIndex + 1)))
    }
  }

  val p = Person("leo",13)
  println(p.name)
  var str = "leo 13"
  val pstr = Person.unapply(str)
  println(pstr)
//  str = "leo"
  val Person(name,age)= str  //隐式调用unapply()
  println(name+","+age)


}
