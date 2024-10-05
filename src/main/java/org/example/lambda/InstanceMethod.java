package org.example.lambda;

import java.util.Arrays;
import java.util.List;

public class InstanceMethod {
    public static void main(String[] args) {
        List<InstPerson> persons = Arrays.asList(
                new InstPerson("Susan"),
                new InstPerson("Kenny")
        );

        InstPerson person = new InstPerson("Maria");
        persons.forEach(person::instanceMethodReference);
    }
}

class InstPerson {
    private String name;

    public InstPerson(String name) {
        this.name = name;
    }

    public void instanceMethodReference(InstPerson instPerson) {
        System.out.println("Instance method reference: " + name);
    }
}