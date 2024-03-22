package workshop

import scala.annotation.tailrec

object Workshop3 extends InterfaceWorkshop3{

  def bucketSortGeneric[T: Numeric](arr: List[T], fuction: (T, T) => Boolean, funtionInterval: (T, T, Int) => Int, maxValue: T, minValue: T): List[T] = {
    if (arr.isEmpty) return List[T]()

    def insertSort(x: T, sortedList: List[T]): List[T] = sortedList match {
      case Nil => List(x)
      case head :: tail =>
        if (fuction(x, head)) x :: sortedList
        else head :: insertSort(x, tail)
    }

    def divideIntoBuckets(arr: List[T], buckets: List[List[T]], maxVal: T): List[List[T]] = arr match {
      case Nil => buckets
      case head :: tail =>
        val index: Int = (funtionInterval(head, maxVal, buckets.length) - 1) max 0
        val newBuckets = buckets.updated(index, insertSort(head, buckets(index)))
        divideIntoBuckets(tail, newBuckets, maxVal)
    }

    val maxVal: T = maxValue
    val numBuckets = arr.length
    val buckets: List[List[T]] = List.fill(numBuckets)(Nil)
    val sortedBuckets = divideIntoBuckets(arr, buckets, maxVal)
    sortedBuckets.flatten
  }
}
