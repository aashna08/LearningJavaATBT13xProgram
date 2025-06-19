package Test_Questions;

import java.util.Scanner;

public class Ques007_Largestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("Enter third number");
        int num3=sc.nextInt();
        if(num1>=num2 && num1>=num3)  //Check for num1 being largest
        {
            System.out.println("Largest Number is "+num1);
        }
        else if (num2>=num3 && num2>=num1) //Check for num2 being largest
        {
            System.out.println("Largest Number is "+num2);
        }
        else //Check for num3 being largest
        {
            System.out.println("Largest Number is "+num3);
        }
    }
}
