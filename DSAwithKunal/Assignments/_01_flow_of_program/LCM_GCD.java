package Assignments._01_flow_of_program;

// Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class LCM_GCD {
    public static long findGCD(long numberOne, long numberTwo){
        long min = Math.min(numberOne, numberTwo);
        long gcd=0;
        for (long i=1; i<=min; i++){
            if(numberOne%i==0 && numberTwo%i==0) gcd = i;
        }
        return gcd;
    }

    public static long findLCM(long numberOne, long numberTwo){
        long max = Math.max(numberOne, numberTwo);
        long lcm=max;
        while(true){
            if(max%numberOne==0 && max%numberTwo==0)
            {
                lcm=max;
                break;
            }
            max++;
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        long numberOne = inputObj.nextLong();
        long numberTwo = inputObj.nextLong();
        long gcd=findGCD(numberOne,numberTwo);
        long lcm=findLCM(numberOne,numberTwo);     //(numberOne*numberTwo)/gcd; // formula to calculate gcd from lcm or vice-versa
        System.out.println("The GCD of numbers "+numberOne+" and "+numberTwo+" is: "+gcd);
        System.out.println("The LCM of numbers "+numberOne+" and "+numberTwo+" is: "+lcm);
    }
}
