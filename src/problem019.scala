object problem019 {
  def main(args: Array[String]): Unit = {
    println(
      (1900 to 2000)
        .flatMap(y => Seq.fill(12)(y).zip(1 to 12))
        .map(t => getMonthDayCount(t._1, t._2))
        .scanLeft(0)((a, b) => (a + b) % 7)
        .slice(12, 1212)
        .count(_ == 6)
    )
  }

  def getMonthDayCount(year: Int, month: Int): Int = {
    month match {
      case 1  => 31
      case 2  => 28 + (if (isLeapYear(year)) 1 else 0)
      case 3  => 31
      case 4  => 30
      case 5  => 31
      case 6  => 30
      case 7  => 31
      case 8  => 31
      case 9  => 30
      case 10 => 31
      case 11 => 30
      case 12 => 31
    }
  }

  def isLeapYear(year: Int): Boolean = {
    if (year % 100 == 0) (year % 4 == 0 && year % 400 == 0) else year % 4 == 0
  }
}
