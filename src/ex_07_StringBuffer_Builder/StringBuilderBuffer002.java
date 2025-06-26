package ex_07_StringBuffer_Builder;

public class StringBuilderBuffer002 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Aashna");
        sb.append(" Gupta");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("Java");
        sb1.append(" Programming");
        System.out.println(sb1);
        sb1.delete(5,16);
        System.out.println(sb1);
        sb1.replace(0,4,"C++");
        System.out.println(sb1);
        sb1.ensureCapacity(20);
        sb1.append("My name is Aashna and I am an enginner");
        System.out.println(sb1);

    }
}
