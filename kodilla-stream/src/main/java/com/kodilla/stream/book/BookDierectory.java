package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public class BookDierectory {
    private final List<Book> theBookList = new ArrayList<>();

    public BookDierectory(){
        theBookList.add(new Book("Dylan Murphy", "Wolf of the mountains", 2003,"00001"));
        theBookList.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012,"00002"));
        theBookList.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001,"00003"));
        theBookList.add(new Book("Aimee Murphy", "Rejecting the night", 2015,"00004"));
        theBookList.add(new Book("Ryan Talley", "Gangsters and kings", 2007,"00005"));
        theBookList.add(new Book("Madelynn Carson", "Unity without duty", 2007,"00006"));
        theBookList.add(new Book("Giancarlo Guerrero", "Enemies of eternity", 2009,"00007"));
    }

    public List<Book> getList(){
        return new ArrayList<>(theBookList);
    }
}
