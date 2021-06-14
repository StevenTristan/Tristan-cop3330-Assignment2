/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Steven Tristan
 */


package oop.assignment2.ex29.base;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args)
    {
        rule72();
    }

    public static void rule72math(Integer rate)
    {
        float year = 72 / rate;
        System.out.println("It will take " + year + " years to double your initial investment.");
    }

    public static void rule72()
    {
        Scanner s = new Scanner(System.in);
        String rate = "0";

        while (true)
        {
            System.out.println("What is the rate of return?");
            rate = s.next();
            for (int i = 0; i < rate.length(); i++)
            {
                if (Character.isLetter(rate.charAt(i))){
                    System.out.println("Sorry. That's not a valid input.");
                    break;
                }
                else if (Integer.parseInt(rate) == 0)
                {
                    System.out.println("Can't divide by zero");
                }
                else if (Integer.parseInt(rate) > 0)
                {
                    rule72math(Integer.parseInt(rate));
                    return;
                }
            }
        }
    }
}
