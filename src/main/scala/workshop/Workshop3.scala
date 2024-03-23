package workshop

import scala.annotation.tailrec

/**
 * Objeto que proporciona funciones para realizar operaciones relacionadas con el algoritmo de ordenación Bucket Sort.
 */
object Workshop3 extends InterfaceWorkshop3 {

  /**
   * Implementación genérica del algoritmo de ordenación Bucket Sort.
   *
   * @param arr               Lista de elementos a ordenar.
   * @param function          Función de comparación para ordenar los elementos.
   * @param functionInterval  Función para calcular el intervalo de cada elemento en los buckets.
   * @param maxValue          Valor máximo posible en la lista.
   * @param minValue          Valor mínimo posible en la lista.
   * @tparam T                Tipo de elementos en la lista.
   * @return                  Lista ordenada.
   */
  def bucketSortGeneric[T](
                            arr: List[T],
                            function: (T, T) => Boolean,
                            functionInterval: (T, T, Int) => Int,
                            maxValue: T,
                            minValue: T
                          ): List[T] = {

    /**
     * Función interna que realiza el ordenamiento Merge Sort.
     *
     * @param list  Lista de elementos a ordenar.
     * @return      Lista ordenada.
     */
    def mergeSort(list: List[T]): List[T] = {
      @tailrec
      def merge(left: List[T], right: List[T], acc: List[T] = Nil): List[T] = (left, right) match {
        case (Nil, _) => acc.reverse ::: right
        case (_, Nil) => acc.reverse ::: left
        case (x :: xs, y :: ys) =>
          if (function(x, y)) merge(xs, right, x :: acc)
          else merge(left, ys, y :: acc)
      }
      val n = list.length / 2
      if (n == 0) list
      else {
        val (left, right) = list.splitAt(n)
        merge(mergeSort(left), mergeSort(right))
      }
    }

    // Verifica si la lista está vacía
    if (arr.isEmpty) return List[T]()

    /**
     * Función interna que divide los elementos en los buckets correspondientes.
     *
     * @param arr       Lista de elementos a dividir en buckets.
     * @param buckets   Lista de buckets.
     * @param maxVal    Valor máximo en la lista.
     * @return          Lista de buckets con los elementos divididos.
     */
    def divideIntoBuckets(arr: List[T], buckets: List[List[T]], maxVal: T): List[List[T]] = arr match {
      case Nil => buckets
      case head :: tail =>
        val index: Int = (functionInterval(head, maxVal, buckets.length) - 1) max 0
        val newBuckets = buckets.updated(index, head :: buckets(index))
        divideIntoBuckets(tail, newBuckets, maxVal)
    }

    // Inicialización de variables
    val maxVal: T = maxValue
    val numBuckets = arr.length
    val buckets: List[List[T]] = List.fill(numBuckets)(Nil)
    val sortedBuckets = divideIntoBuckets(arr, buckets, maxVal)
    val sortedBucketsMerged = sortedBuckets.map(mergeSort)
    sortedBucketsMerged.flatten
  }

}
