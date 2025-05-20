package com.company.week2;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //Declaring Array
        //1.
            int [] arr =  new int[10]; //0 -> 9
        //2.
            var a = new int[100];
            //Array length is constant
            //if you frequently need to expand the length of array while program is running, use array list.

        //Define array
        // 1. int [] a;
        // 2. int a [];

        //Anonymouse array
        int [] smallprimes = {2,3,4,5};
        smallprimes = new int[] {17, 19, 20};

        //Array of length 0 not same as null

        //When creating an array of numbers ==> all elements are initialized with zero
        // Array of boolean are initialized with false
        // Array of object are initialized with null

        //========================
        //Method
        // to find length of array use array.length
        //================

        //The for each Loop
        //used for indexed objects
        //for(variable : collection) statement
        //The collection expression must be an object of class that implement Iterable interface
        for(int element : smallprimes)
            System.out.println(element);

        //The easet way to print all the array

        //a[1] = 1;
        //System.out.println(Arrays.toString(a));

        //Copy Arrays
        int [] arr1 = {5,2,2,5,2,2};

        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        for(int element : arr2) {
            System.out.print(element);
        }

        //import java.util.Arrays;
        //1. Static String toString(T[] a)
        //Return a string with the elements of a, T can be any type

        //2. Static T[] copyOf(T[], int end)
        //3. static T[] copyOfRange(T[] a, int start, int end)
        // return array of the same type as a, of a length of either end or end - start
        //filled of the values of a

        //static void sort(T[] a)
        // sort the array using a tuned QuickSort algorithm


        // static void fill(T[] a, T v)
        //sets all the elemetns of the array to v


        //static boolean equals(T[] a, T[] b)
        //return True if the array have the same length and if the elements at a corresponding indexes matches
    }
}
