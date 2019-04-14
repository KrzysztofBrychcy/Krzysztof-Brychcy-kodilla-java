package com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianaAdaptee;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianaAdapter extends MedianaAdaptee implements Classifier {
    @Override
    public int publicationYearMediana(Set<com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, BookB> books = new HashMap<>();
        for(Book book : bookSet) {
            books.put(new BookSignature(book.getSignature()) , new BookB(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianaPublicationYear(books);
    }
}
