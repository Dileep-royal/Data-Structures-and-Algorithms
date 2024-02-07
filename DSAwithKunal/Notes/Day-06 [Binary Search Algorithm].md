# Day-06 [Binary Search Algorithm]

## Binary Search Algorithm

Binary means 2 ,dividing the array into two halves.

Prerequisite for binary algorithm is that the array should be sorted in either ascending or descending order.

### Algorithms:

- Iterative approach
    1. Sort the array ,before performing binary search.
    2. Find the middle element.
    3. Divide the array into two parts based on middle index value i.e., mid=(0+n)/2,where n is length of array.
    4. If Target is equals to middle index value, then middle index value is the answer we are looking for.
    5. else if Target is less than middle index value, remove the right half array and set mid=mid-1.
    6. else remove the left half array and set mid=mid+1.

### Code for iterative approach:

```java
 public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={56,89,103,936,998,1024,2048};
        int target=102;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid =  start+(end-start) / 2; // efficient way to calculate mid value.
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}
```

## Order agnostic binary Search

```java
static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2; // efficient way to calculate mid value.
            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {                   // simply exchange start and end i.e swap the left and right
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
```

- Recursive Approach
    
    1.
    

## Basic Coding questions of Binary Search

## 1. Find floor of a number

Floor means the number less than or equal to given number

### Code

```java
static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // efficient way to calculate mid value.
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
}
```

## 2. Find ceiling of a number

Ceiling means the number greater or equals to given number

### Code

```java
static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // efficient way to calculate mid value.
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }
```