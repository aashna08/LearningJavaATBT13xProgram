package Blocks;

public class IIB_Static_Block {

    static { //static block -execute before main method only once
        System.out.println("Static block executed");
    }

    { //instance block //executes after main method and before constructor - every time object is created
        System.out.println("Instance block executed");
    }

    public IIB_Static_Block() { //constructor
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        IIB_Static_Block obj1 = new IIB_Static_Block();
        IIB_Static_Block obj2 = new IIB_Static_Block();
    }
}
