## Structural Induction

We will evaluate and demonstrate the functionality of an algorithmic function that supports the operation of the bucketsort:

**Function**

```markdown
```pseudocode
function divideIntoCubes(arr: List[T], cubes: List[List[T]], maxVal: T) -> List[List[T]]:
    if arr is empty: return cubes
    else: 
        head := first element of arr
        tail := rest of elements of arr
        index := intervalFunction(head, maxVal, length of cubes) - 1
        index := max(index, 0) 
        newCubes := update(cubes, index, head) 
        return divideIntoCubes(tail, newCubes, maxVal)
```

**Base Case**:

For $k=0$, where $k$ is the number of elements processed in the list, the input list is empty. In this case, the `divideIntoCubes` function return `cubes`. This is correct since there are no elements in`arr`to process and, therefore, `cubes` does not need to be modified.

$F(0) = divideIntoCubes(EmptyList, cubes, maxVal) = cubes$

**Inductive Hypothesis**:

We assume that the algorithm is valid for $k$ elements, that is, when the function `divideIntoCubes` processes $k$ elements of the list.

**Recursive Case**:

To demonstrate that the function is valid for $k+1$ elements, we consider a list `arr` with $k+1$ elements. According to the function’s implementation, it takes the first element of `arr` (the head), calculates its index, and updates `cubes` at the index. Then,  `divideIntoCubes` is called recursively with the tail of `arr` (which has length $k$) an the updated `cubes`

Therefore, for $k+1$ elements:

$F(k+1)$ = $divideIntoCubes(head::tail, cubes, maxVal) = divideIntoCubes(head, newCubes, maxVal)$

Where:

- Head is the first element of the list
- Tail is the tail of the list
- newCubes is the list of cubes updated after inserting the head into the corresponding cube

By the inductive hypothesis, we know that the recursive call to`divideIntoCubes` with the tail of`arr` (of lenght $k$) an the updated`cubes` will give the correct result. Therefore, the function will also work correctly for the list `arr` of length $k+1$.

This completes the demonstration of the structural induction of the `divideIntoCubes`algorithm.
