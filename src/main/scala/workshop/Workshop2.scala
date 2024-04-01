package workshop

import scala.annotation.tailrec

/**
 * Object that provides an implementation of the QuickSort algorithm.
 * It implements the InterfaceWorkshop2 interface.
 */
object Workshop2 extends InterfaceWorkshop2 {

  /**
   * Splits a list into a list containing the elements equal to the pivot.
   *
   * @param w     The list of integers to divide.
   * @param pivot The pivot value for comparison.
   * @return A list containing the elements equal to the pivot..
   */
  @tailrec
  def equalList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int] =
    w match {
      case `pivot` :: tail => equalList(tail, pivot, pivot :: acc)
      case _ :: tail => equalList(tail, pivot, acc)
      case Nil => acc.reverse
    }

  /**
   * Splits a list into a list containing the elements equal to the pivot.
   *
   * @param w     The list of integers to divide.
   * @param pivot The pivot value for comparison.
   * @return A list containing the elements equal to the pivot..
   */
  @tailrec
  def greaterList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int] =
    w match {
      case head :: tail if head > pivot => greaterList(tail, pivot, head :: acc)
      case _ :: tail => greaterList(tail, pivot, acc)
      case Nil => acc.reverse
    }

  /**
   * Splits a list into a list containing elements smaller than the pivot.
   *
   * @param w     The list of integers to divide.
   * @param pivot The pivot value for comparison.
   * @return A list containing the elements smaller than the pivot.
   */
  @tailrec
  def lowerList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int] =
    w match {
      case head :: tail if head < pivot => lowerList(tail, pivot, head :: acc)
      case _ :: tail => lowerList(tail, pivot, acc)
      case Nil => acc.reverse
    }

  /**
   * Sorts a list using the QuickSort algorithm.
   *
   * @param w The list of integers to sort.
   * @return The ordered list.
   */
  def updatedQuickSort(w: List[Int]): List[Int] =
    w match {
      case Nil => Nil
      case head :: tail =>
        updatedQuickSort(lowerList(w, head)) ::: equalList(w, head) ::: updatedQuickSort(greaterList(w, head))
    }

}
