package Assignments._01_flow_of_program;

//Input a year and find whether it is a leap year or not.

public class LeapYear{
        public static boolean isLeapYear(int year){
            if(year%4==0 && year%100!=0){
                return true;
              }
            else return year % 400 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(700));
    }
}
