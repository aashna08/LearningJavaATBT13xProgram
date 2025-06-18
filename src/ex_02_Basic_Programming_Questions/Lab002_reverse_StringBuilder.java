package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_reverse_StringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        StringBuilder reverse= new StringBuilder();
        for (int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            reverse=reverse.append(ch);
        }
        System.out.println("Reverse String "+reverse);

    }
}
