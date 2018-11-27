package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor(){
        //Given
        BookDierectory bookDierectory = new BookDierectory();

        //When
        List<Book> books = bookDierectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book : books){
            if(book.getYearOfProduction() > 2007){
                numberOfBooksPublicatedAfter2007 ++;
            }
        }
        Assert.assertEquals(3,numberOfBooksPublicatedAfter2007);
    }
    @Test
    public void testGetListUsingIntStream(){
        //Given
        BookDierectory bookDierectory = new BookDierectory();

        //When
        List<Book> books = bookDierectory.getList();

        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0,books.size())
                .filter(n -> books.get(n).getYearOfProduction() > 2007)
                .count();
        Assert.assertEquals(3,numberOfBooksPublicatedAfter2007);

    }
}
