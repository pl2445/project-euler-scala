object problem021 {
  def main(args: Array[String]): Unit = {
    val r =
      (1 to 10000)
        .filter(n =>
          n == getSumOfDivisors(getSumOfDivisors(n)) && n != getSumOfDivisors(n)
        )
        .sum
    println(r)
  }

  def getSumOfDivisors(num: Int): Int = {
    (1 to num)
      .filter(n => n * n <= num && num % n == 0)
      .flatMap(n => if (n * n == num) Array(n) else Array(n, num / n))
      .sum - num
  }
}
