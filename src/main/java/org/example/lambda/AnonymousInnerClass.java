package org.example.lambda;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        ExampleInterface obj = new ExampleInterface() {
            @Override
            public double calculate(double a, double b) {
                if(a > b){
                    return a;
                } else {
                    return b;
                }
            }
        };

        double largerNumber = obj.calculate(5, 8);
        System.out.println("The larger number is: " + largerNumber);
    }
}

interface ExampleInterface {
    double calculate(double a, double b);
}
