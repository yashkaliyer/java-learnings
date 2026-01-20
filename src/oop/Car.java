package oop;

public class Car {
    String brand;
    String model;
    int speed;
    public Car( String brand,String model, int speed){
        this.brand=brand;
        this.model=model;
        this.speed=speed;
    }
    public void  increaseSpeed(int s){
        speed=speed + s;
        System.out.println("Increased speed is: " + speed);
    }
    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car("TATA" , "SAFARI", 150);
        c1.displayDetails();
        c1.increaseSpeed(30);
        c1.displayDetails();
    }
}
