package com.cl.scala.c14

object ImplicitTransfer6 extends App{
  implicit var signPen = new SignPen //隐式值,作用域自动传入
  def signName(name:String)(implicit signPen:SignPen): Unit ={
    signPen.write(name+" come in time")
  }
  signName("leo")
}

class SignPen{
  def write(content:String)=println(content)
}


