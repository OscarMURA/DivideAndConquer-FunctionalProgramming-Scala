package workshop

import scala.annotation.tailrec

/**
 * Object that provides functions to perform operations related to the Bucket Sort algorithm.
 */
object Workshop3 extends InterfaceWorkshop3 {

  /**
   * Generic implementation of the Bucket Sort algorithm.
   *
   * @param arr               List of items to be ordered.
   * @param function          Comparison function to sort the elements.
   * @param functionInterval  Function to calculate the interval of each element in the buckets.
   * @param maxValue          Maximum possible value in the list.
   * @param minValue          Valor mínimo posible en la lista.
   * @tparam T                Type of items in the list.
   * @return                  Ordered list.
   */
  def bucketSortGeneric[T](
                            arr: List[T],
                            function: (T, T) => Boolean,
                            functionInterval: (T, T, Int) => Int,
                            maxValue: T,
                            minValue: T
                          ): List[T] = {

    /**
     * Internal function that performs the Merge Sort.
     *
     * @param list  List of items to be ordered.
     * @return      Ordered list.
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

    // Check if the list is empty
    if (arr.isEmpty) return List[T]()

    /**
     * Internal function that divides the elements into the corresponding buckets.
     *
     * @param arr       List of elements to be divided into buckets.
     * @param buckets   List of buckets.
     * @param maxVal    Maximum value in the list.
     * @return          List of buckets with divided elements.
     */
    def divideIntoBuckets(arr: List[T], buckets: List[List[T]], maxVal: T): List[List[T]] = arr match {
      case Nil => buckets
      case head :: tail =>
        val index: Int = (functionInterval(head, maxVal, buckets.length) - 1) max 0
        val newBuckets = buckets.updated(index, head :: buckets(index))
        divideIntoBuckets(tail, newBuckets, maxVal)
    }

    // Initialization of variables
    val maxVal: T = maxValue
    val numBuckets = arr.length
    val buckets: List[List[T]] = List.fill(numBuckets)(Nil)
    val sortedBuckets = divideIntoBuckets(arr, buckets, maxVal)
    val sortedBucketsMerged = sortedBuckets.map(mergeSort)
    sortedBucketsMerged.flatten
  }

}
