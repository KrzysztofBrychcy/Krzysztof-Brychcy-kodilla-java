package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String PoemToBeautify, PoemDecorator poemDecorator){
        String BeatyPoem = poemDecorator.decorate(PoemToBeautify);
        System.out.println(BeatyPoem);
    }
}
