package org.ucode.lecture12.examples;

public interface MobilePhone extends Phone {

    public void checkSignal();

    default void call() {
        System.out.println("Making a very useful default mobile call");
    }

    static void answer(){
        System.out.println("answering the phone");
    }

}
