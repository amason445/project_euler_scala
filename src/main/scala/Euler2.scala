import scala.collection.immutable._

@main def Euler2() =
  lazy val fibonacci: Stream[Int] = 0 #:: fibonacci.scanLeft(1)(_ + _)
  val fibonacci_sequence = fibonacci.takeWhile(x => x < 4_000_000)
  val filtered_sequence = fibonacci_sequence.filter(_ % 2 == 0)
  val Euler2sum = filtered_sequence.foldLeft(0)(_ + _)
  println(Euler2sum)
