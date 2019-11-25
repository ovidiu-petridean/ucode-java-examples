package org.ucode.lecture3;

public class TestingExamples {

    public static void main(String[] args) throws InterruptedException {
        Student one = new Student("popescu", "first street", "bob", 123);
//        one.getName();
        System.out.println(Student.PI);
//        Student.PI = 2.1;
//        Student.PI_2 = 2.1;

        Student two = new Student("a", "v street", "c", 160);
        Student three = new Student("thename", "bla", "address", 123);
        Student five = new Student("Andrei", "L", "address", 200);

        Student[] studentArray = new Student[10];
        studentArray[0] = one;
        studentArray[1] = two;
        studentArray[2] = three;
        studentArray[5] = five;

//        int i = 0;

//        while (studentArray[i] != null){
//            System.out.println("Array position " + i);
//            if (studentArray[i].getHeight() > 150){
//                System.out.println("Student " + studentArray[i].getName() + " is taller than 150");
//            }
////            Thread.sleep(3000);
//            i++;
//        }

        for (int i=0; i<studentArray.length; i++){
            System.out.println("Element " + i);

            if (studentArray[i] != null){
               printTheNameOfEligibleStudents(studentArray[i], 150);
            }
        }


//        System.out.println(one.toString());


//
//        System.out.println(one.getName());
//        System.out.println(one.getLastName());
//        System.out.println(one.getAddress());
//        System.out.println(one.getHeight());

//        if (one.getHeight() > two.getHeight()){
//            System.out.println("Student " + one.getName()  + " is taller than student " +
//                    two.getName());
//        }

    }

    public static void printTheNameOfEligibleStudents(Student student, int minHeight){
        if (student.getHeight() > minHeight){
            System.out.println("Student " + student.getName() + " is taller than 150");
        }
    }

}
