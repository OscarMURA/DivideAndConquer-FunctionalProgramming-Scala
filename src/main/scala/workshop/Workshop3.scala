package workshop
import scala.annotation.tailrec


object Workshop3 extends InterfaceWorkshop3 {

  def bucketSortGeneric[T](
                            arr: List[T],
                            function: (T, T) => Boolean,
                            functionInterval: (T, T, Int) => Int,
                            maxValue: T,
                            minValue: T
                          ): List[T] = {


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

    if (arr.isEmpty) return List[T]()

    def divideIntoBuckets(arr: List[T], buckets: List[List[T]], maxVal: T): List[List[T]] = arr match {
      case Nil => buckets
      case head :: tail =>
        val index: Int = (functionInterval(head, maxVal, buckets.length) - 1) max 0
        val newBuckets = buckets.updated(index, head :: buckets(index))
        divideIntoBuckets(tail, newBuckets, maxVal)
    }

    val maxVal: T = maxValue
    val numBuckets = arr.length
    val buckets: List[List[T]] = List.fill(numBuckets)(Nil)
    val sortedBuckets = divideIntoBuckets(arr, buckets, maxVal)
    val sortedBucketsMerged = sortedBuckets.map(mergeSort)
    sortedBucketsMerged.flatten
  }


}


