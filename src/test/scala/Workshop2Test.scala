import munit.*
import workshop.Workshop2
import scala.collection.immutable.List

/**
 * Test class for the Workshop2 class.
 */
class Workshop2Test extends FunSuite {

  // Tests for equalList method
  /**
   * Test for the equalList method with a list containing the value provided as a pivot.
   */
  test("equalList - Positive Test 1") {
    val result = Workshop2.equalList(List(1, 2, 3), 2)
    assertEquals(result, List(2))
  }

  /**
   * Test for the equalList method with a list containing multiple instances of the value provided as a pivot.
   */
  test("equalList - Positive Test 2") {
    val result = Workshop2.equalList(List(5, 5, 5, 5), 5)
    assertEquals(result, List(5, 5, 5, 5))
  }

  /**
   * Test for the equalList method with a list that does not contain the value provided as a pivot.
   */
  test("equalList - Positive Test 3") {
    val result = Workshop2.equalList(List(1, 2, 3), 4)
    assertEquals(result, Nil)
  }

  /**
   * Test for the equalList method with an empty list.
   */
  test("equalList - Positive Test 4") {
    val result = Workshop2.equalList(List(), 5)
    assertEquals(result, Nil)
  }

  /**
   * Test for the equalList method with a list that does not contain the value provided as a pivot.
   */
  test("equalList - Positive Test 5") {
    val result = Workshop2.equalList(List(5, 6, 7, 8), 1)
    assertEquals(result, Nil)
  }

  // Tests for equalList method with negative numbers
  /**
   * Test for the equalList method with a list containing negative numbers.
   */
  test("equalList - Positive Test 6") {
    val result = Workshop2.equalList(List(-1, -2, -3), -2)
    assertEquals(result, List(-2))
  }

  /**
   * Test for the equalList method with a list containing multiple instances of the value provided as a pivot (negative numbers).
   */
  test("equalList - Positive Test 7") {
    val result = Workshop2.equalList(List(-5, -5, -5, -5), -5)
    assertEquals(result, List(-5, -5, -5, -5))
  }

  /**
   * Test for the equalList method with a list that does not contain the value provided as a pivot (negative numbers).
   */
  test("equalList - Positive Test 8") {
    val result = Workshop2.equalList(List(-1, -2, -3), -4)
    assertEquals(result, Nil)
  }

  /**
   * Test for the equalList method with an empty list.
   */
  test("equalList - Positive Test 9") {
    val result = Workshop2.equalList(List(), -5)
    assertEquals(result, Nil)
  }

  /**
   * Test for the equalList method with a list that does not contain the value provided as a pivot (negative numbers).
   */
  test("equalList - Positive Test 10") {
    val result = Workshop2.equalList(List(-5, -6, -7, -8), -1)
    assertEquals(result, Nil)
  }

  /**
   * Test for the equalList method with a list containing negative and positive numbers, where the pivot is 0.
   */
  test("equalList - Positive Test 11") {
    val result = Workshop2.equalList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0)
    assertEquals(result, List(0))
  }

  /**
   * Test for the equalList method with a list that does not contain the value provided as a pivot.
   */
  test("equalList - Positive Test 12") {
    val result = Workshop2.equalList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 6)
    assertEquals(result, Nil)
  }

  // Tests for greaterList method
  /**
   * Test for the greaterList method with a list containing elements greater than the pivot.
   */
  test("greaterList - Positive Test 1") {
    val result = Workshop2.greaterList(List(1, 2, 3), 2)
    assertEquals(result, List(3))
  }

  /**
   * Test for the equalList method with a list of equal numbers.
   */
  test("equalList - Positive Test 2") {
    val result = Workshop2.equalList(List(5, 5, 5, 5), 5)
    assertEquals(result, List(5, 5, 5, 5))
  }

  /**
   * Test for the equalList method with a list of numbers not equal to the pivot.
   */
  test("equalList - Positive Test 3") {
    val result = Workshop2.equalList(List(1, 2, 3), 4)
    assertEquals(result, Nil)
  }

  /**
   * Test for the equalList method with an empty list.
   */
  test("equalList - Positive Test 4") {
    val result = Workshop2.equalList(List(), 5)
    assertEquals(result, Nil)
  }

  /**
   * Test for the equalList method with a list not equal to the pivot.
   */
  test("equalList - Positive Test 5") {
    val result = Workshop2.equalList(List(5, 6, 7, 8), 1)
    assertEquals(result, Nil)
  }

  // Tests for the greaterList method

  /**
   * Test for the greaterList method with a list of positive numbers.
   */
  test("greaterList - Positive Test 1") {
    val result = Workshop2.greaterList(List(1, 2, 3), 2)
    assertEquals(result, List(3))
  }

  /**
   * Test for the method greaterList with a list of numbers equal to the pivot.
   */
  test("greaterList - Positive Test 2") {
    val result = Workshop2.greaterList(List(5, 5, 5, 5), 4)
    assertEquals(result, List(5, 5, 5, 5))
  }

  /**
   * Test for the greaterList method with a list of numbers less than the pivot number.
   */
  test("greaterList - Positive Test 3") {
    val result = Workshop2.greaterList(List(1, 2, 3), 0)
    assertEquals(result, List(1, 2, 3))
  }

  /**
   * Test for the greaterList method with an empty list.
   */
  test("greaterList - Positive Test 4") {
    val result = Workshop2.greaterList(List(), 5)
    assertEquals(result, Nil)
  }

  /**
   * Test for the greaterList method with a list of numbers larger than the pivot.
   */
  test("greaterList - Positive Test 5") {
    val result = Workshop2.greaterList(List(5, 6, 7, 8), 1)
    assertEquals(result, List(5, 6, 7, 8))
  }

  // Tests for the lowerList method

  /**
   * Test for the lowerList method with a list of positive numbers.
   */
  test("lowerList - Positive Test 1") {
    val result = Workshop2.lowerList(List(1, 2, 3), 2)
    assertEquals(result, List(1))
  }

  /**
   * Test for the lowerList method with a list of numbers equal to the pivot.
   */
  test("lowerList - Positive Test 2") {
    val result = Workshop2.lowerList(List(5, 5, 5, 5), 6)
    assertEquals(result, List(5, 5, 5, 5))
  }

  /**
   * Test for the lowerList method with a list of numbers larger than the pivot.
   */
  test("lowerList - Positive Test 3") {
    val result = Workshop2.lowerList(List(1, 2, 3), 4)
    assertEquals(result, List(1, 2, 3))
  }

  /**
   * Test for the lowerList method with an empty list.
   */
  test("lowerList - Positive Test 4") {
    val result = Workshop2.lowerList(List(), 5)
    assertEquals(result, Nil)
  }

  /**
   * Test for the lowerList method with a list with no numbers less than the pivot number.
   */
  test("lowerList - Positive Test 5") {
    val result = Workshop2.lowerList(List(5, 6, 7, 8), 1)
    assertEquals(result, Nil)
  }

  // Tests for lowerList method with negative numbers

  /**
   * Test for lowerList method with a list of negative numbers.
   */
  test("lowerList - Positive Test 6") {
    val result = Workshop2.lowerList(List(-1, -2, -3), -2)
    assertEquals(result, List(-3))
  }

  /**
   * Test for the lowerList method with a list of negative numbers equal to the pivot.
   */
  test("lowerList - Positive Test 7") {
    val result = Workshop2.lowerList(List(-5, -5, -5, -5), -4)
    assertEquals(result, List(-5, -5, -5, -5))
  }

  /**
   * Test for the lowerList method with a list of negative numbers without numbers smaller than the pivot.
   */
  test("lowerList - Positive Test 8") {
    val result = Workshop2.lowerList(List(-1, -2, -3), -4)
    assertEquals(result, Nil)
  }

  /**
   * Test for the lowerList method with an empty list.
   */
  test("lowerList - Positive Test 9") {
    val result = Workshop2.lowerList(List(), -5)
    assertEquals(result, Nil)
  }

  /**
   * Test for the lowerList method with a list of negative numbers larger than the pivot.
   */
  test("lowerList - Positive Test 10") {
    val result = Workshop2.lowerList(List(-5, -6, -7, -8), -1)
    assertEquals(result, List(-5, -6, -7, -8))
  }

  /**
   * Test for lowerList method with a list of negative and positive numbers, where the pivot is 0.
   */
  test("lowerList - Positive Test 11") {
    val result = Workshop2.lowerList(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0)
    assertEquals(result, List(-5, -4, -3, -2, -1))
  }

  /**
   * Test for the lowerList method with a list of negative and positive numbers, where there are no numbers smaller than the pivot.
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
   * Test for the updatedQuickSort method with a descending sorted list.
   */
  test("updatedQuickSort - Positive Test 2") {
    val result = Workshop2.updatedQuickSort(List(5, 4, 3, 2, 1))
    assertEquals(result, List(1, 2, 3, 4, 5))
  }

  /**
   * Test for the updatedQuickSort method with a list containing a single element.
   */
  test("updatedQuickSort - Positive Test 3") {
    val result = Workshop2.updatedQuickSort(List(1))
    assertEquals(result, List(1))
  }

  /**
   * Test for the updatedQuickSort method with an empty list.
   */
  test("updatedQuickSort - Positive Test 4") {
    val result = Workshop2.updatedQuickSort(List())
    assertEquals(result, Nil)
  }

  /**
   * Test for the updatedQuickSort method with a list containing a single repeated element.
   */
  test("updatedQuickSort - Positive Test 5") {
    val result = Workshop2.updatedQuickSort(List(1, 1, 1, 1, 1))
    assertEquals(result, List(1, 1, 1, 1, 1))
  }

  // Tests for updatedQuickSort method with negative numbers

  /**
   * Test for the updatedQuickSort method with a list containing negative and positive elements.
   */
  test("updatedQuickSort - Positive Test 6") {
    val result = Workshop2.updatedQuickSort(List(-1, -4, -2, -5, -7, -23, -5, -1, -3, -5))
    assertEquals(result, List(-23, -7, -5, -5, -5, -4, -3, -2, -1, -1))
  }

  /**
   * Test for the updatedQuickSort method with a descending sorted list.
   */
  test("updatedQuickSort - Positive Test 7") {
    val result = Workshop2.updatedQuickSort(List(-5, -4, -3, -2, -1))
    assertEquals(result, List(-5, -4, -3, -2, -1))
  }

  /**
   * Test for the updatedQuickSort method with a list containing a single element.
   */
  test("updatedQuickSort - Positive Test 8") {
    val result = Workshop2.updatedQuickSort(List(-1))
    assertEquals(result, List(-1))
  }

  /**
   * Test for the updatedQuickSort method with a list containing a single repeated element.
   */
  test("updatedQuickSort - Positive Test 9") {
    val result = Workshop2.updatedQuickSort(List(-5, -5, -5, -5, -5))
    assertEquals(result, List(-5, -5, -5, -5, -5))
  }

  /**
   * Test for the updatedQuickSort method with a list of negative numbers.
   */
  test("updatedQuickSort - Positive Test 10") {
    val result = Workshop2.updatedQuickSort(List(-10, -5, -7, -3, -2, -1))
    assertEquals(result, List(-10, -7, -5, -3, -2, -1))
  }

  /**
   * Test for the updatedQuickSort method with a list sorted in ascending order.
   */
  test("updatedQuickSort - Positive Test 11") {
    val result = Workshop2.updatedQuickSort(List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5))
    assertEquals(result, List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5))
  }

  /**
   * Test for the updatedQuickSort method with a mixed list of positive and negative numbers.
   */
  test("updatedQuickSort - Positive Test 12") {
    val result = Workshop2.updatedQuickSort(List(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5))
    assertEquals(result, List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5))
  }

}