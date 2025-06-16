package ex_03_ternaryoperator;

public class Lab003_evenodd {
    public static void main(String[] args) {
        int a=11;
         System.out.println((a % 2 == 0) ? "even" : "odd"); //using print statement
       System.out.printf("%s", (a % 2 == 0) ? "Even" : "Odd"); //using printf statement
    }
}
