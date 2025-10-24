package Interview;

import java.util.*;

public class Student {

    String name;
    int rollno;
    int marks;

    public String getName() {
        return name;
    }

    Student(String name,int rollno,int marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return name + " : " + String.valueOf(marks)  + " : " + String.valueOf(rollno);
    }



    public static void main(String[] args) {

        List<Student> l1=new ArrayList<>();
        l1.add(new Student("Aaryan",123,60));
        l1.add(new Student("Khushi",124,50));
        l1.add(new Student("Aaryan",125,90));
        l1.add(new Student("Zara",126,60));
        l1.add(new Student("Mehak",127,60));
        l1.add(new Student("Mehak",137,60));


        l1.add(new Student("Mehak",147,70));
        l1.add(new Student("Mehak",157,65));
        l1.add(new Student("Aaryan",128,78));

        List<Student> l2=new ArrayList<>();
        Map<String, List<Student>> studentMap = new HashMap<>();
        for(Student s : l1)
        {
            if(studentMap.containsKey(s.getName())){
                studentMap.get(s.getName()).add(s);
            }else{
                List<Student> std = new ArrayList<>();
                std.add(s);
                studentMap.put(s.getName(), std );
            }

//            if(s.getName().equalsIgnoreCase("Aaryan"))
//            {
//                l2.add(s);
//            }
        }

        for(String name : studentMap.keySet()){
            System.out.println(name + " : ");
            for(Student s : studentMap.get(name)){
                System.out.println(s);
            }
        }
        Comparator<Student> comp=(s1,s2)-> {
            if(s2.getMarks() == s1.getMarks()){
                return s1.getRollno() - s2.getRollno();
            }
            return s2.getMarks() - s1.getMarks();
        };
        List<Student> ms = studentMap.get("Mehak");
        ms.sort(comp);
        for(Student s : ms)
        {
            System.out.println(s);
        }

    }
}
