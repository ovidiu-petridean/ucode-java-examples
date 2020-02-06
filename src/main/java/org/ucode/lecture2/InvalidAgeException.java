package org.ucode.lecture2;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String reason){
        super(reason);
    }
}
