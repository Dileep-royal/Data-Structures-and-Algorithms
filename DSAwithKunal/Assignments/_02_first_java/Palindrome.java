package Assignments._02_first_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Some palindrome words are
- madam
- racecar
- civic
- level
- noon
- radar
- borrow or rob
- was it a cat i saw
*/

/*
It can be done using following approaches:
- Iteration
- Two pointers(optimal and used to code here)
- Recursion
- Using StringBuilder
 */

public class Palindrome {
    // my approach - O(n/2)
    public static boolean isPalindrome(String input){
        int j=input.length()-1;
        for(int i=0;i<j;i++){
            if(input.charAt(i)==input.charAt(j)) j--;
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String input = br.readLine();
        System.out.println(isPalindrome(input)? "Given String is a Palindrome":"Given String is not a Palindrome");
    }
}