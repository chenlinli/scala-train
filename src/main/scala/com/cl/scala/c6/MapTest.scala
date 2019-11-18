package com.cl.scala.c6

import scala.collection.mutable
import scala.collection.mutable.HashMap

object MapTest extends App {
  //Map不可变
  val ages = Map("Leo"->23,"Marry"->34,"Jack"->23)
  println(ages.getClass)

//  ages("Jack") = 33

  //可变Map
  val ages2 = scala.collection.mutable.Map("Leo"->23,"Marry"->34,"Jack"->23)
  ages2("Leo") = 31
  println(ages2)

  val ages3 = Map(("leo",20),("Jane",25),("Javl",23))
  println(ages3)

  //空Map
  val ages4 = new HashMap[String,Int]()

  //访问元素
  var age = ages("Leo")
  println(age)
//  age = ages("leo")
//  println(age) //元素不存在报错
  age = if(ages.contains("leo")) ages("leo") else 0
  println(age)
  //简便操作
  age = ages.getOrElse("leo",0)
  println(age)

  //可变map修改
  ages2("Leo") = 31
  println(ages2)

  //Map无序，添加元素
  ages2+=("Mike"->35,"Tom"->50)
  println(ages2)

  ages2-="Mike"
  println(ages2)

  println()
  //不可变Map
  //更新
  var ages5 = ages + ("Mike"->20,"Tome"->60)
  println(ages5)
  //修改：产生新的Map,ages没有改变
  ages5 = ages+("Leo"->30)
  println(ages5)

  println()
  //遍历
  for((key,value)<- ages ){
    println(key+" : "+value)
  }
  for(key<-ages.keySet){
    print(key+" ")
  }
  println()
  for(value<-ages.values){
    print(value+" ")
  }
  println()
  //原来什么Map(可变/不可变),生成的就是什么Map
  var ages6 = for((key,value)<-ages) yield (value,key)
  println(ages6)//key重复后面的覆盖前面的

  println()
  //key排序
  val ages7 = scala.collection.immutable.SortedMap("Leo"->23,"Marry"->34,"Jack"->23)
  println(ages7)

  ages4("leo") = 34
  ages4("jck") = 60
  ages4("tom") = 44
  println(ages4)

  //维护插入顺序
  val ages8 = new mutable.LinkedHashMap[String,Int]()
  ages8("leo") = 55
  ages8("jck") = 55
  ages8("tom") = 44
  println(ages8)

}
