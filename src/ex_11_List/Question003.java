package ex_11_List;

import java.util.Collections;
import java.util.LinkedList;

public class Question003 {
    public static void main(String[] args) {
        LinkedList al=new LinkedList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
    }
}
