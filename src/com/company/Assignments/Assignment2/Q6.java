package com.company.Assignments.Assignment2;

public class Q6 {
    public static void main(String[] args) {
         /*6 Write a function count2 that takes an array as a parameter and counts
        the occurrences of the number 2 in the array.*/
        int[] numbers = {2, 1, 2, 3, 2, 4, 2, 5, 6, 7, 2};
        int count = count2(numbers);
        System.out.println("the occurrences of the number 2 in the array: " + count);

    }

    public static int count2(int[] arr) {
        if (arr == null) {
            return 0;
        }
        int count = 0;
        for (int number : arr) {
            if (number == 2) {
                count++;
            }
        }
        return count;
    }

}
