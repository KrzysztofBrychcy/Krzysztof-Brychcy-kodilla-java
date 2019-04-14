package com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, BookB> books);
    int medianaPublicationYear(Map<BookSignature, BookB> books);
}
