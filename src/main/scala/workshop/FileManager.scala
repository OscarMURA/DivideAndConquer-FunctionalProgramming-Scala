package workshop
import scala.io.Source
import java.io.{File, PrintWriter}

/**
 * A class for managing file operations.
 */
class FileManager {

  /**
   * Loads a text file containing integer numbers.
   *
   * @param path The path to the text file.
   * @return Some(List[Int]) containing the integers read from the file if successful, None otherwise.
   */
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

  /**
   * Saves a list of integer numbers to a text file.
   *
   * @param path    The path to save the file.
   * @param numbers The list of integer numbers to save.
   */
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
