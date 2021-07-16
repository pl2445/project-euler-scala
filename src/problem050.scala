object problem050 {
  lazy val primes: LazyList[Int] = 2 #:: LazyList
    .from(3)
    .filter(i => primes.takeWhile(j => j * j <= i).forall(i % _ > 0))
  def main(args: Array[String]): Unit = {
    val p = primes.takeWhile(_ < 1000000).toList
    val upperLimit =
      (1 to 10000).find(n => p.take(n).sum >= 1000000).get
    val r = (1 to upperLimit)
      .map(n => {
        val s = p
          .sliding(n)
          .takeWhile(_.sum < 1000000)
          .find(lst => p.contains(lst.sum))
        if (s.isDefined) (n, s.get.sum) else (-1, -1)
      })
      .filter(t => t._1 > 0)
    println(r)
  }
}
