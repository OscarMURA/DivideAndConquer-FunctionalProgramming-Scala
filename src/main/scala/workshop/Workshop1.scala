package workshop

import scala.annotation.tailrec

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
  def merge(left: List[Int], right: List[Int], cmp: (Int, Int) => Boolean): (List[Int], Int) = (left, right) match {
    case (Nil, r) => (r, 0)
    case (l, Nil) => (l, 0)
    case (leftHead :: leftTail, rightHead :: rightTail) =>
      if (cmp(leftHead, rightHead)) {
        val (merged, inversions) = merge(leftTail, right, cmp)
        (leftHead :: merged, inversions)
      } else {
        val (merged, inversions) = merge(left, rightTail, cmp)
        (rightHead :: merged, left.length + inversions)
      }
  }

  /**
   * Sort a list and count the number of inversions using the Merge Sort algorithm.
   *
   * @param list The list of integers to sort.
   * @return A tuple containing the ordered list and the number of investments.
   *
   */
  def mergeSort(list: List[Int], cmp: (Int, Int) => Boolean): (List[Int], Int) = {
    val n = list.length / 2
    if (n == 0) (list, 0)
    else {
      val (left, right) = list.splitAt(n)
      val (sortedLeft, leftInversions) = mergeSort(left, cmp)
      val (sortedRight, rightInversions) = mergeSort(right, cmp)
      val (merged, splitInversions) = merge(sortedLeft, sortedRight, cmp)
      (merged, leftInversions + rightInversions + splitInversions)
    }
  }

  /**
   * Counts the number of inversions in a list using the Merge Sort algorithm.
   *
   * @param list The list of integers to count inversions in.
   * @return The number of inversions in the list.
   */
  def countInversions(list: List[Int]): Int = {
    mergeSort(list, (x, y) => x <= y)._2
  }

}