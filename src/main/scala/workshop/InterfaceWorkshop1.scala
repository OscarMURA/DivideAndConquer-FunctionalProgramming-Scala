package workshop

/**
 * This trait represents a workshop interface for working with lists and sorting algorithms.
 */
trait InterfaceWorkshop1 {

  /**
   * This method should return the sum of all elements in the list.
   *
   * @param l the list of integers
   * @return the sum of all elements in the list
   */
  def countInversions(l: List[Int]): Int

  /**
   * Merges two sorted lists and counts inversions.
   *
   * @param left  The left sorted list.
   * @param right The right sorted list.
   * @param count The current count of inversions.
   * @return A tuple containing the merged sorted list and the count of inversions.
   */
  def merge(left: List[Int], right: List[Int], count: Int): (List[Int], Int)

  /**
   * This method should return the sorted list and the number of inversions in the list.
   *
   * @param list the list of integers
   * @return a tuple containing the sorted list and the number of inversions in the list
   */
  def mergeSort(list: List[Int]): (List[Int], Int)

}
