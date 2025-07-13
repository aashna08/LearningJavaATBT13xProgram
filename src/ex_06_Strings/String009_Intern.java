package ex_06_Strings;

public class String009_Intern {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        System.out.println(s1 == s2);             // false – different memory references
        System.out.println(s1 == s2.intern());    // true – now s2 is interned
    }
}
