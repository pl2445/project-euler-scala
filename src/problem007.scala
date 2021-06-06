import scala.BigInt
object problem7 {
  def main(args: Array[String]): Unit = {
    lazy val ps: Stream[Int] = 2 #:: Stream
      .from(3)
      .filter(i => ps.takeWhile(j => j * j <= i).forall(i % _ > 0))
    println(ps(10000))
  }

  /*
  def sieve(stream: Stream[Int]): Stream[Int] = {
    stream.head #:: sieve((stream.tail).filter(x => x % stream.head != 0))
  }
   */
}
