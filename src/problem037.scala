object problem037 {
  lazy val primes: LazyList[Int] = 2 #:: LazyList
    .from(3)
    .filter(i => primes.takeWhile(j => j * j <= i).forall(i % _ > 0))

  def main(args: Array[String]): Unit = {
    val r = primes
      .takeWhile(_ < 1000000)
      .filter(num => num > 10 && foo(num))
      .toList
    println(r.sum)
  }

  def foo(num: Int): Boolean = {
    val lst = (1 to num.toString().length() - 1)
      .flatMap(n =>
        Array(
          num.toString().substring(0, n).toInt,
          num.toString().substring(n).toInt
        )
      )
    val mx = lst.max
    lst.forall(primes.takeWhile(_ <= mx).contains(_))
  }

}
