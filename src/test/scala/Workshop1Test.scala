import munit.*
import workshop.Workshop1
import scala.collection.immutable.List

class Workshop1Test extends FunSuite {
  //test for countInversions method
  test("countInversions - not ordered list 1") {
    val result = Workshop1.countInversions(List(4, 2, 1, 3, 5, 7))
    assertEquals(result, 4)
  }

  test("countInversions - not ordered list 2") {
    val result = Workshop1.countInversions(List(2, 3, 9, 2, 9))
    assertEquals(result, 2)
  }

  test("countInversions - ordered backwards list 1") {
    val result = Workshop1.countInversions(List(5, 4, 3, 2, 1))
    assertEquals(result, 10)
  }

  test("countInversions - ordered list") {
    val result = Workshop1.countInversions(List(0, 1, 2, 3, 4, 5))
    assertEquals(result, 0)
  }

  test("countInversions - ordered backwards list 2") {
    val result = Workshop1.countInversions(List(4, 3, 2, 1))
    assertEquals(result, 6)
  }

  test("countInversions - emptyList") {
    val result = Workshop1.countInversions(List())
    assertEquals(result, 0)
  }

  test("countInversions - one element list") {
    val result = Workshop1.countInversions(List(1))
    assertEquals(result, 0)
  }

  test("countInversions - two elements list") {
    val result = Workshop1.countInversions(List(2, 1))
    assertEquals(result, 1)
  }

  test("countInversions - not ordered repeated elements") {
    val result = Workshop1.countInversions(List(2, 2, 1, 1))
    assertEquals(result, 4)
  }

  test("countInversions - ordered repeated elements") {
    val result = Workshop1.countInversions(List(1, 1, 2, 2))
    assertEquals(result, 0)
  }



  // Tests for countBiggerInList method
  test("countBiggerInList - not ordered list 1") {
    val result = Workshop1.countBiggerInList(4, List(2, 1, 3, 5, 7), 0)
    assertEquals(result, 3)
  }

  test("countBiggerInList - not ordered list 2") {
    val result = Workshop1.countBiggerInList(2, List(3, 9, 2, 9), 0)
    assertEquals(result, 0)
  }

  test("countBiggerInList - ordered backwards list 1") {
    val result = Workshop1.countBiggerInList(5, List(4, 3, 2, 1), 0)
    assertEquals(result, 4)
  }

  test("countBiggerInList - ordered list") {
    val result = Workshop1.countBiggerInList(0, List(1, 2, 3, 4, 5), 0)
    assertEquals(result, 0)
  }

  test("countBiggerInList - ordered backwards list 2") {
    val result = Workshop1.countBiggerInList(4, List(3, 2, 1), 0)
    assertEquals(result, 3)
  }

  test("countBiggerInList - one element list") {
    val result = Workshop1.countBiggerInList(1, List(), 0)
    assertEquals(result, 0)
  }

  test("countBiggerInList - two elements list") {
    val result = Workshop1.countBiggerInList(2, List(1), 0)
    assertEquals(result, 1)
  }

  test("countBiggerInList - not ordered repeated elements") {
    val result = Workshop1.countBiggerInList(2, List(2, 1, 1), 0)
    assertEquals(result, 2)
  }

  test("countBiggerInList - ordered repeated elements") {
    val result = Workshop1.countBiggerInList(1, List(1, 2, 2), 0)
    assertEquals(result, 0)
  }



  // Tests for isBigger method
  test("isBigger - both positive smaller") {
    val result = Workshop1.isBigger(1, 2)
    assertEquals(result, 0)
  }

  test("isBigger - both positive bigger") {
    val result = Workshop1.isBigger(2, 1)
    assertEquals(result, 1)
  }

  test("isBigger - both negative smaller") {
    val result = Workshop1.isBigger(-2, -1)
    assertEquals(result, 0)
  }

  test("isBigger - both negative bigger") {
    val result = Workshop1.isBigger(-1, -2)
    assertEquals(result, 1)
  }

  test("isBigger - one negative, one positive, bigger") {
    val result = Workshop1.isBigger(2, -1)
    assertEquals(result, 1)
  }

  test("isBigger - one negative, one positive, smaller") {
    val result = Workshop1.isBigger(-2, 1)
    assertEquals(result, 0)
  }

  test("isBigger - both positive equal") {
    val result = Workshop1.isBigger(2, 2)
    assertEquals(result, 0)
  }

  test("isBigger - both negative equal") {
    val result = Workshop1.isBigger(-2, -2)
    assertEquals(result, 0)
  }

  test("isBigger - both zero equal") {
    val result = Workshop1.isBigger(0, 0)
    assertEquals(result, 0)
  }

}