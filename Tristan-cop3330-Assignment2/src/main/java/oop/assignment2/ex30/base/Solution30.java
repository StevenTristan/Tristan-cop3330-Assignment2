/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Steven Tristan
 */


package oop.assignment2.ex30.base;

public class Solution30 {
    public static void main(String[] args)
    {
        printTable();
    }

    public static void printTable()
    {
        for (int i = 1; i <= 12; i++)
        {
            if (i < 10)
                System.out.print(" ");
            System.out.print(i);
            for (int j = 2; j <= 12; j++)
            {
                if (j > 99)
                    System.out.print("  ");
                else if (j > 9)
                    System.out.print("   ");
                else
                    System.out.print("    ");
                System.out.print(j*i);
            }
            System.out.println("");
        }
    }
}
