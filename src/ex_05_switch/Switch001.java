package ex_05_switch;

public class Switch001 {
    public static void main(String[] args) {
        int a=10;
        switch(-1)
        {
            case 1:
                System.out.println("1");
                break;
            case -1:
                System.out.println(-1);
                break;
            default:
                System.out.println("default");
        }

    }

}
