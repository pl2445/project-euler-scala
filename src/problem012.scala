object problem012 {
  def main(args: Array[String]): Unit = {
    lazy val nums: Stream[Int] =
      0 #:: nums.zipWithIndex.map(n => n._1 + n._2 + 1)
    val r = nums.find(n => countFactor(n) > 500).get
    println(r)
  }

  def countFactor(num: Int): Int = {
    val a = Range(1, num)
      .takeWhile(n => n * n < num)
      .foldLeft(0)((a, b) => if (num % b == 0) a + 2 else a)
    a
  }
}
