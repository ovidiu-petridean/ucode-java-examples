package org.ucode.lecture9.inheritance;

public class Dog extends Animal {

    public Dog(int age) {
        super(0);
    }

    //overwrite the makeASound method
    public void makeASound(){
        System.out.println("Bark");
    }

    public void printAge(){
        System.out.println(age);
    }
}
