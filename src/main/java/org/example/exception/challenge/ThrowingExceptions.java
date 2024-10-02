package org.example.exception.challenge;

public class ThrowingExceptions {
    public static void main(String[] args) {
        try {
            int a = division(4, 2);
            int b = division(6, 0);
            int c = division(10, 5);
            System.out.println(" a = " + a);
            System.out.println(" b = " + b);
            System.out.println(" c = " + c);
        } catch (ArithmeticException exc) {
            System.out.println(exc.toString());
        }
    }

    public static int division(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
