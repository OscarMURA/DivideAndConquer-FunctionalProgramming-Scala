package workshop

trait InterfaceWorkshop1 {

  def countInversions(l: List[Int]): Int

  def merge(left: List[Int], right: List[Int], count: Int): (List[Int], Int)

  def mergeSort(list: List[Int]): (List[Int], Int)
  
}
