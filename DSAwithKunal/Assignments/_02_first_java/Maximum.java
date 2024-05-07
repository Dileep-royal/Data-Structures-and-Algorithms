package Assignments._02_first_java;

// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter two Numbers:");
        long number1 = inputObj.nextLong();
        long number2 = inputObj.nextLong();
        System.out.println("Maximum Number is: "+((number1>number2)? number1:number2));
    }
}
