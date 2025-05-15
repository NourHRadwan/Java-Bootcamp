package com.company.Assignment1;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

/*
        Q1:
        Write a Java program that prints all numbers between 1 and 99 that are divisible by 5.
*/
       /* for (int i = 1; i <= 99; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }*/

        //================================================================================================

        /*Q2:
        Write a Java program that prints the numbers from 1 to 100 in ascending
        order.*/
        /*for(int i = 100; i >= 1; i--)
        {
            System.out.print(i +" ");
        }*/

        //================================================================================================

/*        Q3:
        Modify the previous program to print the numbers from 100 down to 1 in

        descending order.*/

        /*for(int i = 1; i <= 100; i++)
        {
            System.out.print(i +" ");
        }*/

        //================================================================================================
        /*Q4
        Take two number from the user , base and power.

        The output: Base ^ power*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the base: ");
        double Base = input.nextDouble();
        System.out.println("Enter the power: ");
        int power = input.nextInt();

        int result = 1;
        for(int i = 1; i <= power; i++)
        {
            result *= Base;
        }
        System.out.println(result);*/

        //================================================================================================
/*
        Q5:
        Write a Java program that takes an integer from the user and calculates
        its factorial.*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int result = 1;


        if(number > 0) {

            for (int i = number; i > 0; i--) {
                result *= i;
            }
        }
        else
        {
            System.out.println("Factorial is not defined to negative values");
        }

        System.out.println(result);
        */
        //================================================================================================
        /*Q6:
        Write a Java program to display the following sequence of numbers:

        7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98.
        */

        /*for(int i = 1; i <= 14; i++)
        {
            System.out.print(7*i + ", ");
        }*/

        //================================================================================================
        /*Q7:
        Write a Java program to display the following sequence:
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512.
*/
/*
        int length  = 10;
        int result = 1;

        for(int i = 1; i <= length; i++)
        {
            System.out.println(result);
            result *= 2;
        }
*/

        //================================================================================================
        //================================================================================================
    }
}
