import munit.*
import workshop.Workshop1
import scala.collection.immutable.List

/**
 * Test suite for the Workshop1 class.
 */
class Workshop1Test extends FunSuite {
  //test for countInversions method

  /**
   * Test case for countInversions method with a not ordered list.
   */
  test("countInversions - not ordered list 1") {
    val result = Workshop1.countInversions(List(4, 2, 1, 3, 5, 7))
    assertEquals(result, 4)
  }

  /**
   * Test case for countInversions method with another not ordered list.
   */
  test("countInversions - not ordered list 2") {
    val result = Workshop1.countInversions(List(2, 3, 9, 2, 9))
    assertEquals(result, 2)
  }

  /**
   * Test case for countInversions method with an ordered backwards list.
   */
  test("countInversions - ordered backwards list 1") {
    val result = Workshop1.countInversions(List(5, 4, 3, 2, 1))
    assertEquals(result, 10)
  }

  /**
   * Test case for countInversions method with an ordered list.
   */
  test("countInversions - ordered list") {
    val result = Workshop1.countInversions(List(0, 1, 2, 3, 4, 5))
    assertEquals(result, 0)
  }

  /**
   * Test case for countInversions method with another ordered backwards list.
   */
  test("countInversions - ordered backwards list 2") {
    val result = Workshop1.countInversions(List(4, 3, 2, 1))
    assertEquals(result, 6)
  }

  /**
   * Test case for countInversions method with an empty list.
   */
  test("countInversions - emptyList") {
    val result = Workshop1.countInversions(List())
    assertEquals(result, 0)
  }

  /**
   * Test case for countInversions method with a one-element list.
   */
  test("countInversions - one element list") {
    val result = Workshop1.countInversions(List(1))
    assertEquals(result, 0)
  }

  /**
   * Test case for countInversions method with a two-element list.
   */
  test("countInversions - two elements list") {
    val result = Workshop1.countInversions(List(2, 1))
    assertEquals(result, 1)
  }

  /**
   * Test case for countInversions method with not ordered repeated elements.
   */
  test("countInversions - not ordered repeated elements") {
    val result = Workshop1.countInversions(List(2, 2, 1, 1))
    assertEquals(result, 4)
  }

  /**
   * Test case for countInversions method with ordered repeated elements.
   */
  test("countInversions - ordered repeated elements") {
    val result = Workshop1.countInversions(List(1, 1, 2, 2))
    assertEquals(result, 0)
  }

}