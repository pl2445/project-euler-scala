object problem016 {
  def main(args: Array[String]): Unit = {
    val r = BigInt(2).pow(1000).toString().view.map(_.asDigit).sum
    println(r)
  }

}
