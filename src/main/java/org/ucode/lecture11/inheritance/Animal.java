package org.ucode.lecture11.inheritance;

public  class Animal {

    private int age;
    protected String name;
//
//   public void makeAnimalSound(String customSound){
//       System.out.println("Animal sound " + name + " - "+ customSound);
//   }


    public Animal() {
        this.name = null;
        this.age = 0;
    }

    public AnimalSound makeAnimalSound(){
//        System.out.println("Animal sound " + name );
        return new AnimalSound();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
