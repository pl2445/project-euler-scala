object problem10 {
  def main(args: Array[String]): Unit = {
    lazy val ps: Stream[Int] = 2 #:: Stream
      .from(3)
      .filter(i => ps.takeWhile(j => j * j <= i).forall(i % _ > 0))
    val r: Long = ps.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)
    println(r)
  }
}
