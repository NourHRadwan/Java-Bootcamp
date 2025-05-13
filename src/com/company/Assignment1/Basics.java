package com.company.Assignment1;

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
        /*switch(month){
        case 12:
        case 1:
        case 2:
        System.out.println("Winter");
        break;
        case 3:
        case 4:
        case 5:
        System.out.println("Spring");
        break;
        case 6:
        case 7:
        case 8:
        System.out.println("Summer");
        break;
        case 9:
        case 10:
        case 11:
        System.out.println("Autumn");
        break;
        }*/
        /// ============================================================================================

        /// Question 3:
        /// In English, the letters A, E, I, O, and U (both uppercase and lowercase)
        /// are called vowels, while the other letters are known as consonants. Write a
        /// Java program that checks if an input character is a vowel or a consonant.


        //Take input from the user
        /*Scanner input = new Scanner(System.in);
        String letter;

        while (true){
            System.out.println("Enter a letter: ");
            letter = input.next();
            //Check if valid input
            if(letter.length() != 1 || letter.matches("\\d+") )
            {
                System.out.println("Invalid input,you entered a number or more than one letter");
                continue;
            }
            char ch = Character.toLowerCase(letter.charAt(0));
            switch (ch)
            {
                    case 'a':
                    case 'i':
                    case 'o':
                    case 'e':
                    case 'u':
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

        //Initialize the variables
        /*Scanner input = new Scanner(System.in);
        int a, b;
        String operator;

        //Take input from the user
        System.out.println("Enter the first value: ");
        a = input.nextInt();
        System.out.println("Enter the first value: ");
        b = input.nextInt();
        System.out.println("Enter the Operation symbol (+, -, / , *): ");
        operator = input.next();

        char operatorSymbol = operator.charAt(0);

        // Calculate the results
            switch (operatorSymbol)
            {
                case '+':
                    System.out.println(a + "+" + "b" + " = " + (a+b));
                    break;
                case '-':
                    System.out.println(a + "-" + "b" + " = " + (a-b));
                    break;
                case '*':
                    System.out.println(a + "*" + "b" + " = " + (a*b));
                    break;
                case '/':
                    System.out.println(a + "/" + "b" + " = " + (a/b));
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
        if(value % 2 == 0 && value > 4)
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





        /// ============================================================================================


    }

}



