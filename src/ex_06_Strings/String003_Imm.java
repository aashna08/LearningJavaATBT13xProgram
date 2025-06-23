package ex_06_Strings;

public class String003_Imm {
    public static void main(String[] args) {
        String str1="Hello";
        str1.concat(" World");
        System.out.println(str1); //print Hello
        str1=str1.concat(" World");
        System.out.println(str1); //print Hello World
    }
}
