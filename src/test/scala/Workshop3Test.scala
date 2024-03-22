import munit.*
import workshop.Workshop3

class Workshop3Test extends FunSuite{


  test("bucketSortGeneric - Positive Test 1: Unordered list of positive numbers") {
    val arr = List(5, 2, 9, 3, 7, 1, 4, 8, 6)
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Int, b: Int) => a < b, (x: Int, max: Int, numBuckets: Int) => (x * numBuckets) / (max + 1), 9, 1)
    assertEquals(sortedArr, List(1, 2, 3, 4, 5, 6, 7, 8, 9))
  }

  test("bucketSortGeneric - Positive Test 2: Unordered list of negative numbers") {
    val arr = List(-5, -2, -9, -3, -7, -1, -4, -8, -6)
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Int, b: Int) => a < b, (x: Int, max: Int, numBuckets: Int) => (x * numBuckets) / (max + 1), 9, 1)
    assertEquals(sortedArr, List(-9, -8, -7, -6, -5, -4, -3, -2, -1))
  }

  test("bucketSortGeneric - Positive Test 3: Ordered list of positive numbers") {
    val arr = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Int, b: Int) => a < b, (x: Int, max: Int, numBuckets: Int) => (x * numBuckets) / (max + 1), 9, 1)
    assertEquals(sortedArr, List(1, 2, 3, 4, 5, 6, 7, 8, 9))
  }

  test("bucketSortGeneric - Positive Test 4: Ordered list of negative numbers") {
    val arr = List(-1, -2, -3, -4, -5, -6, -7, -8, -9)
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Int, b: Int) => a < b, (x: Int, max: Int, numBuckets: Int) => (x * numBuckets) / (max + 1), 9, 1)
    assertEquals(sortedArr, List(-9, -8, -7, -6, -5, -4, -3, -2, -1))
  }

  test("bucketSortGeneric - Positive Test 5: Empty list of integers") {
    val arr = List.empty[Int]
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Int, b: Int) => a < b, (x: Int, max: Int, numBuckets: Int) => (x * numBuckets) / (max + 1), 0, 0)
    assertEquals(sortedArr, List.empty[Int])
  }

  // Tests for BucketSortGeneric Doubles

  test("bucketSortGeneric - Positive Test 1: Unordered list of positive numbers") {
    val arr = List(5.0, 2.0, 9.0, 3.0, 7.0, 1.0, 4.0, 8.0, 6.0)
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Double, b: Double) => a < b, (x: Double, max: Double, numBuckets: Int) => ((x * numBuckets) / (max + 1)).toInt, 9.0, 1.0)
    assertEquals(sortedArr, List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0))
  }

  test("bucketSortGeneric - Positive Test 2: Unordered list of negative numbers") {
    val arr = List(-5.0, -2.0, -9.0, -3.0, -7.0, -1.0, -4.0, -8.0, -6.0)
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Double, b: Double) => a < b, (x: Double, max: Double, numBuckets: Int) => (((x - max) * numBuckets) / (1 - max)).toInt, -1.0, -9.0)
    assertEquals(sortedArr, List(-9.0, -8.0, -7.0, -6.0, -5.0, -4.0, -3.0, -2.0, -1.0))
  }

  test("bucketSortGeneric - Positive Test 3: Ordered list of positive numbers") {
    val arr = List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Double, b: Double) => a < b, (x: Double, max: Double, numBuckets: Int) => ((x * numBuckets) / (max + 1)).toInt, 9.0, 1.0)
    assertEquals(sortedArr, List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0))
  }

  test("bucketSortGeneric - Positive Test 4: Ordered list of negative numbers") {
    val arr = List(-1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0)
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Double, b: Double) => a < b, (x: Double, max: Double, numBuckets: Int) => (((x - max) * numBuckets) / (1 - max)).toInt, -1.0, -9.0)
    assertEquals(sortedArr, List(-9.0, -8.0, -7.0, -6.0, -5.0, -4.0, -3.0, -2.0, -1.0))
  }

  test("bucketSortGeneric - Positive Test 5: Lista vacía") {
    val arr = List.empty[Double]
    val sortedArr = Workshop3.bucketSortGeneric(arr, (a: Double, b: Double) => a < b, (x: Double, max: Double, numBuckets: Int) => ((x * numBuckets) / (max + 1)).toInt, 0.0, 0.0)
    assertEquals(sortedArr, List.empty[Double])
  }




  /**
   * The comparedAlphanumeric function is a recursive
   * function that compares two strings `str1` and `str2`
   * character by character in an alphanumeric manner.
   * It starts comparing characters at the specified index
   * (default is 0) and recursively moves to the next character
   * if the current characters are equal.
   */
  def comparedAlphanumeric(str1: String, str2: String, index: Int = 0): Boolean = {
    if (index >= str1.length || index >= str2.length) {
      return str1.length < str2.length
    }
    val char1 = str1.charAt(index)
    val char2 = str2.charAt(index)
    if (char1 != char2) {
      return char1 < char2
    } else {
      return comparedAlphanumeric(str1, str2, index + 1)
    }
  }

  /**
   * The `comparedChar` function is a simple comparison function that
   * takes two characters `c1` and `c2` as input parameters and returns
   * a boolean value based on the comparison result of these characters.
   */
  def comparedChar(c1: Char, c2: Char): Boolean = {
    c1 < c2
  }

  /**
   * The `comparedStringSize` function you provided seems to be a comparison
   * function that takes two strings `x` and `head` as input parameters.
   * It checks if the length of string `x` is less than or equal to the
   * length of string `head` and returns a boolean value based on this comparison.
   */
  def comparedStringSize(x:String, head:String):Boolean={
    x.length <= head.length
  }



  /*
  test("BucketSort with unordered positive numbers") {
    val input = List(4.3, 2.1, 9.8, 1.5, 6.7)
    val expectedOutput = List(1.5, 2.1, 4.3, 6.7, 9.8)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }

  test("BucketSort with unordered negative and positive numbers") {
    val input = List(-3.2, 5.7, -1.1, 8.9, 0.5)
    val expectedOutput = List(-3.2, -1.1, 0.5, 5.7, 8.9)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }

  test("BucketSort with list containing duplicates") {
    val input = List(3.2, 1.5, 3.2, 2.1, 2.1)
    val expectedOutput = List(1.5, 2.1, 2.1, 3.2, 3.2)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }

  test("BucketSort with empty list") {
    val input = List[Double]()
    val expectedOutput = List[Double]()
    assertEquals(expectedOutput, Workshop3.sort(input))
  }

  test("BucketSort with single element list") {
    val input = List(10.0)
    val expectedOutput = List(10.0)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }

  test("BucketSort with already sorted list") {
    val input = List(1.0, 2.0, 3.0, 4.0, 5.0)
    val expectedOutput = List(1.0, 2.0, 3.0, 4.0, 5.0)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }

  test("BucketSort with reverse order list") {
    val input = List(5.0, 4.0, 3.0, 2.0, 1.0)
    val expectedOutput = List(1.0, 2.0, 3.0, 4.0, 5.0)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }

  test("BucketSort with unordered positive and negative numbers") {
    val input = List(4.3, -2.1, 9.8, -1.5, 6.7)
    val expectedOutput = List(-2.1, -1.5, 4.3, 6.7, 9.8)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }

  test("BucketSort with all elements equal") {
    val input = List(3.5, 3.5, 3.5, 3.5, 3.5)
    val expectedOutput = List(3.5, 3.5, 3.5, 3.5, 3.5)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }

  test("BucketSort with repeated and mixed order") {
    val input = List(5.7, 2.1, 5.7, 3.2, 2.1, 8.9)
    val expectedOutput = List(2.1, 2.1, 3.2, 5.7, 5.7, 8.9)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }


  test("BucketSort with high precision floating point numbers") {
    val input = List(99999.999, 12345.678, 54321.987, 98765.432, 67890.123)
    val expectedOutput = List(12345.678, 54321.987, 67890.123, 98765.432, 99999.999)
    assertEquals(expectedOutput, Workshop3.sort(input))
  }
*/
}
