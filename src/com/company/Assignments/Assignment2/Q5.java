package com.company.Assignments.Assignment2;

public class Q5 {
    public static void main(String[] args) {
        /*5 Write a function calculateEven that takes an array as a parameter and
        calculates the sum of all even numbers, as well as the count of even
        numbers in the array.*/

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = calculateEven(numbers); // result[0] will be the sum, result[1] will be the count

        if (result != null) {
            System.out.println("Sum of even numbers: " + result[0]);
            System.out.println("Count of even numbers: " + result[1]);
        } else {
            System.out.println("Input array was null.");
        }

    }

    public static int[] calculateEven(int[] arr) {
        if (arr == null) {
            return null;
        }
        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }

        return new int[]{sum, count};//anonyms array
    }

}
