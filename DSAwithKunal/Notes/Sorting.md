# Sorting

## Sorting Algorithms

Sorting means elements should be placed in an order i.e., descending or ascending.

Some of sorting Algorithms are:

## Bubble Sort

- Also know as Exchange sort, Sinking sort.
- It is one of in-place sorting Algorithms.
- There will be N no. of passes. Here pass means one total iteration through out the unsorted array.
- With each pass,do comparisons between each element to its preceding element and swap the largest element to right.
- After each pass,one largest element among other elements will be in its correct respective position in ascending order.
- Time and Space Complexity
    - Time Complexity:
        
        Best Case : O(N)
        
        If elements are already in a sorting order
        
        Worst Case : O(N^2)
        
        If elements are sorted in a reverse(Descending)
        
    - Space Complexity:
        
        O(1) i.e., Constant
        
        No need of any extra space like copying an array, that's why it is known as in- place sorting algorithms.
        
    
       
    
- No. of comparisons
    
    Best Case : N;
    
    Worst Case : N^2;
    

## Code

```java

```

## Selection Sort

In selection Sort,we decrease No. of swaps as compare to bubble sort.

### Advantages:

1. 

### Code

```java

```

## Insertion Sort

We divide the array into two parts:
(1)Sorted array and (2)unsorted array
We traverse the unsorted array and insert the element at correct index in sorted array with respect to order i.e., Ascending or Descending.

### Advantages:

1. Adoptive: No. Of steps get reduced if array is sorted. No. of swaps reduced as compared to Bubble sort.

2. Stable Sorting algorithm.

3. Used for smaller values of N and works good with partiality sorted arrays. That's why it takes part in Hybrid Sorting algorithms.

- Time and Space Complexity
    - Time Complexity
        
        Best Case : O(N)                
        
        If elements are already in a sorting order                
        
        Worst Case : O(N^2)                
        
        If elements are sorted in a reverse(Descending)    
        
    - Space Complexity
        
        O(1) i.e., Constant, No need of any extra space like copying an array, that's why it is known as in- place sorting algorithms.                  No. of comparisons
        
    
- No. of comparisons
    
    Best Case: N
    
    Worst Case :N^2
    

### Code

```java

```

## Cycle Sort

Cycle sort used in case of when an array contains elements in certain range.