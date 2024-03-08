import munit.*
import workshop.Workshop2
import scala.collection.immutable.List

class Workshop2Test extends FunSuite {
  // Tests for equalList method
  test("equalList - Positive Test 1") {
    val result = Workshop2.equalList(List(1, 2, 3), 2)
    assertEquals(result, List(2))
  }

  test("equalList - Positive Test 2") {
    val result = Workshop2.equalList(List(5, 5, 5, 5), 5)
    assertEquals(result, List(5, 5, 5, 5))
  }

  test("equalList - Positive Test 3") {
    val result = Workshop2.equalList(List(1, 2, 3), 4)
    assertEquals(result, Nil)
  }

  test("equalList - Positive Test 4") {
    val result = Workshop2.equalList(List(), 5)
    assertEquals(result, Nil)
  }

  test("equalList - Positive Test 5") {
    val result = Workshop2.equalList(List(5, 6, 7, 8), 1)
    assertEquals(result, Nil)
  }

  // Tests for equalList method with negative numbers
  test("equalList - Positive Test 6") {
    val result = Workshop2.equalList(List(-1, -2, -3), -2)
    assertEquals(result, List(-2))
  }

  test("equalList - Positive Test 7") {
    val result = Workshop2.equalList(List(-5, -5, -5, -5), -5)
    assertEquals(result, List(-5, -5, -5, -5))
  }

  test("equalList - Positive Test 8") {
    val result = Workshop2.equalList(List(-1, -2, -3), -4)
    assertEquals(result, Nil)
  }

  test("equalList - Positive Test 9") {
    val result = Workshop2.equalList(List(), -5)
    assertEquals(result, Nil)
  }

  test("equalList - Positive Test 10") {
    val result = Workshop2.equalList(List(-5, -6, -7, -8), -1)
    assertEquals(result, Nil)
  }

  // Tests for equalList method with negatives and positives
  test("equalList - Positive Test 11") {
    val result = Workshop2.equalList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0)
    assertEquals(result, List(0))
  }

  test("equalList - Positive Test 12") {
    val result = Workshop2.equalList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 6)
    assertEquals(result, Nil)
  }



  // Tests for greaterList method
  test("greaterList - Positive Test 1") {
    val result = Workshop2.greaterList(List(1, 2, 3), 2)
    assertEquals(result, List(3))
  }

  test("greaterList - Positive Test 2") {
    val result = Workshop2.greaterList(List(5, 5, 5, 5), 4)
    assertEquals(result, List(5, 5, 5, 5))
  }

  test("greaterList - Positive Test 3") {
    val result = Workshop2.greaterList(List(1, 2, 3), 0)
    assertEquals(result, List(1, 2, 3))
  }

  test("greaterList - Positive Test 4") {
    val result = Workshop2.greaterList(List(), 5)
    assertEquals(result, Nil)
  }

  test("greaterList - Positive Test 5") {
    val result = Workshop2.greaterList(List(5, 6, 7, 8), 1)
    assertEquals(result, List(5, 6, 7, 8))
  }

  // Tests for greaterList method with negative numbers
  test("greaterList - Positive Test 6") {
    val result = Workshop2.greaterList(List(-1, -2, -3), -2)
    assertEquals(result, List(-1))
  }

  test("greaterList - Positive Test 7") {
    val result = Workshop2.greaterList(List(-5, -5, -5, -5), -6)
    assertEquals(result, List(-5, -5, -5, -5))
  }

  test("greaterList - Positive Test 8") {
    val result = Workshop2.greaterList(List(-1, -2, -3, -4), -4)
    assertEquals(result,  List(-1,-2,-3))
  }

  test("greaterList - Positive Test 9") {
    val result = Workshop2.greaterList(List(), -5)
    assertEquals(result, Nil)
  }

  test("greaterList - Positive Test 10") {
    val result = Workshop2.greaterList(List(-5, -6, -7, -8), -10)
    assertEquals(result, List(-5, -6, -7, -8))
  }

  // Tests for greaterList method with negatives and positives
  test("greaterList - Positive Test 11") {
    val result = Workshop2.greaterList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0)
    assertEquals(result, List(1, 2, 3, 4, 5))
  }

  test("greaterList - Positive Test 12") {
    val result = Workshop2.greaterList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 6)
    assertEquals(result, Nil)
  }

  // Tests for lowerList method
  test("lowerList - Positive Test 1") {
    val result = Workshop2.lowerList(List(1, 2, 3), 2)
    assertEquals(result, List(1))
  }

  test("lowerList - Positive Test 2") {
    val result = Workshop2.lowerList(List(5, 5, 5, 5), 6)
    assertEquals(result, List(5, 5, 5, 5))
  }

  test("lowerList - Positive Test 3") {
    val result = Workshop2.lowerList(List(1, 2, 3), 4)
    assertEquals(result, List(1, 2, 3))
  }

  test("lowerList - Positive Test 4") {
    val result = Workshop2.lowerList(List(), 5)
    assertEquals(result, Nil)
  }

  test("lowerList - Positive Test 5") {
    val result = Workshop2.lowerList(List(5, 6, 7, 8), 1)
    assertEquals(result, Nil)
  }

  // Tests for lowerList method with negative numbers
  test("lowerList - Positive Test 6") {
    val result = Workshop2.lowerList(List(-1, -2, -3), -2)
    assertEquals(result, List(-3))
  }

  test("lowerList - Positive Test 7") {
    val result = Workshop2.lowerList(List(-5, -5, -5, -5), -4)
    assertEquals(result, List(-5, -5, -5, -5))
  }

  test("lowerList - Positive Test 8") {
    val result = Workshop2.lowerList(List(-1, -2, -3), -4)
    assertEquals(result, Nil)
  }

  test("lowerList - Positive Test 9") {
    val result = Workshop2.lowerList(List(), -5)
    assertEquals(result, Nil)
  }

  test("lowerList - Positive Test 10") {
    val result = Workshop2.lowerList(List(-5, -6, -7, -8), -1)
    assertEquals(result, List(-5, -6, -7, -8))
  }

  test("lowerList - Positive Test 11") {
    val result = Workshop2.lowerList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0)
    assertEquals(result, List(-5, -4, -3, -2, -1))
  }

  test("lowerList - Positive Test 12") {
    val result = Workshop2.lowerList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), -6)
    assertEquals(result, Nil)
  }


  // Tests for updatedQuickSort method
  test("updatedQuickSort - Positive Test 1") {
    val result = Workshop2.updatedQuickSort(List(1, 4, 2, 5, 7, 23, 5, 1, 3, 5))
    assertEquals(result, List(1, 1, 2, 3, 4, 5, 5, 5, 7, 23))
  }

  test("updatedQuickSort - Positive Test 2") {
    val result = Workshop2.updatedQuickSort(List(5, 4, 3, 2, 1))
    assertEquals(result, List(1, 2, 3, 4, 5))
  }

  test("updatedQuickSort - Positive Test 3") {
    val result = Workshop2.updatedQuickSort(List(1))
    assertEquals(result, List(1))
  }

  test("updatedQuickSort - Positive Test 4") {
    val result = Workshop2.updatedQuickSort(List())
    assertEquals(result, Nil)
  }

  test("updatedQuickSort - Positive Test 5") {
    val result = Workshop2.updatedQuickSort(List(1, 1, 1, 1, 1))
    assertEquals(result, List(1, 1, 1, 1, 1))
  }

  // Tests for updatedQuickSort method with negative numbers
  test("updatedQuickSort - Positive Test 6") {
    val result = Workshop2.updatedQuickSort(List(-1, -4, -2, -5, -7, -23, -5, -1, -3, -5))
    assertEquals(result, List(-23, -7, -5, -5, -5, -4, -3, -2, -1, -1))
  }

  test("updatedQuickSort - Positive Test 7") {
    val result = Workshop2.updatedQuickSort(List(-5, -4, -3, -2, -1))
    println(result)
    assertEquals(result, List(-5, -4, -3, -2, -1))
  }

  test("updatedQuickSort - Positive Test 8") {
    val result = Workshop2.updatedQuickSort(List(-1))
    assertEquals(result, List(-1))
  }

  test("updatedQuickSort - Positive Test 9") {
    val result = Workshop2.updatedQuickSort(List(-5, -5, -5, -5, -5))
    assertEquals(result, List(-5, -5, -5, -5, -5))
  }

  test("updatedQuickSort - Positive Test 10") {
    val result = Workshop2.updatedQuickSort(List(-10, -5, -7, -3, -2, -1))
    assertEquals(result, List(-10, -7, -5, -3, -2, -1))
  }

  test("updatedQuickSort - Positive Test 11") {
    val result = Workshop2.updatedQuickSort(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5))
    assertEquals(result, List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5))
  }

  test("updatedQuickSort - Positive Test 12") {
    val result = Workshop2.updatedQuickSort(List(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5))
    assertEquals(result, List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5))
  }




}
