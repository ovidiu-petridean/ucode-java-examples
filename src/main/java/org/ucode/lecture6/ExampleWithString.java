package org.ucode.lecture6;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ExampleWithString {
    static String all = "";

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();

    }

    public static void myMethod(){
        int i = 0;

        while(i<10){
            String counter = "count " + i;
//            System.out.println(counter);
            i++;
            all = all + counter;
        }

        System.out.println(all);
    }
}
