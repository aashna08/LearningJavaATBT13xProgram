package Test_Questions;

import java.util.Scanner;

public class Ques006_TestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        if(!sc.hasNextInt())  //check if input is in int or not
        {
            System.out.println("Please enter number");
        }
        int num=sc.nextInt();
        if(num>0) //check for positive numbers
        {
            System.out.println(num+ " is positive");

        }
        else if (num<0) //check for negative numbers
        {
            System.out.println(num+ " is negative");
        }
        else //check for 0
        {
            System.out.println(num+ " is zero");
        }
    }
}
