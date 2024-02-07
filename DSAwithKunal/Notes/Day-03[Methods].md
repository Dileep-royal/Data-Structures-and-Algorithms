# Day-03[Methods]

## Methods in java

Method is used to make of use of code reusability and to decrease no. of lines of code. 

Method contains a block of code which gets executed upon calling.

Syntax of method

```java
/*
return_type method_name(parameters...){
statements..
............
return value;
}
*/
```

Below contains some code creating sum and swap methods.

```java
public class Methods {
   int age=0;
   // Constructor
    Methods(int value){
        this.age=value;
        System.out.println("Age is "+age);
    }
    public int sum(int a,int b){
        return a+b;
    }
    void swap(int a,int b){
        System.out.println("Before Swapping");
        System.out.println("The Value of a:"+a);
        System.out.println("The Value of b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println("The Value of a:"+a);
        System.out.println("The Value of b:"+b);
    }
    public static void main(String[] args) {
        System.out.println();
        Methods obj1=new Methods(18);
        System.out.println(obj1.sum(5,90));
        System.out.println(obj1.age);
        obj1.swap(25,48);
    }
        }
```

## Scope, Pass by value and Pass by Reference

Scope of the any variable lies with in that block only.

### Pass by Value

Pass by value is done by using primitive data types.

Here is the some code that demonstrates what is pass by value.

### Pass by reference

Pass by reference means we are passing reference instead of value.

Examples are string and array, etc.

```java
public class Scope {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,90};
        change(arr);
}
static void change(int[] arr)
    {
        arr[0]=99;
        System.out.println(Arrays.toString(arr));
   }
 }
```

## Shadowing

local variable(Lower Level) overriding class variable(Higher level).

Shadowing happens only  when a local variable is declared with same name as class variable.

```java
public class Shadowing {
    static int x=10; //this will be shadowed at line 6
    public static void main(String[] args) {
        int x;    // local variable x shadowed the class variable x
    //    System.out.println(x); // scope will begin when value is intialized and this line causes an error because of trying to print a unintialized variable.
        x=100;
        System.out.println("value of local variable x: "+x);
        fun();
    }
    private static void fun() {
        System.out.println("value of Class variable x: "+x);
    }
}
```

## VarArgs -variable length arguments

we can pass multiple arguments to a method

we can pass 0 or more values.

Here multiple arguments is treated as arrays.

```java
public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(716,3287,3878721,83278));
    }
    static int sum(int ... args){
        int sum=0;
        // System.out.println(v[0]);
        for(int i: args){
            sum+=i;
        }
        return sum;
    }
}
```

## Ambiguity

Error occurs when in case of Method Overloading, if we don’t pass any parameters to method.
