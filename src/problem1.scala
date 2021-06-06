object problem1 {
  def main(args: Array[String]): Unit = {
    val r = (1 to 999).filter(x => x % 3 == 0 || x % 5 == 0).sum
    println(r)
  }
}
