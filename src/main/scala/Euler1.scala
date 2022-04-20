import scala.collection.immutable._

@main def Euler1() =
  val Euler1sum = List.range(1,1000).filter(x => x % 3 == 0 || x % 5 == 0).foldLeft(0)(_ + _)
  println(Euler1sum)
