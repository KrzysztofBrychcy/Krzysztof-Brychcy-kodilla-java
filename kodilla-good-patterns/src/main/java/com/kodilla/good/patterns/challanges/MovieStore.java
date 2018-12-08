package com.kodilla.good.patterns.challanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslation = new ArrayList<>();
        ironManTranslation.add("Żelazny Człowiek");
        ironManTranslation.add("Iron Man");

        List<String> avengersTranslation = new ArrayList<>();
        avengersTranslation.add("Mściciele");
        avengersTranslation.add("Acengers");

        List<String> flashTransaltion = new ArrayList<>();
        flashTransaltion.add("Błyskawica");
        flashTransaltion.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslation = new HashMap<>();
        booksTitlesWithTranslation.put("IM", ironManTranslation);
        booksTitlesWithTranslation.put("AV", avengersTranslation);
        booksTitlesWithTranslation.put("FL", flashTransaltion);

        return booksTitlesWithTranslation;
    }

public static void main(String args[]) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(l -> l.getValue().stream())
                .map(t -> t + " ! ")
                .forEach(System.out::print);

    }
}
