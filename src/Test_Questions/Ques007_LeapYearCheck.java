package Test_Questions;

import java.util.Scanner;

public class Ques007_LeapYearCheck {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter year");
        year=sc.nextInt();
        if((year%4==0 && year%100 !=0) || year%400==0) //condition for leap year
        {
            System.out.println(year+ " is a leap year");

        }
        else
        {
            System.out.println(year+ " is not a leap year");
        }
    }
}
