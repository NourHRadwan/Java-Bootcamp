package com.company.week1;

import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        //Class to sort three numbers
        //Input 3 Int from the user
        System.out.println("Please Enter 3 numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int min, max, mid;
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


    }
}
