object problem2 {
  def main(args: Array[String]) = {
    lazy val fibs: Stream[Int] = 0 #:: 1 #:: (fibs zip fibs.tail).map { t =>
      t._1 + t._2
    }
    val r = fibs.view.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum
    println(r);
  }
}
