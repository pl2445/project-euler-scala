object problem027 {
  lazy val primes: Stream[Int] = 2 #:: Stream
    .from(3)
    .filter(i => primes.takeWhile(j => j * j <= i).forall(i % _ > 0))

  def isPrime(num: Int): Boolean = {
    primes.view.takeWhile(_ <= num).contains(num);
  }

  def main(args: Array[String]): Unit = {
    val x = (-999 until 1000)
      .flatMap { a =>
        (-999 until 1000).map(b =>
          (
            a,
            b,
            (0 to 1000).view
              .takeWhile(n => isPrime(n * n + a * n + b))
              .length
          )
        )
      }
    val y = x.reduceLeft((a, b) => if (a._3 > b._3) a else b)
    var r = y._1 * y._2
    println(r)

  }
}
