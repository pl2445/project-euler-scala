object problem046 {
  def main(args: Array[String]): Unit = {
    lazy val primes: LazyList[Int] = 2 #:: LazyList
      .from(3)
      .filter(i => primes.takeWhile(j => j * j <= i).forall(i % _ > 0))
    lazy val composites: LazyList[Int] = LazyList
      .from(1)
      .filter(num =>
        (2 to num).find(a => a * a <= num && num % a == 0).isDefined
      )
    val r = composites.find(a =>
      a % 2 == 1 &&
        primes
          .takeWhile(_ <= a)
          .forall(b =>
            (a - b) % 2 == 1 || (!math.sqrt((a - b) / 2.0).isValidInt)
          )
    )
    println(r)
  }
}
