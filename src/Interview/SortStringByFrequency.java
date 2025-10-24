package Interview;

import java.util.*;

public class SortStringByFrequency {

    private static class Student{
        private int marks;
        private String name;


        Student(String name, int marks){
            this.name=name;
            this.marks=marks;
        }

        public int getMarks() {
            return marks;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + " : " + String.valueOf(marks);
        }
    }

    public static void sortString(String str)
    {
        HashMap<Character,Integer> hm =new HashMap<>();
        for(Character c : str.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        // abbbc
        // a->1,b->3,c->1
        List<Map.Entry<Character,Integer>> sortedList = new ArrayList<>(hm.entrySet());
        Comparator<Map.Entry<Character,Integer>> comp = (r1,r2) -> r2.getValue() - r1.getValue();
        sortedList.sort(comp);

        StringBuilder sb= new StringBuilder();
        for(Map.Entry<Character,Integer> entry: sortedList){
            System.out.print(entry.getKey() + ":");
            System.out.println(entry.getValue());
            for(int i=0;i<entry.getValue();i++)
            {
                sb.append(entry.getKey());
            }

        }
        sb.toString();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        List<Student> stds= new ArrayList<>();
        stds.add(new Student("abba", 23));
        stds.add(new Student("reefe", 12));
        stds.add(new Student("sfsf", 30));
        stds.add(new Student("ffsf", 2));
        stds.add(new Student("gsds", 10));

        rankList(stds);
    }

    private static void rankList(List<Student> stds) {
        Comparator<Student> cmp = (s1,s2)-> s2.getName().compareTo(s1.getName());
        stds.sort(cmp);
        for(Student std : stds){
            System.out.println(std);
        }
    }
}
