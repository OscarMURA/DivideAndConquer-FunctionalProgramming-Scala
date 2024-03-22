import munit.*
import workshop.{FileManager, Workshop3}

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
  def comparedAlphanumeric(str1: String, str2: String):Boolean={
    def compared(str1: String, str2: String, index: Int = 0): Boolean = {
      if (index >= str1.length || index >= str2.length) {
        return str1.length < str2.length
      }
      val char1 = str1.charAt(index)
      val char2 = str2.charAt(index)
      if (char1 != char2) {
        return char1 < char2
      } else {
        return compared(str1, str2, index + 1)
      }

    }
    compared(str1,str2,0)
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

  test("bucketSortGeneric - Positive Test 1: BucketSort with unordered character") {
    val input:List[Char]=List('z','x','p','l','i','f','d','e','i','a')
    val expectedOutput:List[Char]=List('a', 'd', 'e', 'f', 'i', 'i', 'l', 'p', 'x', 'z')
    val result:List[Char]=Workshop3.bucketSortGeneric(input,comparedChar, (value: Char, maxVal: Char, numBuckets: Int) => {
      val interval = (maxVal - 'a' + 1).toDouble / numBuckets.toDouble
      ((value - 'a').toDouble / interval).toInt
    },input.max,input.min)
    assertEquals(result,expectedOutput)

  }

  test("bucketSortGeneric - Positive Test 2:BucketSort with character sorted from last to first (alphabet order)") {
    val input = List('z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q')
    val expectedOutput = List('q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    val result = Workshop3.bucketSortGeneric(input, comparedChar, (value: Char, maxVal: Char, numBuckets: Int) => {
      val interval = (maxVal - 'a' + 1).toDouble / numBuckets.toDouble
      ((value - 'a').toDouble / interval).toInt
    }, input.max, input.min)
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 3: BucketSort with unordered number character") {
    val input :List[Char]= List('5', '9', '0',  '3', '7', '6', '1', '8', '4')
    val expectedOutput:List[Char] = List( '0', '1', '3', '4', '5', '6', '7', '8', '9')
    val result:List[Char] = Workshop3.bucketSortGeneric(input, comparedChar, (value: Char, maxVal: Char, numBuckets: Int) => {
      val interval = (maxVal - ' ' + 1).toDouble / numBuckets.toDouble
      ((value - ' ').toDouble / interval).toInt
    }, input.max, input.min)
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 4: BucketSort with numerical character sorted in descending order") {
    val input:List[Char] = List('9', '8', '7', '6', '5', '4', '3', '1', '0', ' ')
    val expectedOutput:List[Char] = List(' ', '0', '1', '3', '4', '5', '6', '7', '8', '9')
    val result:List[Char] = Workshop3.bucketSortGeneric(input, comparedChar, (value: Char, maxVal: Char, numBuckets: Int) => {
      val interval = (maxVal - ' ' + 1).toDouble / numBuckets.toDouble
      ((value - ' ').toDouble / interval).toInt
    }, input.max, input.min)
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 5: BucketSort with character and char of numbers in disorder") {
    val input:List[Char] = List('e', '7', 'c', '5', 'a', '4', 'b', '3', 'd', '2')
    val expectedOutput:List[Char] = List('2', '3', '4', '5', '7', 'a', 'b', 'c', 'd', 'e')
    val result:List[Char] = Workshop3.bucketSortGeneric(input, comparedChar, (value: Char, maxVal: Char, numBuckets: Int) => {
      val interval = (maxVal - ' ' + 1).toDouble / numBuckets.toDouble
      ((value - ' ').toDouble / interval).toInt
    }, input.max, input.min)
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 6: BucketSort with an empty list char"){
    val input:List[Char] = List()
    val expectedOutput:List[Char] = List()
    val result:List[Char] = Workshop3.bucketSortGeneric(input, comparedChar, (value: Char, maxVal: Char, numBuckets: Int) => {
      val interval = (maxVal - ' ' + 1).toDouble / numBuckets.toDouble
      ((value - ' ').toDouble / interval).toInt
    }, ' ', ' ')
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 1: BucketSort with an unordered list of strings of different sizes") {
    val input: List[String] = List("elephant", "banana", "kiwi", "orange", "pear", "apple")
    val expectedOutput: List[String] =  List("pear", "kiwi", "apple", "orange", "banana", "elephant")
    val result: List[String] = Workshop3.bucketSortGeneric(input, comparedStringSize,
      (head: String, maxVal: String, size: Int) => Math.min((head.length / maxVal.length * (size - (0.4))).toInt, size - 1)
      , input.max, input.min)
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 2: BucketSort with a sorted list from largest to smallest of strings of different sizes") {
    val input: List[String] = List("watermelons", "elephants", "oranges",   "banana", "apple", "grap", "man", "hi")
    val expectedOutput: List[String] =  List("hi", "man", "grap", "apple", "banana", "oranges", "elephants", "watermelons")
    val result: List[String] = Workshop3.bucketSortGeneric(input, comparedStringSize,
      (head: String, maxVal: String, size: Int) => Math.min((head.length / maxVal.length * (size - (0.5))).toInt, size - 1)
      , input.max, input.min)
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 3: BucketSort with a list of one-item strings"){
    val input:List[String]= List("klmnopqrst")
    val result: List[String] = Workshop3.bucketSortGeneric(input, comparedStringSize,
      (value: String, maxVal: String, numBuckets: Int) => {
        val interval = maxVal.length / numBuckets.toDouble
        Math.min((value.length / interval).toInt, numBuckets - 1)
      }, input.max, input.min)
    assertEquals(result, input)
  }

  test("bucketSortGeneric - Positive Test 1: BucketSort with an unordered string list for alphanumeric sorting") {
    val input: List[String] = List("watermelons", "elephants", "oranges", "banana", "apple", "grap", "man", "hi")
    val expectedOutput: List[String] = List("apple", "banana", "elephants", "grap", "hi", "man", "oranges", "watermelons")
    val result: List[String] = Workshop3.bucketSortGeneric(input, comparedAlphanumeric,
      (head: String, maxVal: String, size: Int) => Math.min((head.length / maxVal.length * (size - (0.5))).toInt, size - 1)
      , input.max, input.min)
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 2: BucketSort with a list of strings sorted from order z to \"a\" to sort alphabetically") {
    val input: List[String] = List("watermelons", "oranges", "man", "hi", "grap", "elephants", "banana", "apple")
    val expectedOutput: List[String] = List("apple", "banana", "elephants", "grap", "hi", "man", "oranges", "watermelons")
    val result: List[String] = Workshop3.bucketSortGeneric(input, comparedAlphanumeric,
      (head: String, maxVal: String, size: Int) => Math.min((head.length / maxVal.length * (size - (0.5))).toInt, size - 1)
      , input.max, input.min)
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 3: BucketSort with an unordered list of letter strings") {
    val input: List[String] =  List("z", "x", "p", "l", "i", "f", "d", "e", "a", "c")
    val expectedOutput: List[String] = List("a", "c", "d", "e", "f", "i", "l", "p", "x", "z")
    val result: List[String] = Workshop3.bucketSortGeneric(input, comparedAlphanumeric,
      (head: String, maxVal: String, size
      : Int) => Math.min((head.length / maxVal.length * (size - (0.5))).toInt, size - 1)
      , input.max, input.min)
    assertEquals(result, expectedOutput)
  }

  test("bucketSortGeneric - Positive Test 4: BucketSort with an unordered list of number strings") {
    val input: List[String] = List("9", "5", "2", "7", "3", "1", "8", "6", "4", "0")
    val expectedOutput: List[String] =  List("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    val result: List[String] = Workshop3.bucketSortGeneric(input, comparedAlphanumeric,
      (head: String, maxVal: String, size: Int) => Math.min((head.length / maxVal.length * (size - (0.5))).toInt, size - 1)
      , input.max, input.min)
    assertEquals(result, expectedOutput)
  }


  test("bucketSortGeneric - Positive Test 5: BucketSort with an unordered string list of numbers and words") {
    val input: List[String] = List("kiwi", "789", "grape", "456", "123", "epa", "orange", "234", "apple", "567")
    val expectedOutput: List[String] = List("123", "234", "456", "567", "789", "apple", "epa", "grape", "kiwi", "orange")
    val result: List[String] = Workshop3.bucketSortGeneric(input, comparedAlphanumeric,
      (value: String, maxVal: String, numBuckets: Int) => {
        val interval = (maxVal.hashCode()).toDouble / numBuckets.toDouble
        Math.min( ((value.hashCode()).toDouble / interval).toInt,numBuckets-1)}, "zzzzzz", input.min)
    assertEquals(result, expectedOutput)
  }

}
