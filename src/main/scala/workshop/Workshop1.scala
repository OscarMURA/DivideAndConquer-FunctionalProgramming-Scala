package workshop

object Workshop1 extends InterfaceWorkshop1 {

  override def countInversions(l: List[Int]): Int =
    l match {
      case Nil => 0
      case h :: Nil => 0
      case h :: t => countBiggerInList(h, t, 0) + countInversions(t)
    }

  override def countBiggerInList(head: Int, l: List[Int], counter: Int): Int =
    l match {
      case Nil => counter
      case h :: t => countBiggerInList(head, t, counter + isBigger(head, h))
    }

  override def isBigger(x: Int, y: Int): Int =
    if (x > y) 1 else 0
  
}
