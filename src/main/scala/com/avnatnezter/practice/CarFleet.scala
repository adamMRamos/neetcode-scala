package com.avnatnezter.practice

import scala.collection.mutable

object CarFleet {
  def main(args: Array[String]): Unit = {
    println(carFleet(12, Array(10,8,0,5,3), Array(2,4,1,1,3))) // 3
    println(carFleet(10, Array(3), Array(3))) // 1
    println(carFleet(100, Array(0,2,4), Array(4,2,1))) // 1
    println(carFleet(10, Array(6,8), Array(3,2))) // should be 2
    println(carFleet(10, Array(0,4,2), Array(2,1,3))) // should be 1
    println(carFleet(10, Array(8,3,7,4,6,5), Array(4,4,4,4,4,4))) // should be 6
    println(carFleet(10, Array(8,7), Array(4,4))) // should be 2
  }

  def carFleet(target: Int, position: Array[Int], speed: Array[Int]): Int = {
    val cars = (position zip speed).sorted.reverse

    def stepsToTarget(car: (Int, Int)): Double =
      (target - car._1).toFloat / car._2.toFloat

    val fleets = mutable.Stack.empty[(Int, Int)]
    fleets push cars.head
    for (car <- cars.tail) {
      if (stepsToTarget(car) > stepsToTarget(fleets.top))
        fleets push car
    }

    fleets.size
  }

  def carFleetNoStack(target: Int, position: Array[Int], speed: Array[Int]): Int = {
    val cars = (position zip speed).sorted.reverse

    def stepsToTarget(car: (Int, Int)): Double =
      (target - car._1).toFloat / car._2.toFloat

    var fleets = 1
    var prevCar = cars.head
    for (car <- cars.tail) {
      if (stepsToTarget(car) > stepsToTarget(prevCar)) {
        prevCar = car
        fleets += 1
      }
    }

    fleets
  }
}
