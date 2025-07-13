package ex_10_Interface;

public class Question003 {
    public static void main(String[] args) {
        Carr c1=new Carr();
        System.out.println(c1.MAX_SPEED);

    }
}

interface SpeedLimit
{
    int MAX_SPEED=120;
}

class Carr implements SpeedLimit
{
   // int MAX_SPEED=190;

}
