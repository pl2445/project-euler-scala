import scala.runtime.LazyInt
object problem035 {
  lazy val primes: LazyList[Int] = 2 #:: LazyList
    .from(3)
    .filter(i => primes.takeWhile(j => j * j <= i).forall(i % _ > 0))

  def main(args: Array[String]): Unit = {
    val primesUnderOneMillion = primes.takeWhile(_ <= 1000000)
    val r = (3 to 1000000)
      .filter(_ % 2 == 1)
      .filter(num =>
        allOddDigit(num) &&
          getRotations(num)
            .forall(
              primesUnderOneMillion
                .contains(_)
            )
      )
    println(r.size + 1)
  }

  def allOddDigit(num: Int): Boolean = {
    num.toString().toCharArray().map(_.toInt).forall(n => n % 2 == 1 || n == 2)
  }

  def getRotations(num: Int): Seq[Int] = {
    (0 to num.toString().size - 1)
      .map(ind =>
        num.toString().substring(ind) + num.toString().substring(0, ind)
      )
      .map(str => str.toInt)
  }

}
