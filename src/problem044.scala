object problem044 {
  def main(args: Array[String]): Unit = {
    lazy val pentagonal = LazyList.from(1).map(n => n * (3 * n - 1) / 2)
    val r = pentagonal.find(num => {
      val tmp = pentagonal.takeWhile(_ < num)
      val a = tmp
        .filter(x => tmp.contains(num - x))
        .filter(y => pentagonal.takeWhile(_<=y+num).contains(y + num))
      if (a.toList.size != 0) {
        println(num)
        println(a(0))
        println(num - a(0))
        true
      } else {
        false
      }
    }).toList
  }
}
