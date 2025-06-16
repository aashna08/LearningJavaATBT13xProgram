package ex_04_inc_dec_op;

public class inc_dec_questions {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        int a=5;
        int b=a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Exercise 2");
        int i=1;
        i=i++ + ++i;
        System.out.println(i);
        System.out.println("Exercise 3");
        int x=5;
        System.out.println(x++ + ++x);
        System.out.println("Exercise 4");
        int c=5;
        int d=c++ + ++c;
        System.out.println(c);
        System.out.println(d);
        System.out.println("Exercise 5");
        int e=5;
        int f = e++ + ++e + e++ + ++e;
        System.out.println(e);
        System.out.println(f);
    }
}
