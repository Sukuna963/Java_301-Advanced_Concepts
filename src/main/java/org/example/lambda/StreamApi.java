package org.example.lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        Integer[] nums = {45, -87, -12, 77, -23};

        Stream<Integer> stream = Arrays.stream(nums);

        int sum = stream
                .filter(x -> x > 0)
                .reduce(0, (Integer a, Integer b) -> a + b);

        System.out.println("The sum is: " + sum);
    }
}
