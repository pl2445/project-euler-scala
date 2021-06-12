object problem017 {
  val digitMap = Map(
    "1" -> "One",
    "2" -> "Two",
    "3" -> "Three",
    "4" -> "Four",
    "5" -> "Five",
    "6" -> "Six",
    "7" -> "Seven",
    "8" -> "Eight",
    "9" -> "Nine"
  )

  val tenPlusMap = Map(
    "10" -> "Ten",
    "11" -> "Eleven",
    "12" -> "Twelve",
    "13" -> "Thirteen",
    "14" -> "Fourteen",
    "15" -> "Fifteen",
    "16" -> "Sixteen",
    "17" -> "Seventeen",
    "18" -> "Eighteen",
    "19" -> "Nineteen"
  )

  val tens = Map(
    "2" -> "Twenty",
    "3" -> "Thirty",
    "4" -> "Forty",
    "5" -> "Fifty",
    "6" -> "Sixty",
    "7" -> "Seventy",
    "8" -> "Eighty",
    "9" -> "Ninety"
  )

  val hundredAnd = "hundredand"
  val hundred = "hundred"

  def main(args: Array[String]): Unit = {
    val r = (1 to 1000).map(_.toString()).map(getLen(_)).sum
    println(r)
  }

  def getLen(num: String): Long = {
    if (num.matches("[1-9]")) {
      return digitMap.get(num).get.size.toLong
    }
    if (num.matches("1[0-9]")) {
      return tenPlusMap.get(num).get.size.toLong
    }
    if (num.matches("[0-9][0-9]")) {
      return tens
        .get(num.charAt(0).toString())
        .getOrElse("")
        .size
        .toLong + digitMap
        .get(num.charAt(1).toString())
        .getOrElse("")
        .size
        .toLong
    }
    if (num.matches("[1-9]00")) {
      return digitMap
        .get(num.charAt(0).toString())
        .get
        .size
        .toLong + hundred.size.toLong
    } else if (num.matches("[1-9][0-9][0-9]")) {
      return digitMap
        .get(num.charAt(0).toString())
        .get
        .size
        .toLong + hundredAnd.size.toLong + getLen(
        num.substring(1)
      )
    } else {
      return 11L
    }
  }
}
