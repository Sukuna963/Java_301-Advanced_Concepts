package org.example.lambda;

import java.util.Arrays;
import java.util.List;

public class StaticMethod {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Susan"),
                new Person("Kenny")
        );

        persons.forEach(Person::staticMethodReference);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public static  void staticMethodReference(Person person) {
        System.out.println("Static method reference: " + person.name);
    }

    public String getName() {
        return name;
    }
}