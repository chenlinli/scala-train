package com.cl.scala.advance.c1

import scala.collection.mutable.ArrayBuffer

object InnerClassScope extends App{


  def func1(): Unit ={
    class Class{
      class Student(val name:String)
      val stus = new ArrayBuffer[Student]()
      def register(name:String): Student ={
        new Student(name)
      }
    }
    val c1 = new Class
    val leo = c1.register("leo")
    c1.stus+=leo

    val c2 =new Class
    val jack = c2.register ("jack")
    //c1.stus+=jack //不同对象的内部类是不同的类
  }
  //func1()

  //扩大内部类作用域：伴生对象
  def func2(): Unit ={
    object Class{
      class Student(val name:String)
    }
    class Class{

      val stus = new ArrayBuffer[Class.Student]()
      def register(name:String): Class.Student ={
        new Class.Student(name)
      }
    }
    val c1 = new Class
    val leo = c1.register("leo")
    c1.stus+=leo

    val c2 =new Class
    val jack = c2.register("jack")
    c1.stus+=jack //不同对象的内部类是不同的类
  }

  //func2()

  //扩大内部类作用域：类型投影
  def func3(): Unit ={
    class Class{
      class Student(val name:String)
      val stus = new ArrayBuffer[Class#Student]()
      def register(name:String): Class#Student ={
        new Student(name)
      }
    }
    val c1 = new Class
    val leo = c1.register("leo")
    c1.stus+=leo

    val c2 =new Class
    val jack = c2.register("jack")
    c1.stus+=jack //不同对象的内部类是不同的类
  }

  //func3()
  //内部类获取外部类引用
  def func4(): Unit ={
    class Class(val name:String){outer=>
      class Student(val name:String){
        def introduceMyself(): Unit ={
          println("hello ,I 'm "+name+"I'm happy to join "+outer.name)
        }
      }
      def register(name:String): Class#Student ={
        new Student(name)
      }
    }
    val c1 = new Class("c1")
    val leo = c1.register("leo")
    leo.introduceMyself()
  }
  func4()
}
