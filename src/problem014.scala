object problem014 {
  def main(args: Array[String]): Unit = {
    val r = (1L to 1000000L).zipWithIndex
      .map(t => (foo(t._1).size, t._2 + 1))
      .maxBy(_._1)
      ._2
    println(r)
  }

  def foo(num: Long): List[Long] = {
    num match {
      case 1                    => List(1)
      case even if num % 2 == 0 => num / 2.toLong :: foo(num / 2.toLong)
      case odd                  => 3 * num + 1 :: foo(3 * num + 1)
    }
  }
}
