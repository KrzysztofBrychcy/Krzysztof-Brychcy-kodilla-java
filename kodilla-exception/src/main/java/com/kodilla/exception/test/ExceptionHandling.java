package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public ExceptionHandling(){
        super();
        System.out.println("Problem with Handing 1");
    }
    public ExceptionHandling(Throwable cause){
        super(cause);
    }
}
