package com.cl.scala.c9

object TraitTest7 extends App {
  val p = new Person6("Jack")

  p.sayHello()

}
trait Logger2{
  def log(msg:String)
}
trait MyLogger extends Logger2{
  abstract override def log(msg:String): Unit ={
    //调用父类抽象方法，abstract override
    super.log(msg)
  }

}
