package org.example.exception.challenge;

/*
* The following code performs a division. But there's an issue:
* If the parameter b ever happens to be 0, an uncaught exception will be thrown, terminating the program.
* Challenge:
* Surround the line where the division operation takes place with a try-catch that catches any ArithmeticException
*  and returns -1 when an exception is indeed generated.
* */

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling obj = new ExceptionHandling();
        System.out.println(obj.division(6, 2));
        System.out.println(obj.division(55, 5));
        System.out.println(obj.division(4, 0));
        System.out.println(obj.division(20, 4));
        System.out.println("all done!");
    }

    public int division(int a, int b) {
        try {
            return a / b ;
        } catch (ArithmeticException exc) {
            return -1;
        }
    }
}
