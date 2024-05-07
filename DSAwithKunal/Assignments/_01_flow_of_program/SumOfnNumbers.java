package Assignments._01_flow_of_program;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class SumOfnNumbers {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        long result=0;
        while(true){
            System.out.println(" Enter next number (or) enter x to exit:");
            String input = inputObj.nextLine();
            if(!input.equals("x")) result = Long.parseLong(input) + result ;
            else break;
        }
        System.out.println(" The sum of numbers is :"+result);
    }
}
