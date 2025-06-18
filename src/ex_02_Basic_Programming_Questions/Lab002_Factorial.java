package ex_02_Basic_Programming_Questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab002_Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int factorial=1;
        System.out.println("Enter number");
        if(!sc.hasNextInt())
        {
            System.out.println("Please enter interger");
            return;
        }
        int num=sc.nextInt();

        if(num<0)
        {
            System.out.println("Negative no doesn't have factorial");
            return;
        }
        if(num==0)
        {
            System.out.println(num);
        }
        if(num>0)
        {
           for(int i=num;i>=1;i--)
           {
               factorial=factorial*i;
           }
            System.out.println(factorial);
        }

    }
}
