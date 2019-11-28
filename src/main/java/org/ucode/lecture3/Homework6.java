package org.ucode.lecture3;

/**
 * 6. Create a class called Sequence. Read from the keyboard a number (long)
 * and print "yes" or "no" if the number has its digits in sequential order
 * (both increasing or decreasing).
 *
 * Example:
 * read -> 12345
 * print -> yes
 *
 * read-> 432
 * print -> yes
 *
 * read-> 123451
 * print -> no
 */

public class Homework6 {

    public static void main(String[] args) {
        long firstNumber = -321;

        String firstNumberAsString = Long.toString(firstNumber);

        boolean increasing = false;
        boolean decreasing = false;


        if (firstNumberAsString.length() < 2){
            System.out.println("use numbers that have more than 1 digit");
        } else {
            char firstDigit = firstNumberAsString.charAt(0);
            char secondDigit = firstNumberAsString.charAt(1);

            if ((int) firstDigit == (int )(secondDigit - 1) ){
                increasing = true;
            } else if ((int) firstDigit == (int )(secondDigit + 1)){
                decreasing = true;
            }

            if (increasing){
                increasing = isSequential(firstNumberAsString, -1);
            } else if (decreasing){
                decreasing = isSequential(firstNumberAsString, 1);
            }
        }

        if (increasing || decreasing){
            System.out.println("sequential");
        }

    }

    private static boolean isSequential(String firstNumberAsString,int increment) {
        boolean sequential = true;

        for (int i=1; i<firstNumberAsString.length() -1; i++){
            char currentCharacter =  firstNumberAsString.charAt(i);
            char nextCharacter =  firstNumberAsString.charAt(i+1);
            if (!((int) currentCharacter == (int )(nextCharacter + increment))){
                sequential = false;
                break;
            }
        }

        return sequential;
    }

}
