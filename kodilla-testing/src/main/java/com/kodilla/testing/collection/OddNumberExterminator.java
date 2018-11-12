package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> parzyste = new ArrayList<>();

        for(Integer x : numbers){
            if(x % 2 == 0){
                parzyste.add(x);
            }
        }

        return parzyste;
    }
}
