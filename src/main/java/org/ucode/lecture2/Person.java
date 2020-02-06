package org.ucode.lecture2;

public class Person {
    private String name;
    private int age;
    public static  int height = 100;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void myMethod(){
        this.name = "asdasd";
        String justAName = "asd";
    }

    public static void setHeight(int height) {
        Person.height = height;
    }

    public static int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 1 || age > 130){
            throw new InvalidAgeException("Age must be between 1 and 130");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
