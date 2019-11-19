package com.cl.scala.advance.c1

object AnnotationTest extends App {

  class Test(var name:String) extends annotation.Annotation

  @Test(name="MyTest") class MyTest

  class Test2(var value:String) extends annotation.Annotation

  @Test2("myTest2") class Mytest2  //参数名value可以省略



}
