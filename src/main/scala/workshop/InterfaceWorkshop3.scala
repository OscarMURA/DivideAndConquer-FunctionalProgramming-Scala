package workshop

trait InterfaceWorkshop3 {
  def BucketSort(arr: List[Int], fuction: (Int, Int) => Boolean): List[Int]
  def bucketSortGeneric[T](arr: List[T],fuction: (T, T) => Boolean, funtionInterval: (T, T, Int) => Int, maxValue: T): List[T]
}
