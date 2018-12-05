package com.kodilla.exception.test;

public class SecondChallange {
    public String probablyWillThrowException(double x, double y) throws Exception {

        if(x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
            }

        return "Done!";
    }

    public static void main(String args[]) throws ExceptionHandling {
        SecondChallange secondChallange = new SecondChallange();
        try {
            secondChallange.probablyWillThrowException(3, 1.5);
        }catch(Exception e) {
            throw new ExceptionHandling();

        }finally {
            System.out.println("Remember choose wiesly");
        }
    }
}
