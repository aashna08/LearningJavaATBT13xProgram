package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_reverseString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String st=sc.nextLine();
        String reverse = "";
        for (int i=st.length()-1;i>=0;i--)
        {
            reverse=reverse + st.charAt(i);
        }
        System.out.println(reverse);
    }
}
