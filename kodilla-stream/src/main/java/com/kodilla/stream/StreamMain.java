package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args){
        System.out.println("Welcome to modul7 - Stream");

//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("Cokolwiek 3"));

//        ExpressionExecuter expressionExecuter = new ExpressionExecuter();

/*
        System.out.println("Calculating exprsion with lamda");
        expressionExecuter.executeExpresion(10,5,(a,b) -> a + b);
        expressionExecuter.executeExpresion(10,5,(a,b) -> a - b);
        expressionExecuter.executeExpresion(10,5,(a,b) -> a * b);
        expressionExecuter.executeExpresion(10,5,(a,b) -> a / b);

        System.out.println("Calculating expresion with metod referencee");
        expressionExecuter.executeExpresion(3,4, FunctionalCalculator::addAToB);
        expressionExecuter.executeExpresion(3,4, FunctionalCalculator::subBFromA);
        expressionExecuter.executeExpresion(3,4, FunctionalCalculator::mulitplayAByB);
        expressionExecuter.executeExpresion(3,4, FunctionalCalculator::divededAByB);
*/

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ferdydurka", (poem) -> poem.concat("ABC"));
        poemBeautifier.beautify("Ferdydurka", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("Ferdydurka", (poem) -> poem.substring(0,3));
        poemBeautifier.beautify("Ferdydurka", (poem) -> poem.replace('r','K'));
        poemBeautifier.beautify("Ferdydurka", (poem) -> poem.toLowerCase());
        poemBeautifier.beautify("Ferdydurka", (poem) -> poem.replaceFirst("Fer","KAL"));



    }
}
