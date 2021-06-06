object problem3 {
  def main(args: Array[String]): Unit = {
    println(factors(600851475143L).last)
    println(factors(72L))
  }
  //note:
  //if a number has max prime factor, then the max factor must be composite of the max prime factor
  def factors(n: Long): List[Long] = (2 to math.sqrt(n).toInt)
    .find(n % _ == 0)
    .fold(List(n))(i => i.toLong :: factors(n / i))
}
