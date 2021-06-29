object problem034 {
  def main(args: Array[String]): Unit = {
    val r = (3L to 100000000L)
      .filter(num =>
        num.toString().view.map(d => factorial(d.asDigit.toLong)).sum == num
      )
      .sum
    println(r)
  }

  def factorial(num: Long): Long = {
    num match {
      case 0L => 1L
      case 1L => 1L
      case 2L => 2L
      case 3L => 6L
      case 4L => 24L
      case 5L => 120L
      case 6L => 720L
      case 7L => 5040L
      case 8L => 40320L
      case 9L => 362880L
      case _  => 0L
    }
  }

}
