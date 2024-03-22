package workshop


trait InterfaceWorkshop3 {

  def bucketSortGeneric[T](arr: List[T], fuction: (T, T) => Boolean, funtionInterval: (T, T, Int) => Int, maxValue: T, minValue: T): List[T]

}
