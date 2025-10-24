package Map;
import java.util.*;

public class Map001 {
    public static void main(String[] args) {
//        Map m1 = new Map();
        Map m1 = new HashMap(20); //prints randomly
        // Map is key and value pair
        // name -> pramod
        m1.put("name","pramod");
        m1.put("rollno",1);
        m1.put("phone",987654321);
//        m1.put(34,90);
        System.out.println(m1);



        Map m2 = new LinkedHashMap(); //prints as added
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);


        Map m3 = new TreeMap(); //prints in sorted manner
        m3.put("firstname","pramod");
        m3.put("lastname","dutta");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);




    }
}
