import workshop.FileManager
import workshop.Workshop3

import scala.jdk.CollectionConverters.*

@main
def main(): Unit = {
  println("Hello world!")
  // Example of use
  val fileManager = new FileManager
  // Cargar archivo y mostrar su contenido
  val loadPath = "C:\\Users\\Oscar Muñoz\\Documents\\4 Semestre\\Integradoras\\ti1-2024-1-e5-sopas\\data_500000.txt"

  val loadedData = fileManager.loadFileTXT(loadPath)
  loadedData match {
    case Some(numbers) =>
      println("Loaded file content:")
      // Call bucketSort to sort the list of integers
      //val sortedData = Workshop3.BucketSort(numbers, (x: Int, head: Int) => (x <= head))
      val sortedData = Workshop3.bucketSortGeneric(numbers, (a: Int, b: Int) => a <= b, (value: Int, maxVal: Int, numBuckets: Int) => {
        val interval = maxVal.toDouble / numBuckets.toDouble
        (value.toDouble / interval).toInt
      }, numbers.max, numbers.min)
      sortedData.foreach(println)
    case None => println("Failed to load the file")
  }

}


