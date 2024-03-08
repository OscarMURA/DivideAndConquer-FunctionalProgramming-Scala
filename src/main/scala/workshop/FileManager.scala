package workshop
import scala.io.Source
import java.io.{File, PrintWriter}

class FileManager {
  
    def loadFileTXT(path: String): Option[List[Int]] = {
      try {
        val source = Source.fromFile(path)
        val lines = source.getLines().toList.map(_.toInt)
        source.close()
        Some(lines)
      } catch {
        case e: Exception =>
          println(s"An error occurred while loading the file: ${e.getMessage}")
          None
      }
    }
    
    def saveFileTXT(path: String, numbers: List[Int]): Unit = {
      val file = new File(path)
      val writer = new PrintWriter(file)
      try {
        numbers.foreach(number => writer.println(number))
      } finally {
        writer.close()
      }
      println("The file was saved successfully")
    }
}
