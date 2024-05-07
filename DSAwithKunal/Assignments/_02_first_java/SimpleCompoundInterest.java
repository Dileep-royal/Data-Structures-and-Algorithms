package Assignments._02_first_java;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest and Compound Interest.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCompoundInterest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Amount/Principal: ");
        double amount=Double.parseDouble(br.readLine());

        System.out.println("Enter the Rate: ");
        double rate=Double.parseDouble(br.readLine());

        System.out.println("Enter the Time: ");
        double time=Double.parseDouble(br.readLine());

        System.out.print("Enter the number of times interest is compounded: ");
        int number = Integer.parseInt(br.readLine());

        double simpleInterest = (amount*rate*time)/100;  // (p*r*t)/100
        double compoundInterest = amount*(Math.pow(1+(rate /100),time*number))-amount; // P(1+r/100)^nt

        System.out.println("The Simple Interest: "+simpleInterest);
        System.out.println("The Compound Interest: "+compoundInterest);
    }
}
