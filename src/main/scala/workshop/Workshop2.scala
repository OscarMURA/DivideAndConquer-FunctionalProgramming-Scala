package workshop

import scala.annotation.tailrec

object Workshop2 extends InterfaceWorkshop2 {

  @tailrec
  def equalList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int] =
    w match {
      case `pivot` :: tail => equalList(tail, pivot, pivot :: acc)
      case _ :: tail => equalList(tail, pivot, acc)
      case Nil => acc.reverse
    }

  @tailrec
  def greaterList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int] =
    w match {
      case head :: tail if head > pivot => greaterList(tail, pivot, head :: acc)
      case _ :: tail => greaterList(tail, pivot, acc)
      case Nil => acc.reverse
    }

  @tailrec
  def lowerList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int] =
    w match {
      case head :: tail if head < pivot => lowerList(tail, pivot, head :: acc)
      case _ :: tail => lowerList(tail, pivot, acc)
      case Nil => acc.reverse
    }

  def updatedQuickSort(w: List[Int]): List[Int] =
    w match {
      case Nil => Nil
      case head :: tail =>
        updatedQuickSort(lowerList(w, head)) ::: equalList(w, head) ::: updatedQuickSort(greaterList(w, head))
    }




}
