object problem047 {
  lazy val primes: LazyList[Int] = 2 #:: LazyList
    .from(3)
    .filter(i => primes.takeWhile(j => j * j <= i).forall(i % _ > 0))
  def main(args: Array[String]): Unit = {
    lazy val num = LazyList.from(1)
    val r = num.find(n => {
      foo(n, List()).distinct.size == 4 &&
        foo(n + 1, List()).distinct.size == 4 &&
        foo(n + 2, List()).distinct.size == 4 &&
        foo(n + 3, List()).distinct.size == 4
    })
    println(r)
  }

  def foo(num: Int, factors: List[Int]): List[Int] = {
    num match {
      case 1 => factors
      case x => {
        val r = primes.find(a => x % a == 0).get
        val next = r :: factors
        foo(x / r, next)
      }
    }
  }
}
