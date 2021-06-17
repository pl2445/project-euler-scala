object problem022 {
  def main(args: Array[String]): Unit = {
    val r = scala.io.Source
      .fromFile("problem022names.txt")
      .mkString
      .split(",")
      .map(s => s.tail.reverse.tail.reverse)
      .sortWith(_ < _)
      .zipWithIndex
      .map(t =>
        (t._1.view
          .map(c => c.toLong - 'A'.toLong + 1L)
          .sum) * (t._2.toLong + 1L)
      )
      .sum
    println(r)
  }

}
