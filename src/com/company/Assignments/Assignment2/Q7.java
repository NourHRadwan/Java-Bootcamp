package com.company.Assignments.Assignment2;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        /*Modify the above function to create countGeneral, which takes an array
        as a parameter and counts the occurrences of each unique number in the
        array. Print each number and its occurrence count in the format shown
        below.
                Example:
        • Input: [1, 2, 3, 1, 3, 6]
        • Output:
        1 -> 2
        2 -> 1
        3 -> 2
        6 -> 1*/

        int[] numbers = {1, 2, 3, 1, 3, 6};
        countGeneral(numbers);

    }

    public static void countGeneral(int[] arr) {

        if (arr == null) {
            return;
        }

        Arrays.sort(arr);

        int current = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current) {
                count++;
            } else {
                System.out.println(current + " -> " + count);
                current = arr[i];
                count = 1;
            }
        }
        System.out.println(current + " -> " + count);
    }


}



