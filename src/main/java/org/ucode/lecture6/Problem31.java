package org.ucode.lecture6;

/*
Write a Java program to create a new array of length 2 from two arrays of integers
with three elements and the new array will contain the first and last elements from the two arrays.
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:
Array1: [50, -20, 0]
Array2: [5, -50, 10]
New Array: [50, 10]
 */

public class Problem31 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[3];

        array1[0] = 50;
        array1[1] = -20;
        array1[2] = 0;
        array1[3] = 123;
        array1[4] = 12321;

        array2[0] = 5;
        array2[1] = -50;
        array2[2] = 10;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                System.out.println("Number: " + array1[i] + " is greater than 0");
                System.out.println("bla");
            }

//            } else if (array1[i] < 0)
//                System.out.println("Number: " + array1[i] + " is less than 0");
//            else
//                System.out.println("Number: " + array1[i] + "is  0");


        }


//        int[] array3 = new int[2];
//        array3[0] = array1[0];
//        array3[1] = array2[2];

    }

}
