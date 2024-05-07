package Assignments._02_first_java;

// To find Armstrong Number between two given number.
// The sum of its own digits raised to a power of digits results in the number itself

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int number){
        String input;
        String strNumber = String.valueOf(number);
        int n = strNumber.length();
        int result=0;
        for (int i = 0; i < n; i++) {
            result += (int)Math.pow(Integer.parseInt(String.valueOf(strNumber.charAt(i))), n);
        }
        return result == number;
    }

    public static void NthArmstrongNumber(int n){
        int count=0;
        for(int i=1; i<=Integer.MAX_VALUE;i++){
            count+= isArmstrongNumber(i)? 1:0;
            if(count==n) {
                System.out.println(n+"th Armstrong Number is: "+i);
                break;
            }
        }
    }

    public static void ArmstrongNumberInRange(int left, int right){
        for(int i=left;i<=right;i++){
            System.out.print(isArmstrongNumber(i)? i+" ":"");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Inputs
//        System.out.print("Enter a Number");
//        int number = Integer.parseInt(br.readLine());
//        int left = Integer.parseInt(br.readLine());
//        int right = Integer.parseInt(br.readLine());
        int number =153;
        System.out.println(isArmstrongNumber(number)? "Given Number "+number+" is an Armstrong Number" : "Given Number "+number+" is not an Armstrong Number");
        int n=9;
        NthArmstrongNumber(n);
        int left = 1;
        int right = 2000;
        System.out.println("Armstrong Numbers in range "+left+" and "+right+" are: ");
        ArmstrongNumberInRange(left,right);

    }
}
