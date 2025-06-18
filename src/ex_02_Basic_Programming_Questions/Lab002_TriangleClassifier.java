package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_TriangleClassifier {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Side");
        int a=sc.nextInt();
        System.out.println("Enter Second Side");
        int b=sc.nextInt();
        System.out.println("Enter Third Side");
        int c=sc.nextInt();
        if(a==b && b==c && c==a)
        {
            System.out.println("Equilateral triangle");
        }
        else if (a==b || b==c || c==a)
        {
            System.out.println("Isoceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }

    }
}
