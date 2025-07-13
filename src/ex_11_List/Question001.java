package ex_11_List;

import java.util.ArrayList;
import java.util.List;
/*Create an ArrayList of student names. Add the following 5 students:
Dipak, Ravi, Sneha, Priya, Anjali.
Then display all names using a loop.*/

public class Question001 {
    public static void main(String[] args) {
        List students=new ArrayList();
        students.add("Dipak");
        students.add("Ravi");
        students.add("Sneha");
        students.add("Anjali");
        students.add("Priya");
        for (int i=0;i<students.size();i++)
        {
            System.out.println(students.get(i));
        }

    }
}
