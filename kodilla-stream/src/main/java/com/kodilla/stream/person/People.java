package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public class People {
    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();
        theList.add("Jan Smith");
        theList.add("Dorota Newman");
        theList.add("Jan Wolkowitz");
        theList.add("Lucyna Riley");
        theList.add("Owen Odbiór");
        theList.add("Matylda Davis");
        theList.add("Declan Booth");
        theList.add("Corine Foster");
        theList.add("Kloi Fry");
        theList.add("Marcin Valenzuela");

        return new ArrayList<String>(theList);
    }
}
