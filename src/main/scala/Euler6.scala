import scala.collection.immutable._
import scala.math.pow

@main def Euler6() =
  lazy val natural_sequence: Stream[Int] = Stream.from(1)

  val euler_sos = natural_sequence.takeWhile(_ <= 100).map(pow(_,2)).sum
  val euler_sqos = pow(natural_sequence.takeWhile(_ <= 100).sum,2)

  val solution = euler_sqos - euler_sos

  println(solution)
