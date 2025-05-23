package com.company.Assignments.Assignment1;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        /// Question 1:
        /// Write a Java program that reads a month number and prints its name.
        /*System.out.println("Enter a month number: ");
        Scanner input  = new Scanner(System.in);
        int month = input.nextInt();

        switch (month)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }*/
/// ============================================================================================
/// Question 2:
/// Write a Java program that reads a month number and prints which season
/// it belongs to (Summer, Spring, Winter, or Autumn).

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number (1-12): ");
        int month = input.nextInt();

        if (month >= 1 && month <= 12) {
            switch (month) {
                case 12, 1, 2:
                    System.out.println("Winter");
                    break;
                case 3, 4, 5:
                    System.out.println("Spring");
                    break;
                case 6, 7, 8:
                    System.out.println("Summer");
                    break;
                case 9, 10, 11:
                    System.out.println("Autumn");
                    break;
            }
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }*/

        /// ============================================================================================

        /// Question 3:
        /// In English, the letters A, E, I, O, and U (both uppercase and lowercase)
        /// are called vowels, while the other letters are known as consonants. Write a
        /// Java program that checks if an input character is a vowel or a consonant.


        //Take input from the user
       /* Scanner input = new Scanner(System.in);
        String letter;

        while (true) {
            System.out.println("Enter a letter: ");
            letter = input.next();
            //Check if valid input
            if (letter.length() != 1 || letter.matches("\\d+")) {
                System.out.println("Invalid input,you entered a number or more than one letter");
                continue;
            }
            char ch = Character.toLowerCase(letter.charAt(0));
            switch (ch) {
                case 'u', 'e', 'a', 'i', 'o':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("consonants");
            }
            break;
        }*/
        /// ============================================================================================

        /*
        Create a simple calculator program in Java that performs addition,
        subtraction, multiplication, and division. The program should prompt the
        user to enter two numbers, then ask the user to select an operation (+, -, *,
                or /). Based on the chosen operation, the program should perform and
        display the result of that calculation on the entered numbers.*/

/*        //Initialize the variables
        Scanner input = new Scanner(System.in);
        int a, b;
        String operator;

        //Take input from the user
        System.out.println("Enter the first value: ");
        a = input.nextInt();
        System.out.println("Enter the second value: ");
        b = input.nextInt();
        System.out.println("Enter the Operation symbol (+, -, / , *): ");
        operator = input.next();

        char operatorSymbol = operator.charAt(0);

        // Calculate the results
        switch (operatorSymbol) {
            case '+':
                System.out.println(a + "+" + "b" + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + "-" + "b" + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + "*" + "b" + " = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println(a + "/" + "b" + " = " + (a / b));
                }
                break;
            default:
                System.out.println("invalid operator");
        }*/

        /// ============================================================================================
        /*   Write a Java program that prompts the user to enter a number and prints
             whether the number is positive or negative.
            • Example Input: 35
            • Expected Output: "The number is positive."*/

        //Take number from the user
  /*      Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if(number > 0)
        {
            System.out.println("The number is positive. ");
        }
        else if (number < 0) {
            System.out.println("The number is negative. ");
        }
        else
        {
            System.out.println("The number is Zero");
        }*/
        /// ============================================================================================
        /*Write a Java program that calculates marks based on grades using a
            switch statement:
            • Grade A: Marks are 80 or above
            • Grade B: Marks are 60 or above but less than 80
            • Grade C: Marks are 40 or above but less than 60
            • Grade F: Marks are 40 or below
            • If an invalid grade is entered, print "Invalid grade."*/

        //Taking input from the user
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        String value = input.next();
        char mark = Character.toUpperCase(value.charAt(0));
        switch (mark)
        {
            case 'A':
                System.out.println("for Grade A: Marks are 80 or above");
                break;
            case 'B':
                System.out.println("for Grade B: Marks are 60 or above but less than 80");
                break;
            case 'C':
                System.out.println("for Grade C: Marks are 40 or above but less than 60");
                break;
            case 'F':
                System.out.println("for Grade F: Marks are 40 or below");
                break;
            default:
                System.out.println("Invalid Grade");
        }*/
        /// ============================================================================================

        /*
        Watermelon Problem
            • Input:
            The first (and only) input line contains an integer, representing the
            weight of the watermelon the boys bought.
            • Output:
            Print "YES" if the boys can split the watermelon into two parts with
            even weights; otherwise, print "NO."
            o Sample Test:
            Input: 8
            Output: YES
            § Explanation:
            For instance, the boys could split the watermelon into
            two parts of 2 and 6 kilos, or two parts of 4 and 4 kilos.

         */

        //Take input of the user
        /* Scanner input = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = input.nextInt();
        if(value % 2 == 0 && value >= 4)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }*/

        /// ============================================================================================
        /*
        Sorting Three Floating-Point Numbers
        • Write a program that reads three floating-point numbers and sorts
                them in ascending order.
        • Example Input: 2.5, 9, 4
        • Expected Output: 2.5, 4, 9
        • Use only conditional statements to implement the sorting logic.
        */

        /*
        //Input 3 Int from the user
        System.out.println("Please Enter 3 numbers");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        float min, max, mid;
        // sort them from the min to max
        if (a <= b && a <= c)
        {
            min = a;
            if (b <= c)
            {mid = b; max = c;}
            else {mid = c; max = b;}
        }
        else if (c <= a && c<= b)
        {
            min = c;
            if(a <= b)
            {mid = a; max = b;}
            else {mid = b; max = a;}
        }
        else
        {
            min = b;
            if(a <= c)
            {mid = a; max = c;}
            else {max = a; mid = c;}
        }


        System.out.println("Order of Numbers from Max is " + max + " -> " + mid + " -> " + min);
        */


        /// ============================================================================================

        /*Write a program that finds the minimum and maximum values of
        three given numbers using the conditional (ternary) operator.
        • Example Input: 3, 1, 5
        • Expected Output: Max = 5, Min = 1
           */

      /*  System.out.println("Please Enter 3 numbers");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        Float max = (a > b) ? ((a > c) ? a :c) : ((b > c) ? b :c);
        Float min = (a < b) ? ((a <c) ? a : c) : ((b < c) ? b : c);

        System.out.println("Max = " + max + ", Min = " + min);*/


        /// ============================================================================================
        //Determine the values of x, y, z, and w

        //int x = 3;
        //int y = 2;
        //int z = x++; // Assign z = 3 then increment x = 4
        //int w = ++y; // increment y = 3 then assign w =  3

        //Final result x = 4, z = 3, y = 3, w = 3

        /// ============================================================================================
    /*    Write a program to calculate the sum of positive integers and the sum of
            negative integers for 6 integers.
            • Example Input: 21, -4, 14, -3
            • Expected Output:
            Sum of positive integers: 35
            Sum of negative integers: -7*/

        /*Scanner input = new Scanner(System.in);
        int value, positiveSum = 0, negativeSum = 0;
        for(int i = 0; i < 6; i++)
        {
            System.out.println("Please Enter the value number "+ (i+1));
            value = input.nextInt();
            if(value > 0)
            {
                positiveSum += value;
            }
            else if (value < 0)
            {
                negativeSum += value;
            }
        }
        System.out.println("Sum of positive integers: " + positiveSum + "\nSum of negative integers: " + negativeSum);*/


        /// ============================================================================================
        /*Take three numbers from the user and print the largest one.

        • Example Input:
            o 1st Number: 25
            o 2nd Number: 78
            o 3rd Number: 87
        • Expected Output: "The greatest number is: 87"*/
/*
        Scanner input = new Scanner(System.in);
        System.out.println("1st Number: ");
        int a = input.nextInt();
        System.out.println("2nd Number: ");
        int b = input.nextInt();
        System.out.println("3rd Number: ");
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println("The greatest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The greatest number is: " + b);
        } else if (c >= a && c >= b) {
            System.out.println("The greatest number is: " + c);
        }*/

        /// ============================================================================================

        /*Write a Java program to print the area of a circle.

        • Test Data: Radius = 7.5
        • Expected Output: "Area = 176.71458676442586"*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius; // Area = π * r²
        System.out.println("Area = " + area);*/

        /// ============================================================================================


    }
}




