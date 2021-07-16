object problem049 {
  lazy val primes: LazyList[Int] = 2 #:: LazyList
    .from(3)
    .filter(i => primes.takeWhile(j => j * j <= i).forall(i % _ > 0))
  def main(args: Array[String]): Unit = {
    val r = (0 until 10)
      .flatMap(n => List.fill(4)(n))
      .combinations(4)
      .map(i => i.permutations.toList.map(lst => lst.mkString("").toInt))
      .map(ilst => {
        ilst
          .combinations(3)
          .find(combo =>
            combo.forall(
              primes.takeWhile(_ <= combo.max).contains(_)
            ) && isSeqNums(combo)
          )
      })
      .filter(_.isDefined)
      .toList
    println(r)
  }

  def isSeqNums(iter: List[Int]): Boolean = {
    val tmp = iter.sorted
    tmp(1) - tmp(0) == tmp(2) - tmp(1)
  }
}
