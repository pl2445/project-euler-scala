import scala.runtime.LazyInt
object problem042 {
  def main(args: Array[String]): Unit = {
    val words = scala.io.Source
      .fromFile("problem042_words.txt")
      .mkString
      .split(",")
      .toList
    val longestSize = words.map(_.size).max - 2
    val possibleMax = 26 * longestSize
    lazy val lazyNums = LazyList.from(1).map(num => num * (num + 1) / 2)
    val nums = lazyNums.takeWhile(_ <= possibleMax).toList
    val r = words.map(word=>word.tail.reverse.tail).map(word=>word.toCharArray().map(c=>c-'A'+1).sum).filter(nums.contains(_)).size
    println(r)
  }
}
