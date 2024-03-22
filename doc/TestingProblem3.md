# Testing Algorithm 3 - BucketSort:

The Bucket Sort algorithm divides the input list into a series of "boxes" based on the range of element values. Each box is sorted individually using a local sorting algorithm, such as insertion. Finally, the sorted boxes are concatenated to form the output list, resulting in a completely sorted list. The efficiency of the algorithm depends on how the elements are distributed among the boxes, being most effective when the data is uniformly distributed within a known range.


## Test case - Integers
#### - Test 1-BucketSort

***Name Test:*** Unordered list of positive numbers

***Input:*** List(5, 2, 9, 3, 7, 1, 4, 8, 6)

***Expected output:*** List(1, 2, 3, 4, 5, 6, 7, 8, 9)

***Objetive:*** Verify correct operation on an unordered list of positive integers

#### - Test 2-BucketSort

***Name Test:*** Unordered list of negative numbers

***Input:*** List(-5, -2, -9, -3, -7, -1, -4, -8, -6)

***Expected output:*** List(-9, -8, -7, -6, -5, -4, -3, -2, -1)

***Objetive:*** Verify correct operation on an unordered list of negative integers

#### - Test 3-BucketSort

***Name Test:*** Ordered list of positive numbers

***Input:*** List(1, 2, 3, 4, 5, 6, 7, 8, 9)

***Expected output:*** List(1, 2, 3, 4, 5, 6, 7, 8, 9)

***Objetive:*** Verify correct operation on an already sorted list of positive integers


#### - Test 4-BucketSort

***Name Test:*** Ordered list of negative numbers

***Input:*** List(-1, -2, -3, -4, -5, -6, -7, -8, -9)

***Expected output:*** List(-9, -8, -7, -6, -5, -4, -3, -2, -1)

***Objetive:*** Verify correct operation on an already sorted List of Negative Integers

#### - Test 5-BucketSort

***Name Test:*** Empty list of integers

***Input:***  List.empty[Int]

***Expected output:***  List.empty[Int]

***Objetive:*** Verify correct operation on an empty list of integers

## Test case - Doubles


#### - Test 1-BucketSort

***Name Test:*** Unordered list of positive numbers

***Input:*** List(5.0, 2.0, 9.0, 3.0, 7.0, 1.0, 4.0, 8.0, 6.0)

***Expected output:*** List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)

***Objetive:*** Verify correct operation on an Unordered List of Positive Decimal Numbers

#### - Test 2-BucketSort

***Name Test:*** Unordered list of negative numbers

***Input:*** List(-5.0, -2.0, -9.0, -3.0, -7.0, -1.0, -4.0, -8.0, -6.0)

***Expected output:*** List(-9.0, -8.0, -7.0, -6.0, -5.0, -4.0, -3.0, -2.0, -1.0)

***Objetive:*** Verify correct operation in an Unordered List of Negative Decimal Numbers

#### - Test 3-BucketSort
**Name Test:** Ordered list of positive numbers

**Input:** List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)

**Expected output:** List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)

**Objetive:** Verify that the bucket sorting algorithm works correctly with a list of already sorted positive decimal numbers.

#### - Test 4-BucketSort
**Name Test:** Ordered list of negative numbers

**Input:** List(-1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0)

**Expected output:** List(-9.0, -8.0, -7.0, -6.0, -5.0, -4.0, -3.0, -2.0, -1.0)

**Objetive:** Checks that the algorithm correctly sorts a list of negative decimal numbers already sorted.

#### - Test 5-BucketSort
**Name Test:** Empty list of decimal numbers

**Input:** List.empty[Double]

**Expected output:** List.empty[Double]

**Objetive:** Ensures that the algorithm correctly handles an empty list of decimal numbers.

    

## Test case - Characters

#### - Test 1: BucketSort with Unordered Characters

***Name Test:*** Sorting Unordered Characters

***Input:*** List('z', 'x', 'p', 'l', 'i', 'f', 'd', 'e', 'i', 'a')

***Expected output:*** List('a', 'd', 'e', 'f', 'i', 'i', 'l', 'p', 'x', 'z')

***Objective:*** Validate the functionality of `bucketSortGeneric` when sorting a list of unordered characters. This test ensures that the function correctly sorts the characters in ascending order.


#### - Test 2: BucketSort with Characters Sorted in Reverse Alphabetical Order

***Name Test:*** Sorting Characters in Reverse Alphabetical Order

***Input:*** List('z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q')

***Expected output:*** List('q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

***Objective:*** Confirm the functionality of `bucketSortGeneric` when sorting a list of characters ordered from last to first in the alphabet. This test ensures that the function correctly sorts the characters in ascending order.


#### - Test 3: BucketSort with Unordered Numeric Characters

***Test Name:*** Sorting Unordered Numeric Characters

***Input:*** List('5', '9', '0', '3', '7', '6', '1', '8', '4')

***Expected output:*** List('0', '1', '3', '4', '5', '6', '7', '8', '9')

***Objective:*** Verify the correct operation of `bucketSortGeneric` when sorting a list of unordered numeric characters. This test ensures that the function correctly sorts the characters in ascending order.

#### - Test 4: BucketSort with Numeric Characters Sorted in Descending Order

***Test Name:*** Sorting Numeric Characters in Descending Order

***Input:*** List('9', '8', '7', '6', '5', '4', '3', '1', '0', ' ')

***Expected output:*** List(' ', '0', '1', '3', '4', '5', '6', '7', '8', '9')

***Objective:*** Confirm the correct operation of `bucketSortGeneric` when sorting a list of numeric characters ordered in descending order. This test ensures that the function correctly sorts the characters in ascending order.

#### - Test 5: BucketSort with Characters and Numeric Characters in Disorder

***Test Name:*** Sorting Characters and Numeric Characters in Disorder

***Input:*** List('e', '7', 'c', '5', 'a', '4', 'b', '3', 'd', '2')

***Expected output:*** List('2', '3', '4', '5', '7', 'a', 'b', 'c', 'd', 'e')

***Objective:*** Validate the correct operation of `bucketSortGeneric` when sorting a list of characters and numeric characters in disorder. This test ensures that the function correctly sorts the characters in ascending order.

#### - Test 6: BucketSort with an Empty List of Characters

***Test Name:*** Sorting an Empty List of Characters

***Input:*** Empty list

***Expected output:*** Empty list

***Objective:*** Validate the behavior of `bucketSortGeneric` when an empty list of characters is passed. This test ensures that the function handles empty input cases properly.


## Test case - String size


#### - Test 1: BucketSort with an Unordered List of Strings of Different Sizes

***Test Name:*** Sorting an Unordered List of Strings of Different Sizes

***Input:*** List("elephant", "banana", "kiwi", "orange", "pear", "apple")

***Expected output:*** List("pear", "kiwi", "apple", "orange", "banana", "elephant")

***Objective:*** Verify the correct operation of `bucketSortGeneric` when sorting an unordered list of strings with varying lengths. This test ensures that the function correctly sorts the strings based on their lengths.

#### - Test 2: BucketSort with a Sorted List from Largest to Smallest of Strings of Different Sizes

***Test Name:*** Sorting a Sorted List from Largest to Smallest of Strings of Different Sizes

***Input:*** List("watermelons", "elephants", "oranges", "banana", "apple", "grap", "man", "hi")

***Expected output:*** List("hi", "man", "grap", "apple", "banana", "oranges", "elephants", "watermelons")

***Objective:*** Validate the functionality of `bucketSortGeneric` when sorting a list of strings sorted from largest to smallest. This test ensures that the function correctly handles already sorted input lists.

#### - Test 3: BucketSort with a List of One-Item Strings

***Test Name:*** Sorting a List of One-Item Strings

***Input:*** List("klmnopqrst")

***Expected output:*** List("klmnopqrst")

***Objective:*** Confirm the behavior of `bucketSortGeneric` when sorting a list containing only one-item strings. This test ensures that the function handles single-item string lists properly.

## Test case -String and alphanumeric sorting

#### - Test 1: BucketSort with an Unordered String List for Alphanumeric Sorting

***Test Name:*** Sorting an Unordered String List for Alphanumeric Sorting

***Input:*** List("watermelons", "elephants", "oranges", "banana", "apple", "grap", "man", "hi")

***Expected output:*** List("apple", "banana", "elephants", "grap", "hi", "man", "oranges", "watermelons")

***Objective:*** Verify the correct operation of `bucketSortGeneric` when sorting an unordered list of strings using alphanumeric sorting. This test ensures that the function correctly sorts the strings in alphanumeric order.

#### - Test 2: BucketSort with a List of Strings Sorted from "z" to "a" to Sort Alphabetically

***Test Name:*** Sorting a List of Strings Sorted from "z" to "a" to Sort Alphabetically

***Input:*** List("watermelons", "oranges", "man", "hi", "grap", "elephants", "banana", "apple")

***Expected output:*** List("apple", "banana", "elephants", "grap", "hi", "man", "oranges", "watermelons")

***Objective:*** Validate the functionality of `bucketSortGeneric` when sorting a list of strings sorted from "z" to "a" to sort alphabetically. This test ensures that the function correctly sorts the strings in alphabetical order.

#### - Test 3: BucketSort with an Unordered List of Letter Strings

***Test Name:*** Sorting an Unordered List of Letter Strings

***Input:*** List("z", "x", "p", "l", "i", "f", "d", "e", "a", "c")

***Expected output:*** List("a", "c", "d", "e", "f", "i", "l", "p", "x", "z")

***Objective:*** Confirm the correct operation of `bucketSortGeneric` when sorting an unordered list of letter strings. This test ensures that the function correctly sorts the strings in alphanumeric order.

#### - Test 4: BucketSort with an Unordered List of Number Strings

***Test Name:*** Sorting an Unordered List of Number Strings

***Input:*** List("9", "5", "2", "7", "3", "1", "8", "6", "4", "0")

***Expected output:*** List("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")

***Objective:*** Validate the functionality of `bucketSortGeneric` when sorting an unordered list of number strings. This test ensures that the function correctly sorts the strings in alphanumeric order.

#### - Test 5: BucketSort with an Unordered String List of Numbers and Words

***Test Name:*** Sorting an Unordered String List of Numbers and Words

***Input:*** List("kiwi", "789", "grape", "456", "123", "epa", "orange", "234", "apple", "567")

***Expected output:*** List("123", "234", "456", "567", "789", "apple", "epa", "grape", "kiwi", "orange")

***Objective:*** Verify the correct operation of `bucketSortGeneric` when sorting an unordered list of strings containing numbers and words. This test ensures that the function correctly sorts the strings in alphanumeric order.