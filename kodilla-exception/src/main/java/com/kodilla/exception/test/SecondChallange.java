package com.kodilla.exception.test;

public class SecondChallange {
    public String probablyWillThrowException(double x, double y) throws ExceptionHandling {

        try{

        if(x >= 2 || x < 1 || y == 1.5) {

            throw new Exception();

            }

        }catch(Exception e) {

            throw new ExceptionHandling();

        }finally {

            System.out.println("Remember choose wisly!");

        }
        return "Done!";
    }

    public static void main(String args[]){

        SecondChallange secondChallange = new SecondChallange();

        try {

            secondChallange.probablyWillThrowException(3, 1.5);

        }catch(ExceptionHandling e) {

            System.out.println("Problem with Handing");

        }

    }
}
