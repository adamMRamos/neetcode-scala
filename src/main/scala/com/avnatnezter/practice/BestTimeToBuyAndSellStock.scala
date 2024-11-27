package com.avnatnezter.practice

object BestTimeToBuyAndSellStock {
  def main(args: Array[String]): Unit = {
    println(maxProfit(Array(7,1,5,3,6,4)))
    println(maxProfit(Array(7,6,4,3,1)))
  }

  private def maxProfit(prices: Array[Int]): Int = {
    var buy = prices.head
    var profit = 0

    for (price <- prices) {
      if (price > buy)
        profit = math.max(price - buy, profit)
      else
        buy = price
    }

    profit
  }
}
