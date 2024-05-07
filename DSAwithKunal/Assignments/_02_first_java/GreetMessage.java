package Assignments._02_first_java;

// Take name as input and print a greeting message for that particular name.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreetMessage {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name: ");
        String name = br.readLine();
        String greetMessage ="Hello ";
        System.out.println(greetMessage+name+"!");
    }
}
