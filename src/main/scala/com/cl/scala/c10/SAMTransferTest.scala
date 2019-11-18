package com.cl.scala.c10

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.JButton

object SAMTransferTest extends App {
 val button = new JButton("Click")
  button.addActionListener(new ActionListener {
    override def actionPerformed(e: ActionEvent): Unit ={
      println("Clike me")
    }
  })
  //不能传直接函数
  //button.addAncestorListener((event:ActionEvent)=>println("Click me"))

  //接收函数(参数ActionEvent，返回Unit)，返回ActionListener
  implicit def convertActionListener(actionProcessFunc:(ActionEvent)=>Unit) =
    new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit =
        actionProcessFunc(e)
    }
  //匿名函数(event:ActionEvent) => println("Clice me")被传入convertActionListener，转换为返回ActionListener
  //而button.addActionListener()参数是ActionListener，而ActionListener的方法actionPerformed里实现
  //的是传入匿名函数的调用，所以经过转换，可以接收一个匿名函数，匿名函数的函数体，就是原本监听后需要执行的内容
  button.addActionListener((event:ActionEvent) => println("Clice me"))
}
