object problem030 {
  def main(args: Array[String]): Unit = {
    val r = (2 to 10000000)
      .filter(a =>
        a == a.toString().view.map(d => math.pow(d.asDigit, 5).toInt).sum
      )
      .sum
    println(r)
  }
}
