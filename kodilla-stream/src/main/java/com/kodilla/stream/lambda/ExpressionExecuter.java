package com.kodilla.stream.lambda;

public class ExpressionExecuter {
    public void executeExpresion(double a, double b, MathExpression mathExpression){
        double result = mathExpression.calcuteExpression(a,b);
        System.out.println("Wynik to: " + result);

    }
}
