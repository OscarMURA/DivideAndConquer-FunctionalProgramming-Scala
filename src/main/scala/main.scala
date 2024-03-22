import workshop.FileManager
import workshop.Workshop3


@main
def main(): Unit = {
  println("Hello world!")
  // Example of use
  val fileManager = new FileManager
  // Load file and show its content
  val loadPath = "C:\\Users\\chamo\\Videos\\ti1-2024-1-e5-sopas\\data_500000.txt"

  val loadedData = fileManager.loadFileTXT(loadPath)
  loadedData match {
    case Some(numbers) =>
      println("Loaded file content:")
      val sortedData = Workshop3.bucketSortGeneric(numbers, (a: Int, b: Int) => a <= b, (value: Int, maxVal: Int, numBuckets: Int) => {
        val interval = maxVal.toDouble / numBuckets.toDouble
        (value.toDouble / interval).toInt
      }, numbers.max, numbers.min)
      sortedData.foreach(println)
    case None => println("Failed to load the file")
  }
}


