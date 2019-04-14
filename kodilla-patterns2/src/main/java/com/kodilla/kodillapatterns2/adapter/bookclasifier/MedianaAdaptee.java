package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianaAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        return 0;
    }

    @Override
    public int medianaPublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.medianaPublicationYear(books);

    }
}
