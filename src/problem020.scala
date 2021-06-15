object problem020 {
  def main(args: Array[String]): Unit = {
    val r = (BigInt(1) to BigInt(100))
      .fold(BigInt(1)) { _ * _ }
      .toString
      .view
      .map(_.asDigit)
      .sum
    println(r)
  }
}
