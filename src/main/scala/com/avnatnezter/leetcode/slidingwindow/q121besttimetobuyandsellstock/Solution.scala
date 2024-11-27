package com.avnatnezter.leetcode.slidingwindow.q121besttimetobuyandsellstock

object Solution {
  def maxProfit(prices: Array[Int]): Int = {
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

  def maxProfit2Pointers(prices: Array[Int]): Int = {
    var (l,r) = (0, 1)
    var profit = 0

    while (r < prices.length) {
      if (prices(l) < prices(r))
        profit = math.max(prices(r) - prices(l), profit)
      else
        l = r

      r += 1
    }

    profit
  }
}
