object problem015 {
  def main(args: Array[String]): Unit = {
    println(foo(Seq.fill(20 + 1)(1L), 20))
  }

  def foo(row: Seq[Long], level: Int): Long = {
    if (level == 0) row.last else foo(row.scan(0L)(_ + _), level - 1)
  }
  /* Recursion, too expensive
  def foo(right: Int, down: Int): Int = {
    (right, down) match {
      case (0, 0) => 1
      case (a, 0) => foo(right - 1, 0)
      case (0, b) => foo(0, down - 1)
      case (a, b) => foo(right - 1, down) + foo(right, down - 1)
    }
  }
   */
}
