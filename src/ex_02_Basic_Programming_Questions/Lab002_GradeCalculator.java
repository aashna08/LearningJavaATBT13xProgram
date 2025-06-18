package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your score");
        char grade;

        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt())
        {
            System.out.println("Please enter number");
        }
        int score=sc.nextInt();
        if(score<=100 && score >=90)
        {
            grade='A';
        }
        else if (score<=89 && score >=80)
        {
            grade='B';
        }
        else if (score<=79 && score >=70)
        {
            grade='C';
        }
        else if (score<=69 && score >=60)
        {
            grade='D';
        }
        else
        {
            grade='F';
        }
        System.out.println("Grade is "+grade);

    }
}
