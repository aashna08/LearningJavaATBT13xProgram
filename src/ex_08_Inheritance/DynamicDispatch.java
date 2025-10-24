//package ex_08_Inheritance;
//
//public class DynamicDispatch {
//    public static void main(String[] args) {
//        Father f=new Son();
//        f.f1(); //only common methods can be accessed
//       // f.s1(); not possible
//
//        Son s=new Son();
//        s.s1();
//        s.f1();
//
//    }
//
//    class Father
//    {
//        public void f1()
//        {
//            System.out.println("Father class method");
//        }
//    }
//
//    class Son extends Father
//    {
//        public void s1()
//        {
//            System.out.println("Son class method");
//        }
//    }
//}
