package org.example.generics.challenge;

import java.util.Arrays;

public class GenericClassChallenge {
    public static void main(String[] args) {
        Object[] array = {1, "number", 'c', 25.8};

        ArrayGeneric a = new ArrayGeneric();

        a.printArray(array);
    }
}

class ArrayGeneric <T> {
    public void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }
}
