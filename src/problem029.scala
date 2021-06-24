object problem029 {
  def main(args: Array[String]): Unit = {
    val r =
      (2 to 100).flatMap(a => (2 to 100).map(b => math.pow(a, b))).distinct.size
    println(r)
  }
}
