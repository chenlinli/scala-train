package com.cl.scala.c14
import ImplicitTransfer1.object2SpeicailPerson

object ImplicitTransfer5 extends App{
  val th = new TicketHouse
  th.buySpecialTicket(new SpeicalPerson("leo"))
  th.buySpecialTicket(new Student("leo"))
  th.buySpecialTicket(new Teacher("jack"))
}

class TicketHouse{
  var ticketNumber = 0
  //接收SP,需要隐式转换
  def buySpecialTicket(p:SpeicalPerson){
    if(p!=null) {
      ticketNumber += 1
      println("T-" + ticketNumber)
    }else{
      println("buying failure")
    }
  }
}
