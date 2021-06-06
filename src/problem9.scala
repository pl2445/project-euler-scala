object problem9 {
  def main(args: Array[String]): Unit = {
    var b = 0;
    var c = 0;
    val a = Range(1, 1000)
      .find(n =>
        (n + 1 to 1000)
          .find(x =>
            Math
              .sqrt(x * x + n * n)
              .isValidInt && x + n + Math.sqrt(x * x + n * n).toInt == 1000 && (
                (p: Int) => {
                  b = p;
                  c = Math.sqrt(n * n + b * b).toInt;
                  println(n * b * c);
                  true
                }
            )(x)
          )
          .isDefined
      )
      .get
  }
}
