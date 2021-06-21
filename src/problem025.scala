object problem025 {
  def main(args: Array[String]): Unit = {
    lazy val fib: Stream[BigInt] =
      BigInt(0) #:: BigInt(1) #:: fib.zip(fib.tail).map(t => t._1 + t._2)
    val r = fib.takeWhile(n => n.toString().size < 1000).size
    println(r)
  }

}
