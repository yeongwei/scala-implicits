package com.example

import scala.util.Random

/*
 * Resources
 * 1. http://docs.scala-lang.org/tutorials/FAQ/finding-implicits.html
 */
object Main {  
  implicit val id = Random.nextInt(999) // This matches argument for foo
  
  def main(args: Array[String]): Unit = {  
    println(foo)
    
    val b = bar(123)
    println(s"${b} -> ${b.getClass()}")
  }
  
  def foo(implicit id: Int) = id
  def bar[T](i: T)(implicit conv: T => Double) = i // need better example here
}