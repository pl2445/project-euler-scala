object problem038 {
  def main(args: Array[String]): Unit = {
    val r = (1L to 100000L)
      .map(bar(_))
      .filter(str =>
        str.size == 9 && str.distinct.size == 9 && !str.contains("0")
      )
      .max
    println(r)
  }

  def bar(num: Long): String = {
    (1L to 10L).map(_ * num).map(_.toString()).foldLeft("") {
      case (t, l) if t.size < 9 => t + l
      case (t, l)               => t
    }
  }
}
