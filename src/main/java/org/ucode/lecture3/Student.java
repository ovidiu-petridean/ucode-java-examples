package org.ucode.lecture3;

public class Student {
    private String address;
    private int height;
    private String name;
    private String lastName;
    public static final double PI = 3.14;
    public static  double PI_2 = 3.14;

    public Student(String name, String lastName, String address, int height){
        this.name = name;
        this.height = height;
        this.lastName = lastName;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
