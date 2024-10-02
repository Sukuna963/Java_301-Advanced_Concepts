package org.example.exception;

public class Finally {
    public static void main(String[] args) {
        int[] nums = {67, 43};

        try {
            System.out.println(nums[1]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Error detected. Sorry bout that!");
            System.out.println(exc.getMessage());
        } finally {
            System.out.println("Program Complete");
        }
    }
}
