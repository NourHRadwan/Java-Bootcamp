package com.company.Assignments.Assignment2;

public class Q1 {

    public static void main(String[] args) {
        /*1.Write a function getSummation that takes an array as a parameter and returns
        the sum of all its elements.*/
        double[] numbers = {3, 5.5, 12, 9.2};
        double result = getSummation(numbers);
        System.out.println("Sum of array elements: " + result);
    }

    public static double getSummation(double arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double element : arr) {
            sum += element;
        }
        return sum;
    }

}
