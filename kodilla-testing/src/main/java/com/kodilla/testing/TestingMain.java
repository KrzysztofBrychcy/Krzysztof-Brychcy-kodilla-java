package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String args[]){

        System.out.println("Moduł6.2. Sprawdzenie Klasy Calculator");

        System.out.println("");
        System.out.print("Dodawanie:\t");

        Calculator kalkulator = new Calculator();
        if (kalkulator.add(4,13) == (4 + 13)){
            System.out.println("Test OK");
        }else {
            System.out.println("Error!");
        }

        System.out.print("Odejmanie:\t");

        if(kalkulator.subtract(45,76) == (45 - 76)){
            System.out.println("Test OK");
        }else {
            System.out.println("Error!");
        }


    }
}
