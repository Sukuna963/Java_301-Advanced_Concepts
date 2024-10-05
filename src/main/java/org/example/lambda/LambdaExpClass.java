package org.example.lambda;

public class LambdaExpClass {
    public static void main(String[] args) {
        Operate obj = new Operate();

        FuncInterface add = (int x, int y) -> x + y;
        FuncInterface multiply = (int x, int y) -> x * y;

        System.out.println("Addition is " + obj.operate(6, 3, add));
        System.out.println("Multiplication is " + obj.operate(6, 3, multiply));
    }
}

interface FuncInterface {
    int operation(int a, int b);
}

class Operate {
    public int operate(int a, int b, FuncInterface fobj) {
        return fobj.operation(a, b);
    }
}
