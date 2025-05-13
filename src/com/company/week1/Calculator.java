package com.company.week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /// Simple Calculator
        /// Takes N1(double), N2(double), Operator(string)
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 2 numbers: ");
        double N1 = input.nextDouble();
        double N2 = input.nextDouble();
        System.out.println("Please Enter operator(+,-,/,*)");
        String Operator = input.next();
        if(Operator.equals("+"))
        {
            System.out.println(N1 + N2);
        } else if (Operator.equals("-")) {
            System.out.println(N1 - N2);
        } else if (Operator.equals("*")) {
            System.out.println(N1 * N2);
        } else if (Operator.equals("/")) {
            System.out.println(N1 / N2);
        } else
        {
            System.out.println("Invalid Operator");
        }
    }
}
