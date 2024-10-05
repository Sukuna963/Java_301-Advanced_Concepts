package org.example.generics.challenge;

public class BoundedTypeChallenge {
    public static void main(String[] args) {
        NumericExample ne = new NumericExample();

        System.out.println(ne.sumNumerics(10.0, 20.0));
        System.out.println(ne.sumNumerics(5, 9));
        System.out.println(ne.sumNumerics(57.8978f, 19.8978f));
        System.out.println(ne.sumNumerics(5, 56.78));
    }
}

class NumericExample {
    public <U extends Number> Double sumNumerics(U firstNumber, U secondNumber) {
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }
}
