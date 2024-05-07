package Assignments._01_flow_of_program;

// Take two numbers and print the sum of both.

import java.util.Scanner;

public class SumOf2Numbers {
    public static long sum0f2Numbers(long one,long two){
        return one+two;
    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        long numberOne = inputObj.nextLong();
        long numberTwo = inputObj.nextLong();
        String result = String.format("The Sum of numbers %1$d and %2$d is : %3$d",numberOne,numberTwo,sum0f2Numbers(numberOne,numberTwo));
        System.out.println(result);
    }
}
