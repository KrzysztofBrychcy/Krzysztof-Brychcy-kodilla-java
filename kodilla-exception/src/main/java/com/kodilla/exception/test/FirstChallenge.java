package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;

import java.io.IOException;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException{

        try{
            if(b == 0){
                throw new ArithmeticException();
            }

        }catch (ArithmeticException e){

            System.out.println("You divided by 0! Error:" + e);

        }finally {

            System.out.println("Remember not to divide by 0!");

        }
        return a/b;
    }

    /*
    *   this main can throw an ArithemticException
    *   @param args
    * */
    public static void main(String args[]){
        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3,0);
        System.out.println(result);
    }
}
