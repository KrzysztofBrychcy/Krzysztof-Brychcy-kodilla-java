package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.MedianaAdapter;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class MedianaAdapterTestSuite {
    @Test
    public void testPublicationYearMediana() {
        //Give
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Autor1", "Tytul1", 1, "1");
        Book book2 = new Book("Autor2", "Tytul2", 2, "2");
        Book book3 = new Book("Autor3", "Tytul3", 3, "3");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        MedianaAdapter medianaAdapter = new MedianaAdapter();
        //When
        int mediana = medianaAdapter.publicationYearMediana(books);
        //Then
        assertEquals(mediana, 2);
    }
}
