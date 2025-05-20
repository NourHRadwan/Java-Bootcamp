package com.company.Assignments.Assignment2;

public class Q4 {
    public static void main(String[] args) {
        /*4 Write a function getMin that takes an array as a parameter and returns the
        minimum value in the array.*/
        int[] numbers = {10, 100, 45, 19, 72, 55};
        int min = getMin(numbers);
        System.out.println("Min number is: " + min);
    }

    public static int getMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        for (int number : arr) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

}
