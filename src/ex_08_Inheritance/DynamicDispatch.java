package ex_08_Inheritance;
class Parent {
    void display() {
        System.out.println("Display method in Parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Display method in Child");
    }

    void show() {
        System.out.println("Show method in Child");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();   // ✅ valid //calls child method
        // p.show();   // ❌ error
    }
}