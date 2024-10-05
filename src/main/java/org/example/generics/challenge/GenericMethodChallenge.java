package org.example.generics.challenge;

public class GenericMethodChallenge {
    public static void main(String[] args) {
        GenericMethodTest obj = new GenericMethodTest();

        obj.printElement("this is generic");
        obj.printElement(7.2);
        obj.printElement(4);
    }
}

class GenericMethodTest {
    public <T> void printElement(T element) {
        System.out.println(element);
    }
}
