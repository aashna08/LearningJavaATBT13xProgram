package ex_10_Interface;

public class Question001 {
    public static void main(String[] args) {
        Document d=new Document();
        d.print();
        d.show();
    }

}

interface Printable
{
    void print();
}
interface Showable
{
    void show();
}

class Document implements Printable,Showable
{

    @Override
    public void print() {
        System.out.println("Print method implemented");
    }

    @Override
    public void show() {
        System.out.println("Show method implemented");

    }
}
