import scala.collection.immutable.List
import scala.math.max

@main def Euler4() =
  val xValue = List.range(100, 1000)
  val yValue = List.range(100, 1000)

  def reverseNumber(x: Int): Int =
    x.abs.toString.reverse.toInt


  val Euler4max = xValue.flatMap(x => yValue.map(y => (x,y))).map(x => x._1 * x._2).filter(p => p == reverseNumber(p)).reduce(max(_,_))

  println(Euler4max)

