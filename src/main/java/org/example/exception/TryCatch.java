package org.example.exception;

public class TryCatch {
    public static void main(String[] args) {
        int[] nums = {67, 43};

        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception caught");
            System.out.println("You attempted to access index");
            System.out.println("The Array has a length of " + nums.length);
        }

        System.out.println("Program Complete");
    }
}
