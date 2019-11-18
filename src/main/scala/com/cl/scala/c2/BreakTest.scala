package com.cl.scala.c2
import scala.util.control.Breaks._
object BreakTest extends App {

  breakable {
    var n = 10
    for (c <- "hello world") {
      if (n == 5) break;
      else
        print(c)
      n -= 1
    }
  }
}
