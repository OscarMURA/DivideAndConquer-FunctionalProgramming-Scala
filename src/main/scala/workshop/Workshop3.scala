package workshop

object Workshop3 {
  def sort(arr: List[Double]): List[Double] = {
    if (arr.isEmpty) return List[Double]()

    def insertSort(x: Double, sortedList: List[Double]): List[Double] = sortedList match {
      case Nil => List(x)
      case head :: tail => if (x <= head) x :: sortedList else head :: insertSort(x, tail)
    }

    def divideIntoBuckets(arr: List[Double], buckets: List[List[Double]], maxVal: Double, minVal: Double): List[List[Double]] = arr match {
      case Nil => buckets
      case head :: tail =>
        val index = Math.min((head.toDouble / maxVal.toDouble * (buckets.length.toDouble - (0.4))).toInt, buckets.length - 1) //((head - minVal) / (maxVal - minVal) * (buckets.length-1 )).toInt
        //Math.min((head.toDouble / maxVal.toDouble * buckets.length.toDouble).toInt, buckets.length - 1)
        val newBuckets = buckets.updated(index, insertSort(head, buckets(index)))
        println(newBuckets.mkString(", "))
        divideIntoBuckets(tail, newBuckets, maxVal, minVal)
    }

    val maxVal = arr.max
    val minVal = arr.min
    val numBuckets = arr.length
    val buckets = List.fill(3)(Nil)
    val sortedBuckets = divideIntoBuckets(arr, buckets, maxVal, minVal)
    sortedBuckets.flatten
  }
}
