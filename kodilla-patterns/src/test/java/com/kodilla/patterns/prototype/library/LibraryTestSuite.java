package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library chrisLibrary = new Library("Krzysztof Library");
        Book book1 = new Book("Tytuł1", "Author1", LocalDate.of(1997,12,1));
        Book book2 = new Book("Tytuł2", "Author2", LocalDate.of(1997,12,2));
        Book book3 = new Book("Tytuł3", "Author3", LocalDate.of(1997,12,3));
        Book book4 = new Book("Tytuł4", "Author4", LocalDate.of(1997,12,4));
        Book book5 = new Book("Tytuł5", "Author5", LocalDate.of(1997,12,5));
        chrisLibrary.getBooks().add(book1);
        chrisLibrary.getBooks().add(book2);
        chrisLibrary.getBooks().add(book3);
        chrisLibrary.getBooks().add(book4);
        chrisLibrary.getBooks().add(book5);

        Library margoLibrary = null;
        try {
            margoLibrary = chrisLibrary.shallowCopy();
            margoLibrary.setName("Margo Library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library whiskasLibrary = null;
        try {
            whiskasLibrary = chrisLibrary.deepCopy();
            whiskasLibrary.setName("Whiskas Library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        chrisLibrary.getBooks().remove(book2);
        //Then
        System.out.println(chrisLibrary);
        System.out.println(margoLibrary);
        System.out.println(whiskasLibrary);
        Assert.assertEquals(4,chrisLibrary.getBooks().size());
        Assert.assertEquals(4,margoLibrary.getBooks().size());
        Assert.assertEquals(5,whiskasLibrary.getBooks().size());

    }
}
