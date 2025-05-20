package com.company.Assignments.Assignment2;

public class Q3 {

    public static void main(String[] args) {
         /*3 Write a function getMax that takes an array as a parameter and returns the
        maximum value in the array.*/

        int[] numbers = {10, 100, 45, 19, 72, 55};
        int max = getMax(numbers);
        System.out.println("Max number is: " + max);
    }

    public static int getMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

}
