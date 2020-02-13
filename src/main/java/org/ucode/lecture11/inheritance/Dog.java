package org.ucode.lecture11.inheritance;

public class Dog extends Animal {

    public LabradorSound makeAnimalSound(){
//        System.out.println("Animal sound " + name + " overriden ");
        return new LabradorSound();
    }

    public Dog() {
        super();
    }
}
