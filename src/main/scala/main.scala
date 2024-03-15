import workshop.FileManager
import workshop.Workshop3


@main
def main(): Unit = {
  println("Hello world!")
  // Ejemplo de uso
  val fileManager = new FileManager
  // Cargar archivo y mostrar su contenido
  val loadPath = "C:\\Users\\Oscar Muñoz\\Documents\\4 Semestre\\Integradoras\\ti1-2024-1-e5-sopas\\data_500000.txt"

  val loadedDat = List(2, 3, 4, 3, 1, 9) //fileManager.loadFileTXT(loadPath)
  val sortedDat = Workshop3.bucketSortGeneric(loadedDat, (x: Int, head: Int) => (x <= head), (head: Int, maxVal: Int, size: Int) => Math.min((head * 1.0 / 1.0 * maxVal * (size * 1.0 - (0.4))).toInt, size - 1), loadedDat.max)
  sortedDat.foreach(println)

  val loadedData = fileManager.loadFileTXT(loadPath)
  loadedData match {
    case Some(numbers) =>
      println("Loaded file content:")
      //val sortedData = Workshop3.bucketSortGeneric(numbers, (x: Int, head: Int) => (x <= head), (head: Int, maxVal: Int, size: Int) => Math.min((head*1.0 / 1.0*maxVal * (size*1.0 - (0.4))).toInt, size - 1), numbers.max)
      val sortedData =Workshop3.sort(numbers,(x: Int, head: Int) => (x <= head))
      //val sortedData = Workshop3.bucketSortGeneric(numbers,  (head: Int, maxVal: Int, size: Int) => Math.min((head*1.0 / 1.0*maxVal * (size*1.0 - (0.4))).toInt, size - 1), numbers.max)
      def compareInt(x: Int, y: Int): Boolean = x < y
      sortedData.foreach(println)
    case None => println("Failed to load the file")
  }
}

