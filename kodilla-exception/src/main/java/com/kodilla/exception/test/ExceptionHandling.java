package com.kodilla.exception.test;

public class ExceptionHandling {

    public ExceptionHandling(){
        super();
        System.out.println("Problem with Handing 1");
    }



    public static void main(String args[]){
        SecondChallange secondChallange = new SecondChallange();
        try {
            secondChallange.probablyWillThrowException(3, 1.5);
        }catch(Exception e) {
            System.out.println("Something gone wrong!");

        }finally {
            System.out.println("Remember choose wiesly");
        }
    }
}
