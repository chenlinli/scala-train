package com.cl.scala.c9

object TraitTest5 extends App {
  val p = new Person5("Jack")
  val p2 = new Person5("Jack") with MyLogged //混入triat
  p2.sayHello()
  println()
  p.sayHello()

}
trait Logged{
  def log(msg:String){}
}
trait MyLogged extends Logged{
  override def log(msg:String){println("log:"+msg)}
}

class Person5(val name:String) extends Logged{
  def sayHello(): Unit ={
    println("Hi ,I am "+name)
    log("sayHello is invoked") //默认调用的Logged的log
  }
}