package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_vowelConsonents {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        int vowels=0;
        int consonents=0;
        String str=st.toLowerCase();
        for (int i=0;i<st.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
                        str.charAt(i)=='o'|| str.charAt(i)=='u')
                {
                    vowels++;
                }
                else
                {
                    consonents++;
                }
            }
        }
        System.out.println("Vowels "+vowels);
        System.out.println("Consonents "+consonents);

    }
}
