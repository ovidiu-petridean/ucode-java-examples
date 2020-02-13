package org.ucode.lecture11.inheritance;

public class LabradorSound extends DogSound{

    public static void makeStaticSound(){
        System.out.println(".Labrador...");
    }

    public void makeFunnySound(){
        System.out.println("meow");
    }

    public void makeSound(String as){
        System.out.println("Labrador " + as);
    }
}
