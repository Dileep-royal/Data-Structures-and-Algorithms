package Assignments._02_first_java;

// Input currency in rupees and output in USD.

import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter currency in Rupees(INR) :");
        float rupees = inputObj.nextFloat();
        final float usdConversionRate=0.011994f;  // 22-04-2024 14:08:45
        System.out.format("Rupees %f in USD is: %.5f",rupees,(rupees*usdConversionRate));
    }
}
