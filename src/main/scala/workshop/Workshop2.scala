package workshop

import scala.annotation.tailrec

/**
 * Objeto que proporciona una implementación del algoritmo de QuickSort.
 * Implementa la interfaz InterfaceWorkshop2.
 */
object Workshop2 extends InterfaceWorkshop2 {

  /**
   * Divide una lista en una lista que contiene los elementos iguales al pivote.
   *
   * @param w     La lista de enteros a dividir.
   * @param pivot El valor del pivote para la comparación.
   * @return Una lista que contiene los elementos iguales al pivote.
   */
  @tailrec
  def equalList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int] =
    w match {
      case `pivot` :: tail => equalList(tail, pivot, pivot :: acc)
      case _ :: tail => equalList(tail, pivot, acc)
      case Nil => acc.reverse
    }

  /**
   * Divide una lista en una lista que contiene los elementos iguales al pivote.
   *
   * @param w     La lista de enteros a dividir.
   * @param pivot El valor del pivote para la comparación.
   * @return Una lista que contiene los elementos iguales al pivote.
   */
  @tailrec
  def greaterList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int] =
    w match {
      case head :: tail if head > pivot => greaterList(tail, pivot, head :: acc)
      case _ :: tail => greaterList(tail, pivot, acc)
      case Nil => acc.reverse
    }

  /**
   * Divide una lista en una lista que contiene los elementos menores que el pivote.
   *
   * @param w     La lista de enteros a dividir.
   * @param pivot El valor del pivote para la comparación.
   * @return Una lista que contiene los elementos menores que el pivote.
   */
  @tailrec
  def lowerList(w: List[Int], pivot: Int, acc: List[Int] = Nil): List[Int] =
    w match {
      case head :: tail if head < pivot => lowerList(tail, pivot, head :: acc)
      case _ :: tail => lowerList(tail, pivot, acc)
      case Nil => acc.reverse
    }

  /**
   * Ordena una lista utilizando el algoritmo QuickSort.
   *
   * @param w La lista de enteros a ordenar.
   * @return La lista ordenada.
   */
  def updatedQuickSort(w: List[Int]): List[Int] =
    w match {
      case Nil => Nil
      case head :: tail =>
        updatedQuickSort(lowerList(w, head)) ::: equalList(w, head) ::: updatedQuickSort(greaterList(w, head))
    }

}
