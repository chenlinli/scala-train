package com.cl.scala.advance.c1

object RegexTest extends App {
  val p1 = "[a-z]+".r
  println(p1.getClass) //class scala.util.matching.Regex

  //匹配
  val str = "hello 123 world 456"
  for(matchStr<-p1.findAllIn(str)){
    println(matchStr)
  }

  //”hello world“里匹配的部分替换
  println(p1.replaceAllIn("hello world","replacement"))


}
