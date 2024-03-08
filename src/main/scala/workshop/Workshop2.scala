package workshop

object Workshop2 extends InterfaceWorkshop2 {
  def main(args: Array[String]): Unit = {
    val w = List(1, 4, 2, 5, 7, 23, 5, 1, 3, 5)
    val myList: List[Int] = updatedQuickSort(w)
    println(myList)
  }


  override def equalList(w: List[Int], pivot: Int): List[Int] =
    w match {
      case `pivot` :: tail => pivot :: equalList(tail, pivot)
      case _ :: tail => equalList(tail, pivot)
      case Nil => Nil
    }

  override def greaterList(w: List[Int], pivot: Int): List[Int] =
    w match {
      case head :: tail if head > pivot => head :: greaterList(tail, pivot)
      case _ :: tail => greaterList(tail, pivot)
      case Nil => Nil
    }

  override def lowerList(w: List[Int], pivot: Int): List[Int] =
    w match {
      case head :: tail if head < pivot => head :: lowerList(tail, pivot)
      case _ :: tail => lowerList(tail, pivot)
      case Nil => Nil
    }

  override def updatedQuickSort(w: List[Int]): List[Int] =
    w match {
      case Nil => Nil
      case head :: tail =>
        updatedQuickSort(lowerList(w, head)) ::: equalList(w, head) ::: updatedQuickSort(greaterList(w, head))
    }
  
  
  
  
}
