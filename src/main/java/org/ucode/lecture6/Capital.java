package org.ucode.lecture6;

/*
22. Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:
Input a Sentence: the quick brown fox jumps over the lazy dog.
The Quick Brown Fox Jumps Over The Lazy Dog.
 */

public class Capital {

    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog.";
        String[] words = sentence.split(" ");
        String capitalized = "";

        for (int i = 0; i < words.length; i++) {
            String capitalizedWord = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            String finalWord = capitalizedWord.replaceAll("o", "O");

            System.out.print(finalWord + " ");


//            capitalized += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }
//        The Quick BrOwn FOx Jumps Over The Lazy DOg.
//        System.out.println(capitalized);
    }

}
