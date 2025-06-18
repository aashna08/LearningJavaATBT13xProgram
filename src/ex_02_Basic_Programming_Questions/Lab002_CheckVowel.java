package ex_02_Basic_Programming_Questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab002_CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char ch = sc.next().toLowerCase().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonent");
            }



        }
        else
        {
            System.out.println("Invalid character");
        }
    }
}
