# Day-01[Data types]

# Data types and Standard Input & Output

## Primitive Data Types

The primitive means which cannot be break further.

Example are: integer, char, float, double, long, bool

```java
byte verySmall=345; // causes error as it exceeds range // 1 Byte
short small= 54436; // 2 Bytes
int a=10;   // 4 Bytes
long longInteger=8376274325666125L;  // 8 Bytes
char letter='r';  // 2 Bytes

float pi=3.456f;   // 4 Bytes,  stores upto 7 Decimals
double some=98898.094877846;  // 8 Bytes,   stores upto 16 Decimals
int million= 23_00_000; //instead of using comma(,) use underscore (_) 
boolean age18=true; // 1 byte 0(false) or 1(true)
```

why float data type value have ended with ‘f’ and long data type value ended with ‘L’?

1. Decimal values are by default of type double, but to store them in float we use ‘f’ to specify it is of type float.
2. long data type is used to store larger values, L is used to differentiate it from normal integer data type and will allocates 8 bytes instead of 4 bytes.

## Standard Input

Input is taken in java by using Scanner class from java.util library.

Create a object of scanner class and use various methods to accept different types of data.

Example is shown below:

```java
import java.util.Scanner;
Scanner input=new Scanner(System.in);

// Numeric type

// Integer data type input taking methods
byte verySmall=input.nextByte();
short small=input.nextShort();
int number=input.nextInt();
long largeNumber=input.nextLong();

// Floating-point data type input taking methods
float decimal=input.nextFloat();
double longDecimal=input.nextDouble();

// Char data type input taking methods
char character=input.next();
String string= input.nextLine();

//Boolean type

boolean age18=input.nextBoolean();

// nextBigDecimal and nextBigInteger methods

```

### nextBigDecimal and nextBigInteger methods

→Refer here:

[BigDecimal and BigInteger in Java | Baeldung](https://www.baeldung.com/java-bigdecimal-biginteger)
