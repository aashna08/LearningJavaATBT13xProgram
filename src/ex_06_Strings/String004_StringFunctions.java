package ex_06_Strings;

public class String004_StringFunctions {
    public static void main(String[] args) {
        String name = "Sonal";
        //length()
        System.out.println(name.length());

        //charAt()
        System.out.println(name.charAt(3));
        // System.out.println(name.charAt(15)); //out of bound exception

        //concat()
        System.out.println(name.concat("Patel"));

        //contains()
        System.out.println(name.contains("on"));

        //equals()
        System.out.println(name.equals("Sonal"));

        //equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //indexOf()
        System.out.println(name.indexOf('o'));
        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        //lastIndexOf()
        System.out.println(s1.lastIndexOf("m"));

        //replace()
        System.out.println(name.replace('n', 'N'));

        //split()
        String name4 = "pramod@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        // 10. substring( , )  , sonal
        System.out.println(name.substring(1, 3)); //3 INDEX IS NOT CONSIDERED

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));


    }
}
