package ex_11_List;

import java.util.ArrayList;

public class Question004 {
    public static void main(String[] args) {
        ArrayList cities=new ArrayList();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        if(cities.contains("Pune"))
        {
            System.out.println("Pune is in the list");
        }
        else
        {
            System.out.println("Pune is not in the list");
        }
    }
}
