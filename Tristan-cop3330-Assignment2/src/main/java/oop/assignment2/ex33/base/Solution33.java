/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Steven Tristan
 */

package oop.assignment2.ex33.base;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args)
    {
        guessThePhrase();
    }

    public static void guessThePhrase()
    {
        System.out.println("What's your question?");

        Scanner s = new Scanner(System.in);
        String input;
        input = s.nextLine();

        ArrayList<String> response = new ArrayList<>();

        response.add("Yes");
        response.add("No");
        response.add("Maybe");
        response.add("Ask again later");

        Random r = new Random();

        System.out.println(response.get(r.nextInt(91)%4));
    }
}
