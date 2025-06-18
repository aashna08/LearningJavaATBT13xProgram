package ex_05_switch;

public class switch002_jdk13 {
    public static void main(String[] args) {
        int item_code=001;
                switch(item_code)
                {
                    case 001 -> System.out.println("Case 1");
                    case 002 -> System.out.println("Case 2");
                    default -> System.out.println("Default");
                    case 003,004 -> System.out.println("Multiple");
                }
                //break is option and can be used for one liner only
        //multiple cases also supported together
    }
}
