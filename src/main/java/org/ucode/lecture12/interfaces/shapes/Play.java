package org.ucode.lecture12.interfaces.shapes;

public class Play {

    public static void main (String[] args) {

        // creating the Object of Rectangle class
        // and using shape class reference.
        Shape rect = new Rectangle(2,3, "Rectangle");
        System.out.println("Area of rectangle: " + rect.area());
        rect.moveTo(1,2);

        System.out.println(" ");

        // creating the Objects of circle class
        Shape circle = new Circle(2, "Cicle");
        System.out.println("Area of circle: " + circle.area());
        circle.moveTo(2,4);

    }
}
