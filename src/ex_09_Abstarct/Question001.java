package ex_09_Abstarct;
/* Animal Sound - Abstract Method Implementation
Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.
Expected Output:
Dog barks
Cat meows*/

public class Question001 {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        d.sound();
        c.sound();

    }
}

abstract class Animal
{
    abstract void sound();
}

class Dog extends Animal
{

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}
