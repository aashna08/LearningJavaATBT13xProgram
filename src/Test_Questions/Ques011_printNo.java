package Test_Questions;

import java.util.Scanner;

public class Ques011_printNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }
}
