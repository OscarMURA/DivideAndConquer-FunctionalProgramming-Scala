import munit.*
import workshop.Workshop2
import scala.collection.immutable.List

/**
 * Clase de prueba para la clase Workshop2.
 */
class Workshop2Test extends FunSuite {

  // Tests for equalList method
  /**
   * Prueba para el método equalList con una lista que contiene el valor proporcionado como pivote.
   */
  test("equalList - Positive Test 1") {
    val result = Workshop2.equalList(List(1, 2, 3), 2)
    assertEquals(result, List(2))
  }

  /**
   * Prueba para el método equalList con una lista que contiene múltiples instancias del valor proporcionado como pivote.
   */
  test("equalList - Positive Test 2") {
    val result = Workshop2.equalList(List(5, 5, 5, 5), 5)
    assertEquals(result, List(5, 5, 5, 5))
  }

  /**
   * Prueba para el método equalList con una lista que no contiene el valor proporcionado como pivote.
   */
  test("equalList - Positive Test 3") {
    val result = Workshop2.equalList(List(1, 2, 3), 4)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método equalList con una lista vacía.
   */
  test("equalList - Positive Test 4") {
    val result = Workshop2.equalList(List(), 5)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método equalList con una lista que no contiene el valor proporcionado como pivote.
   */
  test("equalList - Positive Test 5") {
    val result = Workshop2.equalList(List(5, 6, 7, 8), 1)
    assertEquals(result, Nil)
  }

  // Tests for equalList method with negative numbers
  /**
   * Prueba para el método equalList con una lista que contiene el valor proporcionado como pivote (números negativos).
   */
  test("equalList - Positive Test 6") {
    val result = Workshop2.equalList(List(-1, -2, -3), -2)
    assertEquals(result, List(-2))
  }

  /**
   * Prueba para el método equalList con una lista que contiene múltiples instancias del valor proporcionado como pivote (números negativos).
   */
  test("equalList - Positive Test 7") {
    val result = Workshop2.equalList(List(-5, -5, -5, -5), -5)
    assertEquals(result, List(-5, -5, -5, -5))
  }

  /**
   * Prueba para el método equalList con una lista que no contiene el valor proporcionado como pivote (números negativos).
   */
  test("equalList - Positive Test 8") {
    val result = Workshop2.equalList(List(-1, -2, -3), -4)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método equalList con una lista vacía (números negativos).
   */
  test("equalList - Positive Test 9") {
    val result = Workshop2.equalList(List(), -5)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método equalList con una lista que no contiene el valor proporcionado como pivote (números negativos).
   */
  test("equalList - Positive Test 10") {
    val result = Workshop2.equalList(List(-5, -6, -7, -8), -1)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método equalList con una lista que contiene tanto números positivos como negativos.
   */
  test("equalList - Positive Test 11") {
    val result = Workshop2.equalList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0)
    assertEquals(result, List(0))
  }

  /**
   * Prueba para el método equalList con una lista que no contiene el valor proporcionado como pivote.
   */
  test("equalList - Positive Test 12") {
    val result = Workshop2.equalList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 6)
    assertEquals(result, Nil)
  }

  // Tests for greaterList method
  /**
   * Prueba para el método greaterList con una lista que contiene elementos mayores que el pivote.
   */
  test("greaterList - Positive Test 1") {
    val result = Workshop2.greaterList(List(1, 2, 3), 2)
    assertEquals(result, List(3))
  }

  /**
   * Prueba para el método equalList con una lista de números iguales.
   */
  test("equalList - Positive Test 2") {
    val result = Workshop2.equalList(List(5, 5, 5, 5), 5)
    assertEquals(result, List(5, 5, 5, 5))
  }

  /**
   * Prueba para el método equalList con una lista de números sin igual al pivote.
   */
  test("equalList - Positive Test 3") {
    val result = Workshop2.equalList(List(1, 2, 3), 4)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método equalList con una lista vacía.
   */
  test("equalList - Positive Test 4") {
    val result = Workshop2.equalList(List(), 5)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método equalList con una lista sin igual al pivote.
   */
  test("equalList - Positive Test 5") {
    val result = Workshop2.equalList(List(5, 6, 7, 8), 1)
    assertEquals(result, Nil)
  }

  // Tests para el método greaterList

  /**
   * Prueba para el método greaterList con una lista de números positivos.
   */
  test("greaterList - Positive Test 1") {
    val result = Workshop2.greaterList(List(1, 2, 3), 2)
    assertEquals(result, List(3))
  }

  /**
   * Prueba para el método greaterList con una lista de números iguales al pivote.
   */
  test("greaterList - Positive Test 2") {
    val result = Workshop2.greaterList(List(5, 5, 5, 5), 4)
    assertEquals(result, List(5, 5, 5, 5))
  }

  /**
   * Prueba para el método greaterList con una lista de números menores al pivote.
   */
  test("greaterList - Positive Test 3") {
    val result = Workshop2.greaterList(List(1, 2, 3), 0)
    assertEquals(result, List(1, 2, 3))
  }

  /**
   * Prueba para el método greaterList con una lista vacía.
   */
  test("greaterList - Positive Test 4") {
    val result = Workshop2.greaterList(List(), 5)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método greaterList con una lista de números mayores al pivote.
   */
  test("greaterList - Positive Test 5") {
    val result = Workshop2.greaterList(List(5, 6, 7, 8), 1)
    assertEquals(result, List(5, 6, 7, 8))
  }

  // Tests para el método lowerList

  /**
   * Prueba para el método lowerList con una lista de números positivos.
   */
  test("lowerList - Positive Test 1") {
    val result = Workshop2.lowerList(List(1, 2, 3), 2)
    assertEquals(result, List(1))
  }

  /**
   * Prueba para el método lowerList con una lista de números iguales al pivote.
   */
  test("lowerList - Positive Test 2") {
    val result = Workshop2.lowerList(List(5, 5, 5, 5), 6)
    assertEquals(result, List(5, 5, 5, 5))
  }

  /**
   * Prueba para el método lowerList con una lista de números mayores al pivote.
   */
  test("lowerList - Positive Test 3") {
    val result = Workshop2.lowerList(List(1, 2, 3), 4)
    assertEquals(result, List(1, 2, 3))
  }

  /**
   * Prueba para el método lowerList con una lista vacía.
   */
  test("lowerList - Positive Test 4") {
    val result = Workshop2.lowerList(List(), 5)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método lowerList con una lista sin números menores al pivote.
   */
  test("lowerList - Positive Test 5") {
    val result = Workshop2.lowerList(List(5, 6, 7, 8), 1)
    assertEquals(result, Nil)
  }

  // Tests for lowerList method with negative numbers

  /**
   * Prueba para el método lowerList con una lista de números negativos.
   */
  test("lowerList - Positive Test 6") {
    val result = Workshop2.lowerList(List(-1, -2, -3), -2)
    assertEquals(result, List(-3))
  }

  /**
   * Prueba para el método lowerList con una lista de números negativos iguales al pivote.
   */
  test("lowerList - Positive Test 7") {
    val result = Workshop2.lowerList(List(-5, -5, -5, -5), -4)
    assertEquals(result, List(-5, -5, -5, -5))
  }

  /**
   * Prueba para el método lowerList con una lista de números negativos sin números menores al pivote.
   */
  test("lowerList - Positive Test 8") {
    val result = Workshop2.lowerList(List(-1, -2, -3), -4)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método lowerList con una lista vacía.
   */
  test("lowerList - Positive Test 9") {
    val result = Workshop2.lowerList(List(), -5)
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método lowerList con una lista de números negativos mayores al pivote.
   */
  test("lowerList - Positive Test 10") {
    val result = Workshop2.lowerList(List(-5, -6, -7, -8), -1)
    assertEquals(result, List(-5, -6, -7, -8))
  }

  /**
   * Prueba para el método lowerList con una lista de números negativos y positivos, donde el pivote es 0.
   */
  test("lowerList - Positive Test 11") {
    val result = Workshop2.lowerList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0)
    assertEquals(result, List(-5, -4, -3, -2, -1))
  }

  /**
   * Prueba para el método lowerList con una lista de números negativos y positivos, donde no hay números menores al pivote.
   */
  test("lowerList - Positive Test 12") {
    val result = Workshop2.lowerList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), -6)
    assertEquals(result, Nil)
  }

  // Tests for updatedQuickSort method

  test("updatedQuickSort - Positive Test 1") {
    val result = Workshop2.updatedQuickSort(List(1, 4, 2, 5, 7, 23, 5, 1, 3, 5))
    assertEquals(result, List(1, 1, 2, 3, 4, 5, 5, 5, 7, 23))
  }

  /**
   * Prueba para el método updatedQuickSort con una lista ordenada de forma descendente.
   */
  test("updatedQuickSort - Positive Test 2") {
    val result = Workshop2.updatedQuickSort(List(5, 4, 3, 2, 1))
    assertEquals(result, List(1, 2, 3, 4, 5))
  }

  /**
   * Prueba para el método updatedQuickSort con una lista que contiene un solo elemento.
   */
  test("updatedQuickSort - Positive Test 3") {
    val result = Workshop2.updatedQuickSort(List(1))
    assertEquals(result, List(1))
  }

  /**
   * Prueba para el método updatedQuickSort con una lista vacía.
   */
  test("updatedQuickSort - Positive Test 4") {
    val result = Workshop2.updatedQuickSort(List())
    assertEquals(result, Nil)
  }

  /**
   * Prueba para el método updatedQuickSort con una lista que contiene un solo elemento repetido.
   */
  test("updatedQuickSort - Positive Test 5") {
    val result = Workshop2.updatedQuickSort(List(1, 1, 1, 1, 1))
    assertEquals(result, List(1, 1, 1, 1, 1))
  }

  // Tests for updatedQuickSort method with negative numbers

  /**
   * Prueba para el método updatedQuickSort con una lista que contiene elementos negativos y positivos.
   */
  test("updatedQuickSort - Positive Test 6") {
    val result = Workshop2.updatedQuickSort(List(-1, -4, -2, -5, -7, -23, -5, -1, -3, -5))
    assertEquals(result, List(-23, -7, -5, -5, -5, -4, -3, -2, -1, -1))
  }

  /**
   * Prueba para el método updatedQuickSort con una lista ordenada de forma descendente.
   */
  test("updatedQuickSort - Positive Test 7") {
    val result = Workshop2.updatedQuickSort(List(-5, -4, -3, -2, -1))
    assertEquals(result, List(-5, -4, -3, -2, -1))
  }

  /**
   * Prueba para el método updatedQuickSort con una lista que contiene un solo elemento.
   */
  test("updatedQuickSort - Positive Test 8") {
    val result = Workshop2.updatedQuickSort(List(-1))
    assertEquals(result, List(-1))
  }

  /**
   * Prueba para el método updatedQuickSort con una lista que contiene un solo elemento repetido.
   */
  test("updatedQuickSort - Positive Test 9") {
    val result = Workshop2.updatedQuickSort(List(-5, -5, -5, -5, -5))
    assertEquals(result, List(-5, -5, -5, -5, -5))
  }

  /**
   * Prueba para el método updatedQuickSort con una lista de números negativos.
   */
  test("updatedQuickSort - Positive Test 10") {
    val result = Workshop2.updatedQuickSort(List(-10, -5, -7, -3, -2, -1))
    assertEquals(result, List(-10, -7, -5, -3, -2, -1))
  }

  /**
   * Prueba para el método updatedQuickSort con una lista ordenada de forma ascendente.
   */
  test("updatedQuickSort - Positive Test 11") {
    val result = Workshop2.updatedQuickSort(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5))
    assertEquals(result, List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5))
  }

  /**
   * Prueba para el método updatedQuickSort con una lista mezclada de números positivos y negativos.
   */
  test("updatedQuickSort - Positive Test 12") {
    val result = Workshop2.updatedQuickSort(List(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5))
    assertEquals(result, List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5))
  }

}