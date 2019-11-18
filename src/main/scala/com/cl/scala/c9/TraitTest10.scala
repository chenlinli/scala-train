package com.cl.scala.c9

object TraitTest10 extends App {
  val p = new {
    val msg:String = "init"
  }with Person11 with SayHello4
  //所有构造初始化前，重写了msg

  val p2 = new Person12
  val p3 = new Person13
}

trait SayHello4{
  val msg:String
  //没有初始化
  println(msg.toString)
}

//先trait构造执行，就msg没初始化，trait构造 报错
class Person10 extends SayHello4 {
  override val msg = "init"
}


class Person11

//方法2
class Person12 extends {
  val msg:String = "init" //提前定义
}with SayHello4

//方法3
trait SayHello5{
  lazy val msg:String = null
  //没有初始化
  println(msg.toString)
}

class Person13 extends SayHello5 {
  override lazy val msg = "init"
}
