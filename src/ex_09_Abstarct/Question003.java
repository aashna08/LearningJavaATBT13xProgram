package ex_09_Abstarct;

public class Question003 {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.display();
        c1.show();
    }
}

abstract class Parent
{
    abstract void show();
    void display()
    {
        System.out.println("Concrete method in abstarct class");
    }
}

class Child extends Parent
{
    void show()
    {
        System.out.println("Show method implemented");
    }
}
