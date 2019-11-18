package com.cl.scala.c3

import java.io.IOException

object ExceptionTest extends App {
  try{
    throw new IllegalArgumentException("illegal args")
  }catch {
    case _:IllegalArgumentException=>println("error")
  }finally {
    println("release")
  }
  try{
    throw new IOException("io args")
  }catch {
    case e1:IllegalArgumentException=>println("error")
    case e2:IOException=>println("io error")
  }finally {
    println("release")
  }
}
