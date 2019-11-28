package org.ucode.lecture5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstExample {


    public static void main(String[] args) throws IOException {

        while(true){
            //Enter data using BufferReader
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));

            // Reading data using readLine
            String numberAsString = null;

//            try {
            Long theNumber = parseTheNumber(reader);

            System.out.println("The number is " + theNumber);
//            } catch (NumberFormatException | IOException myException){
//                System.out.println("We only take numbers...");
//                System.out.println(myException.getClass());
//            }
        }
    }

    private static Long parseTheNumber(BufferedReader reader) throws IOException {
        String numberAsString;

        try{
             numberAsString = reader.readLine();
             return Long.parseLong(numberAsString);
        } catch (IOException | NumberFormatException myException){
                System.out.println("We only take numbers...");
                System.out.println(myException.getClass());
        } finally {
            System.out.println("Finally here...");
        }

        return 0L;
    }

}
