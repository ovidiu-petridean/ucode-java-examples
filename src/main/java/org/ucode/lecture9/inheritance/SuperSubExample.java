package org.ucode.lecture9.inheritance;

public class SuperSubExample {

    public static void main(String[] args) {
//        SubClass subClass = new SubClass();
//        subClass.callDisplayFromBoth();
        SuperClass superClass = new SuperClass();
        superClass.display();
        SubClass subClass = new SubClass();
        subClass.display();
    }
}
