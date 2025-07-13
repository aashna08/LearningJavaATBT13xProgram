package ex_11_List;

/*Create an ArrayList with these names: Amit, Neha, Suresh.
Remove the name Neha and display the updated list.*/

import java.util.ArrayList;

public class Question002 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Amit");
        al.add("Neha");
        al.add("Suresh");
        System.out.println(al);
        al.remove("Neha");
        System.out.println(al);
    }
}
