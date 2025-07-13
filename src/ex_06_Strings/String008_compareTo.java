package ex_06_Strings;

public class String008_compareTo {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="hello";
        System.out.println(s1.compareTo(s2)); //prints -ve no because H comes before h
        System.out.println(s1.compareToIgnoreCase(s2)); //prints 0 as both are equal

        String a = "apple";
        String b = "@pple";

        int result = a.compareTo(b); //positive no because @ comes before alphabets
        System.out.println(result);

        String c="apple";
        String d="banana";
        System.out.println(c.compareTo(d)); //negative no

        String s3="test";
        String s4="testing";
        System.out.println(s3.compareTo(s4));//negative no

    }
}
