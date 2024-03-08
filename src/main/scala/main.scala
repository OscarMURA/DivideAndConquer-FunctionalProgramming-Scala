import workshop.FileManager
import workshop.Workshop3

@main
def main(): Unit = {
  println("Hello world!")
  // Ejemplo de uso
  val fileManager = new FileManager
  // Guardar lista de enteros en un archivo
  val dataToSave = List(1231, 12341, 12412, 12321)
  val savePath = "/path/to/save/file.txt"
  fileManager.saveFileTXT(savePath, dataToSave)

  // Cargar archivo y mostrar su contenido
  val loadPath = "/path/to/load/file.txt"
  val loadedData = fileManager.loadFileTXT(loadPath)
  loadedData match {
    case Some(numbers) =>
      println("Loaded file content:")
      numbers.foreach(println)
    case None => println("Failed to load the file")
  }

}

