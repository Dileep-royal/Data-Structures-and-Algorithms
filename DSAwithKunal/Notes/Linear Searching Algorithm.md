# Linear Searching Algorithm

## Linear Search Algorithm

Linear searching is used to search an element sequentially in a given array.

Time Complexity:

                          → Worst case  : O(n)    Linear Complexity

                          →Best case      : O(1)    Constant

Space Complexity: O(n)

### Code for Linear Search algorithm

```java
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={45, 67, 90, 123, 479, 373, 109, 101, 234};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter Element to find in array: ");
        int target=in.nextInt();
        int index= linearSearch(arr,target);
        if(index>-1)
            System.out.println("Element found in array at index No.: "+index);
        else
            System.out.println("Element not found in array..!");
    }

    public static int linearSearch(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
```

### Code of Linear Search algorithm between given range

```java
public Array3{
public static void main(String[] args){
        int[] arr={45, 67, 90, 123, 479, 373, 109, 101, 234};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter Element to find in array: ");
        int target1=in.nextInt();
        int start=3;
        int end=7;
        int index= linearSearch(arr,target1,start,end);
        if(index>-1)
            System.out.println("Element found in array at index No.: "+index);
        else
            System.out.println("Element not found in array..!");
}
public static int linearSearch(int[] arr,int target,int start,int end) {
        if (start==0 && end==0){
            start=0;end=arr.length;
        }
        if (arr.length==0)
            return -1;
        for(int i=start;i<end;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
```

### Code of Linear Search algorithm for 2-D Array

```java
public class Array2{
public static void main(String[] args){
System.out.println("----Linear Search for 2-D array----");
        int[][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target2=6;
        System.out.println("Element found in array at index [row][column]: "+Arrays.toString(linearSearch(arr1,target2)));
  }
public static int[] linearSearch(int[][] arr,int target2){
        if (arr.length==0)
            return new int[]{-1,-1};
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target2)
                    return new int[]{i,j};
            }
        }
            return new int[]{-1,-1};
        }
}
```

## Doubts?

- How to make parameters optional, just like there are some optional parameters exist in pre-defined methods.
- math.log10() ? will cover in Number System
    
    Here log10(any value ) give the count of multiples of 10 i.e log10(87348) gives 4 .
    
    Because 87348=80000 +7348 here it considers 80000 contains 10,000 ,which is a multiple of 10 that means log10(10,000)=4 ⇒10^4
    
    so we have to add 1 to get count of any number, because we missed end number 8 as it only considers multiple of 10.
    
    Finally log10(87348)+1=5 
    

### LeetCode Problems

Problem -1 :

[Find Numbers with Even Number of Digits - LeetCode](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)

Solution:

[Java Solution - 96% beats [using Integer.toString().length() Method and (int)math.log10()+1 method] - Find Numbers with Even Number of Digits - LeetCode](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/solutions/3630231/java-solution-96-beats-using-integer-tostring-length-method-and-int-math-log10-1-method/)

Problem-2 :

[Richest Customer Wealth - LeetCode](https://leetcode.com/problems/richest-customer-wealth/)

Solution:

[Easy Java solution -100% beats [using nested for each loop] - Richest Customer Wealth - LeetCode](https://leetcode.com/problems/richest-customer-wealth/solutions/3631024/easy-java-solution-100-beats-using-nested-for-each-loop/)