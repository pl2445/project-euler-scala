object problem031 {
  def main(args: Array[String]): Unit = {
    val r = foo(List(1, 2, 5, 10, 20, 50, 100, 200), 200)
    println(r)
  }

  def foo(currencies: List[Int], amount: Int): Int = {
    currencies match {
      case h :: t =>
        if (h > amount) 0
        else if (h == amount) 1
        else foo(currencies, amount - h) + foo(t, amount)
      case _ => 0
    }
  }
}
