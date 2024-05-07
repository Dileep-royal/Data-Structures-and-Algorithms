package Assignments._02_first_java;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter two Numbers:");
        long number1 = inputObj.nextLong();
        long number2 = inputObj.nextLong();
        System.out.print("Enter an operator(/,*,+,-):");
        String operator = inputObj.nextLine();

        switch (operator) {
            case "+" ->
                    System.out.println("Addition of two numbers " + number1 + " and " + number2 + " is: " + (number1 + number2));
            case "-" ->
                    System.out.println("Subtraction of two numbers " + number1 + " and " + number2 + " is: " + (number1 - number2));
            case "*" ->
                    System.out.println("Multiplication of two numbers " + number1 + " and " + number2 + " is: " + (number1 * number2));
            case "/" ->
                    System.out.println("Division of two numbers " + number1 + " and " + number2 + " is: " + (number1 / number2));
            case null, default -> System.out.println("Enter a correct operator");
        }
    }
}
