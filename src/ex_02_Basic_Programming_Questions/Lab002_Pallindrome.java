package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        Boolean isPallindrone = false;
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse))
        {
            isPallindrone=true;
        }
        System.out.println(isPallindrone);
    }
}
