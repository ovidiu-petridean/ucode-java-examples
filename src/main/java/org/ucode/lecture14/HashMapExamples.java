package org.ucode.lecture14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        //put values
        map.put(1,  "A");
        map.put(2,  "B");
        map.put(3,  "C");

        System.out.println(map);

        //get values
        String myValue = map.get(2);

        System.out.println("The value is :: "+  myValue );

        //remove
        System.out.println(map);

        map.remove(3);

        System.out.println(map);

        //Iterate
        System.out.println("//Iterate over keys");

        Iterator<Integer> itr = map.keySet().iterator();

        while (itr.hasNext()) {
            Integer key = itr.next();
            String value = map.get(key);

            System.out.println("The key is :: " + key + ", and value is :: " + value );
        }

    }
}
