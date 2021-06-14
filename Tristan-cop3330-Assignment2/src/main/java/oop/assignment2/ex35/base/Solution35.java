/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Steven Tristan
 */

package oop.assignment2.ex35.base;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args)
    {
        printNames();
    }

    public static void printNames()
    {
        Scanner s = new Scanner(System.in);
        String input = " ";
        boolean sent = true;

        ArrayList<String> contest = new ArrayList<>();

        while (sent)
        {
            System.out.println("Enter a name: ");
            input = s.nextLine();
            if (input.equals(""))
                sent = false;
            else
                contest.add(input);
        }

        Random r = new Random();

        System.out.println("The winner is... " + contest.get(r.nextInt(contest.size())) + ".");
    }
}
