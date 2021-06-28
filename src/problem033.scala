object problem033 {
  def main(args: Array[String]): Unit = {
    val r = for {
      i <- 10 to 99; j <- 10 to 99;
      a = for {
        x <- 0 to 1; y <- 0 to 1;
        num = i.toString().charAt(x).asDigit.toDouble;
        denum = j.toString().charAt(y).asDigit.toDouble;
        m = i.toString().charAt(1 - x);
        n = j.toString().charAt(1 - y);
        pair = (i, j);
        b = num / denum
        if denum != 0 && m == n && b == (i.toDouble / j.toDouble) && i < j && (i % 10 != 0 || j % 10 != 0)
      } yield pair;
      res = if (a.size > 0) a(0) else (0, 0)
    } yield res
    var nums = r.filter(_._2 != 0)
    val productFraction =
      nums.scanLeft((1, 1))((t1, t2) => (t1._1 * t2._1, t1._2 * t2._2))
    println(nums)
    println(productFraction)
    //(387296, 38729600)
    //result is 100
  }
}
