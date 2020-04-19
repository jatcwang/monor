package o

import k.{K2, K3}

object Main2 {
  def main(args: Array[String]): Unit = {
    println("Running o2")
    println(K2.call())
    println(K3.call())
  }
}
