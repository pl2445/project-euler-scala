object problem045 {
  def main(args: Array[String]): Unit = {
    val r = LazyList
      .from(16000)
      .find(n => {
        val eru = n.toLong
        val tri = eru * (eru + 1)/2L
        val penta = (1L to eru).find(a => a * (3L * a - 1L)/2L == tri)
        val hexa = (1L to eru).find(b => b * (2L * b - 1L) == tri)
        tri != 40755L && penta.isDefined && hexa.isDefined
      })
    println(r.get.toLong * (r.get.toLong + 1L) / 2L)
  }
}
