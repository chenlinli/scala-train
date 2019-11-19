package com.cl.scala.advance.c1

object ImplementationTest  extends App{
  def f1(): Unit ={
    class Student{
      val classNumber:Int = 10
      val classScore:Array[Int]=new Array[Int](classNumber)

      override def toString = s"Student($classNumber, $classScore)"
    }

    class PEStudent extends Student{
      //重写课程门数
      override val classNumber: Int = 3
    }

    val stu = new Student
    println(stu.classNumber)  //10
    println(stu.classScore.length)  //10

    val pes  = new PEStudent
    //子类调用父类无参数构造，classScore使用到了子类重写的classNumber,
    // 这时classNumber的getter方法会被重写,返回默认值0
    //然后父类这时的classScore的长度就是0
    // 父类初始化没问题
    //这时初始化自己的构造代码，classNumer=3,继承父类的classScore(length=0)
    println(pes.classNumber)  //应该是3
    println(pes.classScore.length)  //0

  }

  //f1()

  def f2(): Unit ={
    class Student{
      val classNumber:Int = 10
      val classScore:Array[Int]=new Array[Int](classNumber)

      override def toString = s"Student($classNumber, $classScore)"
    }
    //
    class PEStudent extends{
      //重写课程门数
      override val classNumber: Int = 3
    } with Student

    val stu = new Student
    //调用无参构造：classNumber=10,classScore.length=10
    println(stu.classNumber)  //10
    println(stu.classScore.length)  //10

    val pes  = new PEStudent
    //会先执行自己的override的变量的赋值，这时会创建一个classNumber是一个独立的变量（不是this.classNumber），不是属性
    //执行父类的构造，自己的classNumber已经是3,然后执行父类的classNumber=10.执行classScore赋值的时候，会去取子类的classNumber=3
    //至此，子类构造方法执行完毕，classNumber=3，classScore.length=3
    println(pes.classNumber)  //应该是3
    println(pes.classScore.length)  //3

  }

//  f2()
  //对象相等
  def f3(): Unit ={
    class Product(val name:String,val price :Double){
      override def equals(obj: scala.Any) ={
        val that = obj.asInstanceOf[Product]
        if(that==null)
           false
        else  (name==that.name && price==that.price)
      }

      override def hashCode(): Int ={
        13*name.hashCode+17*price.hashCode()
      }

    }

    val p1 = new Product("p1",12)
    val p2 = new Product("p1",12)
    println(p1==p2)
    println(p1.equals(p2))
    val p3 = p2
    println(p2==p3)
    val p4 = new Product("p4",12)
    println(p4.equals(p2))
  }

  f3()
}
