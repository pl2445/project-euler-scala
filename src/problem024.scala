object problem024 {
  def main(args: Array[String]): Unit = {
    var r = getPermutation("0123456789").drop(999999).next().toLong
    println(r)
  }

  def getPermutation(s: String): Iterator[String] =
    if (s.length() == 1) Iterator(s)
    else
      s.toIterator.flatMap(c => getPermutation(s.filterNot(_ == c)).map(c + _))
}
