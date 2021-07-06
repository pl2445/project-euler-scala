object problem040 {
  def main(args: Array[String]): Unit = {
    val r = (1L to 200000L).map(_.toString()).foldLeft(""){
      case (t,l) if t.size <1000001 => t+l
      case (t,l) =>t
    }
    val res =(0 to 6).map(num=>math.pow(10,num).toInt).map(idx=>r.charAt(idx-1).asDigit).product
    println(res)
  }
}
