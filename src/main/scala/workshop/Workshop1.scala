package workshop

/**
 * Object containing functions for sorting lists
 * and counting investments.
 */
object Workshop1 extends InterfaceWorkshop1 {

  /**
   * Combines two sorted lists into a single sorted list and counts the investments.
   *
   * @param left  The first list to combine.
   * @param right The second list to combine.
   * @param count The number of investments to date.
   * @return A tuple containing the combined list and the number of investments.
   */
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

  /**
   * Sort a list and count the number of inversions using the Merge Sort algorithm.
   *
   * @param list The list of integers to sort.
   * @return A tuple containing the ordered list and the number of investments.
   */
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

  /**
   * Count the number of investments in a list using the Merge Sort algorithm.
   *
   * @param list The list of integers in which to count the investments.
   * @return The number of investments in the list.
   */
  def countInversions(list: List[Int]): Int = {
    val (_, inversions) = mergeSort(list)
    // do not assign the first return of the mergesort (the ordered list)
    // the second return (number of inversions) is assigned to the variable inversions
    inversions
  }

}