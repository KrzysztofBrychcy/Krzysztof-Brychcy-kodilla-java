package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    //books with title begiingig of titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //borowed books
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a bok for librabyUser
    //return true when succes
    //and returns false when book is not to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borowed by libraryUser to the library
    //returns number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
