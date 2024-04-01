
# Algorithm 1 Testing - Inversion Count
This algorithm counts the number of inversions needed to sort a list in ascending order. To do this, the algorithm checks which elements in the tail are smaller than the head, and recursively repeats this process with the tail of the list. It stops once it reaches the tail of the list.

#### Test 1

**Test Name: Inversions in unsorted list 1**

**Input:** List(4, 2, 1, 3, 5, 7)

**Expected Output:** 4

**Goal:** Verify correct functionality in an unsorted list.

#### Test 2

**Test Name: Inversions in unsorted list 2**

**Input:** List(2, 3, 9, 2, 9)

**Expected Output:** 2

**Goal:** Verify correct functionality in an unsorted list.

#### Test 3

**Test Name: Inversions in list sorted in descending order**

**Input:** List(5, 4, 3, 2, 1)

**Expected Output:** 10

**Goal:** Verify correct functionality in a list sorted in descending order.

#### Test 4

**Test Name: Inversions in list sorted in ascending order**

**Input:** List(0, 1, 2, 3, 4, 5)

**Expected Output:** 0

**Goal:** Verify correct functionality in a sorted list.

#### Test 5

**Test Name: Inversions in list sorted in descending order**

**Input:** List(4, 3, 2, 1)

**Expected Output:** 6

**Goal:** Verify correct functionality in a list sorted in descending order.

#### Test 6

**Test Name: Inversions in empty list**

**Input:** List()

**Expected Output:** 0

**Goal:** Verify correct functionality in an empty list.

#### Test 7

**Test Name: Inversions in list of one element**

**Input:** List(1)

**Expected Output:** 0

**Goal:** Verify correct functionality in a list of one element.

#### Test 8

**Test Name: Inversions in list of two elements**

**Input:** List(2, 1)

**Expected Output:** 1

**Goal:** Verify correct functionality in a list of two elements.

#### Test 9

**Test Name: Inversions in list of descending repeated elements**

**Input:** List(2, 2, 1, 1)

**Expected Output:** 4

**Goal:** Verify correct functionality in a list of descending repeated elements.

#### Test 10

**Test Name: Inversions in list of ascending repeated elements**

**Input:** List(1, 1, 2, 2)

**Expected Output:** 0

**Goal:** Verify correct functionality in a list of ascending repeated elements.
