package Assignments._01_flow_of_program;

//Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter a Table Number :");
        long tableNumber = inputObj.nextInt();
        for (int i = 1; i <= 10; i++) {
            String output = String.format(" %1$d * %2$d = %3$d",tableNumber,i,tableNumber*i);
            System.out.println(output);
        }
    }
}