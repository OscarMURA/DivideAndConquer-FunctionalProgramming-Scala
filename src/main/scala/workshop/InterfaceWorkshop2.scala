package workshop

import scala.annotation.tailrec

/**
 * This trait represents a workshop interface for working with lists and sorting algorithms.
 */
trait InterfaceWorkshop2 {

  /**
   * Returns a list containing elements equal to the pivot from the given list.
   *
   * @param w     The list of integers to filter.
   * @param pivot The value to compare against.
   * @param acc   An accumulator for the result list (default is an empty list).
   * @return A list containing elements equal to the pivot.
   */
  def equalList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int]

  /**
   * Returns a list containing elements greater than the pivot from the given list.
   *
   * @param w     The list of integers to filter.
   * @param pivot The value to compare against.
   * @param acc   An accumulator for the result list (default is an empty list).
   * @return A list containing elements greater than the pivot.
   */
  def greaterList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int]

  /**
   * Returns a list containing elements lower than the pivot from the given list.
   *
   * @param w     The list of integers to filter.
   * @param pivot The value to compare against.
   * @param acc   An accumulator for the result list (default is an empty list).
   * @return A list containing elements lower than the pivot.
   */
  def lowerList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int]

  /**
   * Sorts the given list using the quicksort algorithm.
   *
   * @param w The list of integers to be sorted.
   * @return The sorted list.
   */
  def updatedQuickSort(w: List[Int]): List[Int]


}
