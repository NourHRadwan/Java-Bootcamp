package com.company.Assignments.Assignment1;

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

        /*Q8:
        Write an application that calculates the product of the odd integers from 1 to 15.
*/

       /* int result = 1;
        for(int i = 1; i <= 15; i++)
        {
            if(i % 2 != 0)
            {
                result *= i;
            }
        }

        System.out.println(result);*/

        //================================================================================================

/*        Q9:
        Write a Java program that continuously reads positive numbers from the
        user until a negative number is entered. The program should then
        calculate and print the average of all positive numbers entered.
*/

/*
        Scanner input = new Scanner(System.in);
        int number, result = 0;

        while (true) {
            System.out.println("Enter a positive value: ");
            number = input.nextInt();
            if (number > 0) {
                result += number;
            } else {
                break;
            }
        }
        System.out.println(result);
*/

        //================================================================================================

        /*Q10:
        Write a Java program that prompts the user to enter an integer, then
        calculates and prints the sum of its digits.
        • Example: If the user enters 123, the output should be 6,
                because 1 + 2 + 3 = 6.*/


        //================================================================================================
        /*Q11: Write a Java program that prompts the user to enter an integer, then prints the
        number of digits in that integer.*/


        //================================================================================================

        /*Q 12: Given an integer, write a program to determine how many times it can be divided
        by 2 before it becomes less than 1. */


        //================================================================================================

        /* Q13: Write a Java program that displays all numbers from 100 to 200, with
        ten numbers per line, that are divisible by either 5 or 6, but not both.*/


        //================================================================================================

    }
}
