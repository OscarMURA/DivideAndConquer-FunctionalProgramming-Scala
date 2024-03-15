object BucketSort {

  // Insertion sort for sorting individual buckets
  def insertionSort(bucket: List[Double]): List[Double] = bucket match {
    case Nil => Nil
    case x :: xs => insert(x, insertionSort(xs))
  }

  def insert(x: Double, sortedList: List[Double]): List[Double] = sortedList match {
    case Nil => List(x)
    case y :: ys =>
      if (x <= y) x :: sortedList
      else y :: insert(x, ys)
  }

  // Distribute elements into buckets recursively
  def distribute(arr: List[Double], buckets: Array[List[Double]], currentIndex: Int): Array[List[Double]] = arr match {
    case Nil => buckets
    case x :: xs =>
      val index = (arr.length * x).toInt
      val updatedBuckets = buckets.updated(index, x :: buckets(index))
      distribute(xs, updatedBuckets, currentIndex + 1)
  }

  // Main BucketSort function
  def bucketSort(arr: List[Double]): List[Double] = {
    val n = arr.length
    val buckets = Array.fill(n)(List.empty[Double])
    val distributedBuckets = distribute(arr, buckets, 0)

    // Sort individual buckets using insertion sort
    val sortedBuckets = distributedBuckets.map(bucket => insertionSort(bucket))

    // Concatenate sorted buckets
    sortedBuckets.flatten.toList
  }

}