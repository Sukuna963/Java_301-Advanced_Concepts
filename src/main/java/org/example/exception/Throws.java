package org.example.exception;

public class Throws {
    public static void main(String[] args) {
        try {
            int x = divide(4,0);
        } catch (ArithmeticException exc) {
            System.out.println("an exception was thrown from the divide() method");
        }

        System.out.println("all done!");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
