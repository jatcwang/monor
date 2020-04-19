package o

import k.{K1, K2}

object Main1 {
  def main(args: Array[String]): Unit = {
    println("Running o1")
    println(K1.call())
    println(K2.call())
  }
}
