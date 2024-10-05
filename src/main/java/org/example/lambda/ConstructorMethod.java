package org.example.lambda;

import java.util.function.Function;

public class ConstructorMethod {
    public static void main(String[] args) {
        Function<String, ConstPerson> personConstructor = ConstPerson::new;

        ConstPerson person = personConstructor.apply("Susan");
    }
}

class ConstPerson {
    private String name;

    public ConstPerson(String name) {
        this.name = name;
    }
}