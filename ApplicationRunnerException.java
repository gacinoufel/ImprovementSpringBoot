package org.springframework.boot; 

    /*
    * ApplicationRunnerException
    */

public class ApplicationRunnerException extends Exception{
    private static final long serialversionUID = 11;

    public ApplicationRunnerException(String msg) {
        super (msg); 
    }
}