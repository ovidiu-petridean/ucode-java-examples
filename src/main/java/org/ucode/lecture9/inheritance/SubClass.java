package org.ucode.lecture9.inheritance;

public class SubClass extends SuperClass{
    int num = 10;

    // display method of sub class
    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public void callDisplayFromBoth() {
        super.display();
        display();
    }
}
