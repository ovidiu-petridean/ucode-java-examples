package org.ucode.lecture11.inheritance;

public class MainClass {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

//        animal.makeAnimalSound("CustomSound");
//        animal.makeAnimalSound();
//        animal.setName("Bla");
//        animal.makeAnimalSound();
//
        dog.setName("Dog");
        LabradorSound labradorSound = dog.makeAnimalSound();
        labradorSound.makeSound();
        labradorSound.makeStaticSound();
    }
}
