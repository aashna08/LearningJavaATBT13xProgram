package ex_10_Interface;

public class Question002 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
        //Car.fuelType(); will not work
        Vehicle.fuelType();
    }

}

interface Vehicle
{
    default void start()
    {
        System.out.println("Vehicle started");
    }
    static void fuelType()
    {
        System.out.println("Fuel type is petrol");
    }
}

class Car implements Vehicle
{

}
