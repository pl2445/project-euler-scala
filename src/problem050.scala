object problem050 {
  lazy val primes: LazyList[Int] = 2 #:: LazyList
    .from(3)
    .filter(i => primes.takeWhile(j => j * j <= i).forall(i % _ > 0))
  def main(args: Array[String]): Unit = {
    println(primes.takeWhile(_ < 1000000).toList.size)
  }
}
