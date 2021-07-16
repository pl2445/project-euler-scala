object problem048 {
  val base = math.pow(10, 10).toLong
  def main(args: Array[String]): Unit = {
    val r = (1 to 1000).map(foo(_)).foldLeft(0L)((t, l) => t % base + l)
    println(r)
  }

  def foo(num: Int): Long = {
    List.fill(num)(num).map(_.toLong).foldLeft(1L)((t, l) => t % base * l)
  }
}
