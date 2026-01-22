package oop;
 class Animal{
    public void sound(){
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
