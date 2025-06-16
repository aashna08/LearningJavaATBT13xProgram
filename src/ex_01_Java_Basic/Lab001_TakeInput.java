package ex_01_Java_Basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab001_TakeInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name ");
        String name=sc.nextLine();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Name from input is "+name+" and age from input is "+age);
    }
}
