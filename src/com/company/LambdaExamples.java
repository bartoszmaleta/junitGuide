package com.company;

public class LambdaExamples {

    interface MathOperation {
        int operation (int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }



    public static void main(String[] args) {
        LambdaExamples tester = new LambdaExamples();

        MathOperation addition = (int a, int b) -> a + b;

        MathOperation subtraction = (int a, int b) -> a - b;

        MathOperation multiplication = (int a, int b) -> a * b;

        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));


        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        greetingService1.sayMessage("Bartosz");
        greetingService1.sayMessage("John");


    }
}
