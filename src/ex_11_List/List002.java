package ex_11_List;

import java.util.ArrayList;
import java.util.List;

public class List002 {
    public static void main(String[] args) {
        List l =new ArrayList();
        l.add(1);
        l.add("abc");
        l.add(1.5);
        l.add(null); //allowed
        l.add("abc"); //duplicates are also allowed
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains(1));
        System.out.println(l.indexOf("abc"));

        for (int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

        for (Object o : l)
        {
            System.out.println(o);
        }
       // l.set(1,8);
       // l.remove(0);
       // l.clear();
    }
}
