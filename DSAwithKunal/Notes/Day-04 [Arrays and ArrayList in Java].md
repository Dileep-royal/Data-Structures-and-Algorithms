# Day-04 [Arrays and ArrayList in Java]

## Arrays

Arrays are used to store collection of values.

Array is a collection of homogenous elements.

Array have indexes which starts from 0 to n-1 and is used to access & update values.

By default integer array contains 0 at every index., for String array it is null(None in Python).

Heap objects are not continuous. and objects are created by Dynamic Memory Allocation.

Here n denotes no. of elements.

Example: To store details of many students.

### How indexing works?

array object have base address.

address of any index=base address + index value * data type size

→Below java code contains how to create and use Arrays

```java
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

//        syntax of Array
//        data_type[] variable_name=new datatype[size]
        Scanner in=new Scanner(System.in);
        // int[] rollNum= new int[5];
        int[] rollNum; // declaration of array and variable name is stored in stack
        rollNum=new int[5]; // initialization ,here object is actually created on the heap memory.
        System.out.println("Enter five roll numbers of students :");
//        String roll = in.next();
        for(int i=0;i<5;i++)
        {
            rollNum[i]=in.nextInt();
        }
/*
     1. using for loop
        for(int i=0;i<5;i++)
        {
            System.out.print(rollNum[i]);
        }

 */
//       2. using for each loop
        for (int num:rollNum){
            System.out.print(num+" ");
        }
//        3.using Arrays.toString method

      //  System.out.println(Arrays.toString(rollNum));
    }
}
```

## ArrayList

In array the size is fixed ,to overcome this fixed size problem we use arrayList which is dynamic in size.

### How ArrayList is not full ?

1. size is fixed internally i.e., initial capacity=10
2. if arraylist fills by some amount, A new array list is created ,lets say double the size.
3. copy the old arraylist to new arraylist, then old arraylist is deleted.

### Syntax of ArrayList

```java
/*
// Syntax
ArrayList<datatype wrapper class> varible_name =new ArrayList<datatype wrapper class>;

// syntax for multi dimension
ArrayList<ArrayList<datatype wrapper class>> varible_name =new ArrayList<datatype wrapper class>;

*/
```

### Program to swap two elements in ArrayList

```java
static void swap(ArrayList<Integer> arr,int index1,int index2){
//        int temp=arr[index1]     In Array we cannot use indexing to access elements at particular index,instead use get() method.
        int temp=arr.get(index1);
        arr.set(index1,arr.get(index2));
        arr.set(index2,temp);
    }
```

### Program to reverse ArrayList

```java
static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        int size=arr.size();
        int i=0;
        for(int j=size-1;i<=j;j--){
            swap(arr,i,j);
            i++;
        }
        return arr;
    }
}
```

### Program to find Max in ArrayList

```java
static int max(ArrayList<Integer> arr){
        int max=0;
        for( int num: arr){
            if (num>max)
                    max=num;
        }
        return max;
    }
```