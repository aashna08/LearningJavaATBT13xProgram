package ex_06_Strings;

public class String001_Immutable {
    public static void main(String[] args) {
        String name="Aashna";
        name.toLowerCase();
        System.out.println(name); //print Aashna as value is not assigned to name
        name=name.toLowerCase();
        System.out.println(name); //print aashna as value is now assigned to name
    }
}
