package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_LeapYearCheck {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter year");
        Boolean isLeapYear;
        year=sc.nextInt();
        if((year%4==0 && year%100 !=0) || year%400==0)
        {
            isLeapYear=true;
        }
        else
        {
            isLeapYear=false;
        }
        System.out.println(isLeapYear);
    }
}
