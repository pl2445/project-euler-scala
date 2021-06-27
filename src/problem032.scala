object problem032 {
  def main(args: Array[String]): Unit = {
    val res = for {
      a <- 2 to 10000; b <- 2 to 10000;
      m = a * b; s = a.toString() + b + m
      if s.length() == 9 && (1 to 9).mkString.forall(s.contains(_))
    } yield m

    var r = res.distinct.sum
    println(r)
  }

}
