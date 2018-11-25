package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {
    @Test
    public void testListBookWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibraryTest = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListBook = new ArrayList<Book>();
        Book book1 = new Book("Hellboy", "Autor1", 2001);
        Book book2 = new Book("Hellhound", "Autor2", 2002);
        Book book3 = new Book("Hello, Hello", "Autor3", 2003);
        Book book4 = new Book("HelloKitty", "Autor4", 2004);
        resultListBook.add(book1);
        resultListBook.add(book2);
        resultListBook.add(book3);
        resultListBook.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Hell")).thenReturn(resultListBook);

        //When
        List<Book> theListOfBooks = bookLibraryTest.listBooksWithCondition("Hell");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int i = 1; i <= booksQuantity; i++) {
            Book theBook = new Book("Title" + i, "Autor" + i, 2000 + i);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBookWithConditionMoreThen20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibraryTest = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfBooks(15);
        List<Book> resultListOf40Books = generateListOfBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> listOf0Books = bookLibraryTest.listBooksWithCondition("ZeroBooks");
        List<Book> listOf15Books = bookLibraryTest.listBooksWithCondition("Any Title");
        List<Book> listOf40Books = bookLibraryTest.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, listOf0Books.size());
        assertEquals(15, listOf15Books.size());
        assertEquals(0, listOf40Books.size());

    }

    @Test
    public void testListBookWithConditionFragmentShorterThen3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibraryTest = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOf10Books = bookLibraryTest.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOf0Book() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibraryTest = new BookLibrary(libraryDatabaseMock);
        LibraryUser user0 = new LibraryUser("User0", "User0L", "00000");
        LibraryUser user1 = new LibraryUser("User1","User1L","111111");
        LibraryUser user5 = new LibraryUser("User5","User5L","555555");
        List<Book> borrowed0Books = new ArrayList<>();
        List<Book> borrowed1Books = generateListOfBooks(1);
        List<Book> borrowed5Books = generateListOfBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(user0)).thenReturn(borrowed0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(borrowed1Books);
        when(libraryDatabaseMock.listBooksInHandsOf(user5)).thenReturn(borrowed5Books);


        //When
        List<Book> listOf0Books = bookLibraryTest.listBooksInHandsOf(user0);
        List<Book> listOf1Books = bookLibraryTest.listBooksInHandsOf(user1);
        List<Book> listOf5Books = bookLibraryTest.listBooksInHandsOf(user5);

        //Then
        assertEquals(0, listOf0Books.size());
        assertEquals(1,listOf1Books.size());
        assertEquals(5,listOf5Books.size());
    }
}
