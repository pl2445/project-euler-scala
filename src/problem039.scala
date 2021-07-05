object problem039 {
  def main(args: Array[String]): Unit = {
    val r =(1 to 1000).map(foo(_)).zipWithIndex.maxBy(_._1)._2+1
    println(r)
  }

  def foo(num:Int):Int = {
    (1 to num).flatMap(a=>(a+1 to num).map(b=>{
      val c = num-a-b
      val x = a
      val y = b
      if(c*c==x*x+y*y){
        1
      }else{
        0
      }
    })).sum
  }

}
