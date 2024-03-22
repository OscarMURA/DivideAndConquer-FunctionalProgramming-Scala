package workshop

object Workshop1 {

  def merge(left: List[Int], right: List[Int], count: Int): (List[Int], Int) = (left, right) match {
    case (Nil, right) => (right, count)
    case (left, Nil) => (left, count)
    case (leftHead :: leftTail, rightHead :: rightTail) =>
      if (leftHead <= rightHead) {
        val (merged, inversions) = merge(leftTail, right, count)
        (leftHead :: merged, inversions)
      } else {
        val (merged, inversions) = merge(left, rightTail, count + left.length)
        (rightHead :: merged, inversions)
      }
  }

  def mergeSort(list: List[Int]): (List[Int], Int) = {
    val n = list.length / 2
    if (n == 0) (list, 0)
    else {
      val (left, right) = list.splitAt(n)
      val (sortedLeft, leftInversions) = mergeSort(left)
      val (sortedRight, rightInversions) = mergeSort(right)
      val (merged, splitInversions) = merge(sortedLeft, sortedRight, 0)
      (merged, leftInversions + rightInversions + splitInversions)
    }
  }

  def countInversions(list: List[Int]): Int = {
    val (_, inversions) = mergeSort(list)
    // no se asigna el primer retorno del mergesort (la lista ordenada)
    // se asigna el segundo retorno (cantidad de inversiones) a la variable inversions
    inversions
  }

}