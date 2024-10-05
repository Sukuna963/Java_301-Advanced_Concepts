package org.example.generics;

public class BoundedType {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();

        integerBox.setT(Integer.valueOf(10));
        integerBox.inspect(Integer.valueOf(25));
        System.out.println(integerBox.square(Double.valueOf(10.2)));
    }
}

class Box <T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public <U extends Number> double square(U u) {
        return u.doubleValue() * u.doubleValue();
    }
}