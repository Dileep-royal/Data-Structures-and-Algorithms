# Day-02[Conditionals and Loops]

## Conditionals and Loops + Calculator program

**Difference between while and do while loop ?**

while loops checks the condition before going to execute the body. whereas do-while is used to execute body of a loop at least once then checks the condition and follow on if the condition is true.

```java
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {

        // if else loop and else if loop

        /*
        int salary=9000;
        if (salary>20000)
            salary=salary+2000;
        else if (salary<20000 && salary>10000)
            salary=salary+1000;
        else
            salary=salary+500;

        System.out.println("Total Salary:"+salary);
        */

        // finding out maximum of three numbers

        /*
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=b;
        if (a>b)
            max=a;
        if (c>max)
            max=c;
        System.out.println(max);
       // System.out.println(Math.max(c,Math.max(a,b)));
        */

        // nth number of Fibonacci series

        /*
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0;
        int b=1;
        if(n>=1) System.Out.print(a);
        if(n>=2) System.Out.println(b);
        int count=2;
        while(count<n)
        {
            int temp=a+b;
            a=b;
            b=temp;
            count++;
            System.out.print(b);
        }
        
        */

        // count of a digit repeated in a number
        // 1. we can convert integer to string and traverse through each character.
        // 2. we can take last digit of a number by doing modulus of number with 10 will give last digit and after matching reduce number by eliminating last digit by dividing number with 10

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = input.nextInt();
        /*
        System.out.print("Enter a Digit:");
        int digit = input.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            if (rem == digit)
                count++;
        }
        System.out.println("No of times Digit occurred in a Number: "+count);
        */

        // Reverse a Number

        /*
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans=ans*10+rem;
        }
        System.out.println("Reveres of a number is:"+ans);

         */

    }
}
```

## Switch Statements

switch statement accepts an expression and it have so many cases with many expressions and the case which matches given expression will execute.

Note: end every case with break to terminate from switch statement upon matching. 

```java
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the day:");
        int day=input.nextInt();

        // code that we write is pretty

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a Valid day number from 1-7...!");
        }

        // code that we write with enhanced switch statement,which is looking good and prettier.
       // no need to write a break statement for each case and fewer lines of code.

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a Valid day number from 1-7...!");
        }

        // what if case with empty block?
        // executes all cases from starting matched case until we get a case with break statement

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("week day");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter a Valid day number from 1-7...!");
        }

        // rewriting with enhanced switch statement
        // very fewer lines of codeaaaaaaaaaaa

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("week day");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a Valid day number from 1-7...!");
        }
    }
}
```
