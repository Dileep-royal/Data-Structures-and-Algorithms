# All about String in Java

String is a collection of characters. In the Java programming language, strings are objects.

We have String Data type in java. The Java platform provides the String class to create and manipulate strings.

The value assigning to String type variable has to be kept within double quotes i.e. `“ ”`.

Strings are `Immutable`.

we have two way to Create Strings:
1. `String literal`
2. Using `new Keyword` along String Constructor

String syntax is as shown below

```java
// String variable_name ="String_value";
// String Creation: Using string literal
String a="Dileep";
String b="Dileep";

//  String Creation: using new keyword along with String Constructor - Heap memory
String s2 = new String("Dileep");
String s3 = new String("Dileep");

System.out.println(s.hashCode());  // 2047069705
System.out.println(s1.hashCode()); // 2047069705
System.out.println(s2.hashCode()); // 2047069705
System.out.println(s3.hashCode()); // 2047069705
// we are getting same hashcode i.e. id (not address) because of "global dictionary", if the object and content is same, it won't create new object even if you use new keyword to create String

```

We have separate memory for strings created using String literal in heap memory called `String constant pool`.
Two or more strings created using String literal which holds same value hava same address.

Strings created using new keyword gets memory in `heap` but, not inside `String Constant Pool`.
Two or more strings created using String literal which holds same value hava different address.

Two reference variable stores same object, then `Both reference variable refers to only one object`.

### == vs equals()
* `==` Compares objects based on Objects addresses.
* `equals()` Compares objects based on Objects value.

```java
// ==
System.out.println(s == s1); // true, because both objects are pointing to same address
System.out.println(s2 == s3 ); // false, because both objects are pointing to different address

// equals()
System.out.println(s.equals(s2)); // true, because both objects have same value
System.out.println(s.equals(s)); // true, because both objects have same value
System.out.println(s2.equals(s4)); // false, because both objects have different value

```

### Strings are immutable

Strings are immutable i.e., we cannot modify String value, but we can reassign a reference variable with new object.

We cannot able to modify the characters of a string.

We cannot access characters of a String using indexing `str[index]`.
```Java
String s5 = new String("Dileep");
s5=new String("DSA"); // assigning a new object to variable, "Dileep" object in heap is collected by Garbage Collector.
```

### How to create objects with same value but different address?

By using `“new”` Keyword, which create object outside of `string constant pool` but inside the `heap memory`.

```java
String name1="Dileep";
String a=new String("Dileep");
String b=new String("Dileep");

System.out.println(name1==a); // false same reason as below comparing addresses
System.out.println(a==b); // false because reference variables are not pointing to same object, compares the objects
System.out.println(a.equals(b));. // true, Compares the values
```

### How to take String inputs using Scanner class
`next()` - to take single word as String input.

if you give multiple words as input to `next()`, it will treat space as a next line and it will only take one word as input by discarding other words.

`nextLine()` - to take multiple words as String inputs.
```Java
Scanner sc = new Scanner(System.in);
String str1 = sc.next(); // single word String
String str2 = sc.nextLine(); // multi-word String

System.out.println(str1);
System.out.println(str2);
```

## Pretty Printing
They are placeholders to print different data types in a pretty way:

%c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline

\  - Escape character
\n - Move to new line
%% - Print % -> why not \%. There is a convention that special characters escape themselves.
\\ - Print \
\t - Insert tab

we can use this placeholders within this methods generally.
* `printf()`
* `format()`

```Java
System.out.printf("My name is %s and my age is %d\n","dileep",20);
System.out.printf("Pie : %.2f\n",Math.PI); // precision to 2 decimal places
System.out.printf("Value with rounding off %.2f\n",76578.768987f); // 76578.77 // rounding off
System.out.printf("%%") // %
System.out.printf("/tDileep") // "    Dileep"
System.out.printf("\"") // "
System.out.printf("\\") // \
```

### Format Padding
* To add Padding to the String
* %(digit)s - left padding
* %-(digit)s - right padding
```Java
System.out.printf("%10s\n", "stack"); // "     stack"
System.out.printf("%-10s\n", "stack"); //"stack     "
```

### Locale
* We can also pass a `Locale` as the first argument, formatting the String according to it
```Java
System.out.printf(Locale.US, "%,d\n", 5000); // 5,000
System.out.printf(Locale.ITALY, "%,d\n", 5000); // 5.000
```

### Argument Index
* If no argument index is provided, the arguments will simply follow the order of presence in the method call.
```Java
System.out.printf("First argument is %2$d, second argument is %1$d", 2, 1); // First argument is 1, second argument is 2
System.out.printf("First argument is %d, second argument is %d", 1, 2); // First argument is 1, second argument is 2
```

## Use of “+” operator with Strings - String Concatenation

We can use “+” operator to concatenate two strings. This is called String Concatenation.

This additional feature of “+” operator is achieved by operator overloading.

In java there is no other operators like “*” (Asterik) is overloaded. It is overloaded in python and c++.

## Mutable Strings

StringBuilder allows you to modify String value with the help of many pre-defined methods.

```java
StringBuilder string1= new StringBuilder();

```
