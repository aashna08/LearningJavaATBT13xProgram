package ex_11_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question005 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        LinkedList ll=new LinkedList();
        Long startTime=System.currentTimeMillis();

        for (int i=0;i<100000;i++)
        {
            al.add(i);
        }
        Long endTime=System.currentTimeMillis();
        System.out.println("Time taken by arraylist "+(endTime-startTime));
        startTime=System.currentTimeMillis();
        for (int i=0;i<100000;i++)
        {
            ll.add(i);
        }
        endTime=System.currentTimeMillis();
        System.out.println("Time taken by linkedlist "+(endTime-startTime));
    }
}
