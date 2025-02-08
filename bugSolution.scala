```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = value
}

object Main extends App {
  implicit val intOrdering: Ordering[Int] = Ordering.Int
  val myInt = new MyClass(10)
  println(myInt.myMethod)

  implicit val stringOrdering: Ordering[String] = Ordering.String
  val myString = new MyClass("hello")
  println(myString.myMethod)

  implicit val doubleOrdering: Ordering[Double] = Ordering.Double
  val myDouble = new MyClass(3.14)
  println(myDouble.myMethod)
}
```