package org.example.lambda;

import java.util.ArrayList;

public class LambdaListProcessing {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(65);
        nums.add(44);
        nums.add(189);
        nums.add(88);

        nums.forEach(n -> System.out.println(n));

        MyFunctionalInterface msg = () -> {
            System.out.println("-- Odd Numbers --");
        };

        msg.oddNumbers();
        nums.forEach(n -> {
            if(n % 2 != 0) {
                System.out.println(n);
            }
        });
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    public void oddNumbers();
}
