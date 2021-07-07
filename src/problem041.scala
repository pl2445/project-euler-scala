object problem041 {
  lazy val primes: LazyList[Int] = 2 #:: LazyList
    .from(3)
    .filter(i => primes.takeWhile(j => j * j <= i).forall(i % _ > 0))

  //sum(1 to 9) is 45, which is divisible by 3
  //sum(1 to 8) is 36, which is also divisible by 3
  //so the upper limit is 7654321
  def main(args: Array[String]): Unit = {
    var pms = primes.takeWhile(_<=7654321)
    val r = (1 to 7654321).reverse.find(num =>
      num % 2 == 1 && (1 to num.toString().size)
        .map(_.toString())
        .forall(num.toString().contains(_))&&pms.contains(num)
    ).get
    println(r)
  }
}
