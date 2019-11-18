package com.cl.scala.c9

object TraitTest6 extends App {
  val p = new Person6("Jack")

  p.sayHello()

}
trait Handler{
  def handle(data:String){}
}
trait DataValidHandler extends Handler{
  override def handle(data: String): Unit = {
    println("check data:"+data)
    super.handle(data)
  }

}

trait SignatureValidHandler extends Handler{
  override def handle(data: String): Unit = {
    println("check signature :"+data)
    super.handle(data)
  }

}
//trait从右到左调用handler
class Person6(val name:String) extends SignatureValidHandler with DataValidHandler {
  def sayHello(): Unit ={
    println("Hi ,I am "+name)
    handle(name)
  }
}