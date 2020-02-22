package org.ucode.lecture12.examples;

public interface Phone {

    void makeASound();

    String name = "interface name";

    default void call() {
        System.out.println("Making a very useful default call");
    }
}
