package com.company.Assignments.Assignment2;

public class Q2 {
    public static void main(String[] args) {
        /*2 Write a function getNumOfElements that takes an array as a parameter
        and returns the total number of elements in the array.*/

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int count = getNumOfElements(numbers);
        System.out.println("Elements in the array are: " + count);

    }

    public static int getNumOfElements(int arr[]) {
        if (arr == null) {
            return 0;
        }
        //option 1:
        //return arr.length;

        //option 2: manually
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }
}
