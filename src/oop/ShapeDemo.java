package oop;

interface Shape{
    double area();
}
class Circle implements Shape{
    public double area(){
        int radius = 7;
        return 3.14 * radius * radius;

    }
}
class Rectangle implements Shape{
    public double area(){
        int length = 40;
        int breath = 24;
        return length * breath;
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        System.out.println("The Area of circle:  " + s1.area());
        System.out.println("The area of Rectangle: " + s2.area());
        }

}
