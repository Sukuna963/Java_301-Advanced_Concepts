package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peru", "Ghana", "Uruguay", "Georgia");

        Predicate<String> p = (s) -> s.startsWith("G");

        for(String st : names) {
            if(p.test(st))
                System.out.println(st);
        }
    }
}
