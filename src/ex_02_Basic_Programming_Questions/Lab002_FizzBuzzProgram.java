package ex_02_Basic_Programming_Questions;

import java.util.Scanner;

public class Lab002_FizzBuzzProgram {

    /*Write a program that prints numbers from 1 to 100. However, for multiples of 3,
     print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
     For numbers that are multiples of both 3 and 5, print "FizzBuzz."
     */

    public static void main(String[] args) {
        for (int i=1;i<=100;i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i%3==0)
            {
                System.out.println("Fizz");
            }
            else if (i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    public static class Lab002_countVowels {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String st = sc.nextLine();

            int vowels = 0, consonants = 0;
            st = st.toLowerCase(); // Simplify comparison by converting to lowercase

            for (int i = 0; i < st.length(); i++) {
                char ch = st.charAt(i);
                if (ch >= 'a' && ch <= 'z') { // Only consider alphabet characters
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println("Vowels "+vowels);
            System.out.println("Consonents "+consonants);
        }
    }
}
