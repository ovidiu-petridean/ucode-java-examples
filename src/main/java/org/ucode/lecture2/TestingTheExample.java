package org.ucode.lecture2;

public class TestingTheExample {

    public static void main(String[] args) {
        Person person1 = new Person();
//        try {
            person1.setName("bob");
            person1.setAge(-1);
//        } catch (InvalidAgeException ex){
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }
        Person person2 = new Person("mihai", 60);
        Person person3 = new Person("alex", 60);
//        Person person1 = new Person();
//        person1.setName("\My name");
//        Person person2 = new Person();
//        char bla = 'a';
//        String bla2 = "";



        Person persons[] = new Person[10];
        persons[0] = new Person("bob", 32);
        for (int i=0; i<10; i++){
            persons[i] = new Person("Name " + i, 12);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(persons[i].getName());
        }



//        System.out.println("Person 1 name " + person1.getName());
//        System.out.println("Person 2 name " + person2.getName());
//        System.out.println("Person 3 name " + person3.getName());
    }
}
