object problem028 {
  def main(args: Array[String]): Unit = {
    val r = (1L to 3000L)
      .filter(n => n % 2L == 1L)
      .take(500)
      .flatMap(num => List.fill(4)(num))
      .map(_ + 1L)
      .scanLeft(1L)(_ + _)
      .sum
    println(r)
  }

}
