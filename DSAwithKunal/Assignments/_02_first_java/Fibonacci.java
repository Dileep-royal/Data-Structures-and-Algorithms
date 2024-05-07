package Assignments._02_first_java;

// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void printFibonacciSeries(long n){
        long a=0;
        long b=1;
        if(n<=0) return;
        System.out.print(a+" ");
        if(n>=2) System.out.print(b+" ");
        while(n>2){
            long temp=a+b;
            a=b;
            b=temp;
            System.out.print(b+" ");
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter an Number:");
        long number = inputObj.nextLong();
        printFibonacciSeries(number);
    }
}
