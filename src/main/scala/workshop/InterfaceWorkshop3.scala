package workshop


/**
 * This trait represents a workshop interface for working with lists and sorting algorithms.
 */
trait InterfaceWorkshop3 {

  /**
   * Sorts a list using the bucket sort algorithm with generic types.
   *
   * @param arr              The list to be sorted.
   * @param function         The comparison function to determine the order of elements.
   * @param functionInterval The function to map elements into intervals.
   * @param maxValue         The maximum value in the list.
   * @param minValue         The minimum value in the list.
   * @tparam T The type of elements in the list.
   * @return The sorted list.
   */
  def bucketSortGeneric[T](arr: List[T], fuction: (T, T) => Boolean, funtionInterval: (T, T, Int) => Int, maxValue: T, minValue: T): List[T]

}
