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

