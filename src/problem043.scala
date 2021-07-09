object problem043 {
  def main(args: Array[String]): Unit = {
    val r = "0123456789"
      .toCharArray()
      .toList
      .permutations
      .map(_.mkString(""))
      .filter(num =>
        num.charAt(0) != '0' && num.tail
          .sliding(3)
          .toList
          .zip(List(2, 3, 5, 7, 11, 13, 17))
          .forall(t => t._1.toInt % t._2 == 0)
      )
      .toList.map(_.toLong).sum
    println(r)
  }

}
