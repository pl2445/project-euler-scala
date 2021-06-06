object problem6 {
  def main(args: Array[String]): Unit = {
    val sqSum = (1 to 100).map(x => x * x).sum
    val sumSq = (1 to 100).sum * (1 to 100).sum
    val diff = sumSq - sqSum
    println(diff)
  }
}
