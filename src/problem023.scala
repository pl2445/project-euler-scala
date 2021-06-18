object problem023 {
  def main(args: Array[String]): Unit = {
    val abns = (1 to 28123).filter(n => (1 to n / 2).filter(n % _ == 0).sum > n)
    val exc = abns.view.flatMap { a =>
      abns.takeWhile(_ <= 28123 - a).map(_ + a)
    }
    var r = (1 to 28123 diff exc).sum
    println(r)
  }
}
