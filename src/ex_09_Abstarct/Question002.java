package ex_09_Abstarct;

public class Question002 {
    public static void main(String[] args) {
        SBI s=new SBI();
        HDFC h=new HDFC();

    }
}

abstract class Bank
{
    abstract void getInterestRate();
}

class SBI extends Bank
{
    void getInterestRate()
    {
        System.out.println("6.5%");
    }
}

class HDFC extends Bank
{
    void getInterestRate()
    {
        System.out.println("7.0%");
    }
}
