package workshop

import scala.annotation.tailrec

trait InterfaceWorkshop2 {

  def equalList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int]

  def greaterList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int]

  def lowerList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int]

  def updatedQuickSort(w: List[Int]): List[Int]


}
