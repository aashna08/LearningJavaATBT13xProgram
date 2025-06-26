package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_LeftTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
