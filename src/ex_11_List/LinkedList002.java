package ex_11_List;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList002 {
    public static void main(String[] args) {
        LinkedList<String> animals=new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        animals.addLast("Elephant");
        System.out.println("Linked list of animals "+animals);
        System.out.println(animals.get(1));
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());

        System.out.println("Use Iterator");

        //how to use iterator
       Iterator it=animals.iterator();
       while (it.hasNext())
       {
           System.out.println(it.next());
       }
    }
}
