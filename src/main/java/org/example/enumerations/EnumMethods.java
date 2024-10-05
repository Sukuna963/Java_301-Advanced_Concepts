package org.example.enumerations;

public class EnumMethods {
    public static void main(String[] args) {
        Gravity gravity = new Gravity();

        double yourWeight = 175.0;

        double mass = yourWeight / gravity.surfaceGravity(Planet.EARTH);

        for (Planet p : Planet.values()) {
            System.out.printf("Your weight on %s is %f%n", p,
                    gravity.surfaceWeight(mass, p));
        }
    }
}

class Gravity {
    private static final double G = 6.67300E-11;

    public double surfaceGravity(Planet planet) {
        return G * planet.getMass() / (planet.getRadius() * planet.getRadius());
    }

    public double surfaceWeight(double otherMass, Planet planet) {
        return otherMass * surfaceGravity(planet);
    }
}

enum Planet {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}