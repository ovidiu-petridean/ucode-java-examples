package org.ucode.lecture5;

import java.io.FileInputStream;
import java.io.IOException;

public class Check {

    public static void main(String[] args) {
        try {
            FileInputStream reader = new FileInputStream("e://ex2.txt");
            int num = reader.read();
            for (int i=0; i<11; i++){
                System.out.println(num + " * " + i+ "= "+ num*i);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
