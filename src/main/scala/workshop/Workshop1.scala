package workshop

/**
 * Objeto que contiene funciones para realizar la ordenación de listas
 * y contar inversiones.
 */
object Workshop1 extends InterfaceWorkshop1 {

  /**
   * Combina dos listas ordenadas en una sola lista ordenada y cuenta las inversiones.
   *
   * @param left  La primera lista a combinar.
   * @param right La segunda lista a combinar.
   * @param count El número de inversiones hasta el momento.
   * @return Una tupla que contiene la lista combinada y el número de inversiones.
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
   * Ordena una lista y cuenta el número de inversiones utilizando el algoritmo de Merge Sort.
   *
   * @param list La lista de enteros a ordenar.
   * @return Una tupla que contiene la lista ordenada y el número de inversiones.
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
   * Cuenta el número de inversiones en una lista utilizando el algoritmo de Merge Sort.
   *
   * @param list La lista de enteros en la que contar las inversiones.
   * @return El número de inversiones en la lista.
   */
  def countInversions(list: List[Int]): Int = {
    val (_, inversions) = mergeSort(list)
    // no se asigna el primer retorno del mergesort (la lista ordenada)
    // se asigna el segundo retorno (cantidad de inversiones) a la variable inversions
    inversions
  }

}