package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_RightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
