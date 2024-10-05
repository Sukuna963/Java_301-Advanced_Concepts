package org.example.generics;

public class GenericClass {
    public static void main(String[] args) {
        MyGeneric name = new MyGeneric("Generics");
        MyGeneric number = new MyGeneric(10);

        NewGeneric luckyNumber = new NewGeneric("Number:", 25);

        name.print();
        number.print();

        luckyNumber.print();
    }
}

class MyGeneric <T> {
    T val;

    public MyGeneric(T val) {
        this.val = val;
    }

    public void print() {
        System.out.println(val);
    }
}

class NewGeneric <T> {
    T val1;
    T val2;

    public NewGeneric(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public void print() {
        System.out.println(val1 +" "+ val2);
    }
}
