package workshop


object Workshop3 extends InterfaceWorkshop3 {

  def bucketSortGeneric[T](arr: List[T], fuction: (T, T) => Boolean, funtionInterval: (T, T, Int) => Int, maxValue: T, minValue: T): List[T] = {
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



  def BucketSort(arr: List[Int], fuction: (Int, Int) => Boolean): List[Int] = {
    if (arr.isEmpty) return List[Int]()
    def insertSort(x: Int, sortedList: List[Int]): List[Int] = sortedList match {
        case Nil => List(x)
        case head :: tail => if (x <= head) x :: sortedList else head :: insertSort(x, tail)
    }
    def divideIntoBuckets(arr: List[Int], buckets: List[List[Int]], maxVal: Int, minVal: Int): List[List[Int]] = arr match {
        case Nil => buckets
        case head :: tail =>
          val index = Math.min((head.toDouble / maxVal.toDouble * (buckets.length.toDouble - (0.4))).toInt, buckets.length - 1) //((head - minVal) / (maxVal - minVal) * (buckets.length-1 )).toInt
          //Math.min((head.toDouble / maxVal.toDouble * buckets.length.toDouble).toInt, buckets.length - 1)
          val newBuckets = buckets.updated(index, insertSort(head, buckets(index)))
          divideIntoBuckets(tail, newBuckets, maxVal, minVal)
    }
      val maxVal = arr.max
      val minVal = arr.min
      val numBuckets = arr.length
      val buckets = List.fill(1000)(Nil)
      val sortedBuckets = divideIntoBuckets(arr, buckets, maxVal, minVal)
      sortedBuckets.flatten
    }

}


