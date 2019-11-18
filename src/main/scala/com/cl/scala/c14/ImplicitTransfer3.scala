package com.cl.scala.c14

object ImplicitTransfer3 extends App{
  implicit def man2SperMan(man:Man):SuperMan = new SuperMan(man.name)

  val man = new Man("leo")
  man.emitLaster //直接调用本身没有的方法
}
class Man(val name:String)
class SuperMan(val name:String){
  def emitLaster = println("emit a laster")
}

