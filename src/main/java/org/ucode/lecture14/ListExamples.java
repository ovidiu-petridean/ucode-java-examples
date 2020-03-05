package org.ucode.lecture14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        //Empty arraylist
        List<String> names = new ArrayList<>();

        //Arraylist initialized with another collection
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //Create arraylist
        List<String> namesList = new ArrayList<>();

        namesList.add("marian");
        namesList.add("alex");

        namesList.set(1, "brian");

        namesList.remove(1);

        //Iterator
        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Iterator<Integer> iterator = digits.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
