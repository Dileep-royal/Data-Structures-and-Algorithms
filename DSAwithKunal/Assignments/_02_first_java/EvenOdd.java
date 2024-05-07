package Assignments._02_first_java;
// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter an Number:");
        long number = inputObj.nextLong();
        if(number%2==0) System.out.println(number+" is an even Number");
        else System.out.println(number+" is an odd Number");
    }
}
