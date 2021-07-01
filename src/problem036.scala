object problem036 {
  def main(args: Array[String]): Unit = {
    val r = (1 to 1000000)
      .filter(num =>
        num
          .toString()
          .equals(num.toString().reverse.toInt.toString()) && num.toBinaryString
          .equals(
            Integer.parseInt(num.toBinaryString.reverse, 2).toBinaryString
          )
      )
      .sum
    println(r)
  }
}
