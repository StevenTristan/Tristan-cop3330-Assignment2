/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Steven Tristan
 */


package oop.assignment2.ex28.base;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args)
    {
        countingNumbers();
    }

    public static void countingNumbers()
    {
        Scanner input = new Scanner(System.in);
        int ans;
        int sum = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            ans = input.nextInt();
            sum += ans;
        }
        System.out.println(sum);
    }
}
