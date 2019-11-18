package com.cl.scala.c13

object TypeArgs8 extends App {
  //传入多种食物放到数组里
  def packageFood[T:Manifest](food:T*) ={
    val foodPackage = new Array[T](food.length)
    for(i<- 0 until food.length){
      foodPackage(i) = food(i)
    }
    foodPackage
  }

  val f1 = new Meat("牛肉")
  val f2 = new Vegetable("胡萝不")
  val f4 = new Vegetable("青菜")
  val f3 = new Meat("回归鱼")
  val pack = packageFood(f1,f3) //只能放相同类型的
  println(pack.getClass)
  for(ele<-pack){
    println(ele.name)
  }
  val pack2 = packageFood(f2,f4)
  for(ele<-pack2){
    println(ele.name)
  }
}
class Meat(val name:String)
class Vegetable(val name:String)

