package com.example;

public class Main {

    public static void main(String[] args) {
        float value1 = 5;
        float value2 = 10;

        //Created context with addition strategy
        Context context = new Context(new Addition());
        System.out.println("Addition of values = " + context.executeStrategy(value1, value2));

        //Assigning multiplication strategy to the context
        context = new Context(new Multiplication());
        System.out.println("Multiplication of values = " + context.executeStrategy(value1, value2));

        //Assigning subtraction strategy to the context
        context = new Context(new Subtraction());
        System.out.println("Subtraction of values = " + context.executeStrategy(value1, value2));
    }
}
