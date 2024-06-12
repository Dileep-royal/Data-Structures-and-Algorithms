# String and StringBuilder

String is a collection of characters. In the Java programming language, strings are objects.

We have String Data type in java. The Java platform provides the String class to create and manipulate strings.

The value assigning to String type variable will be in double quotes i.e. “ ”.

String syntax is as shown below

```java
// String variable_name ="String_value";
// Using string literal
String a="Dileep";
String b="Dileep";
System.out.println(a==b); // true
```

We have separate memory for string in heap memory called String constant pool.

Two reference variable stores same object, then Both reference variable refers to only one object.

### Strings are immutable

Strings are immutable i.e., we cannot modify String value, but we can reassign a reference variable with new object.

### How to create objects with same value?

By using “new” Keyword, which create object outside of string pool but inside the heap memory.

This additional feature of “+” operator is achieved by operator overloading.

```java
String name1="Dileep";
String a=new String("Dileep");
String b=new String("Dileep");
System.out.println(name1==a); // false same reason as below camporison
System.out.println(a==b);. // false because reference variables are not pointing to same object, compares the objects
System.out.println(a.equals(b));. // true, Compares the values
```

### Use of “+” operator with Strings

We can use “+” operator to concatenate two strings. This is called String Concatenation.

In java there is no other operators like “*” (Asterik) is overloaded. It is overloaded in python and c++.

# StringBuilder

StringBuilder allows you to modify String value with the help of many pre-defined methods.

```java
StringBuilder string1= new StringBuilder();

```
