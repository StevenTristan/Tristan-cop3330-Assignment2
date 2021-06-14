/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Steven Tristan
 */

package oop.assignment2.ex32.base;

import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args)
    {
        guessTheNumber();
    }

    public static void guessTheNumber()
    {
        System.out.println("Let's play Guess the Number.");

        Scanner s = new Scanner(System.in);
        String input;
        int guess = -1, count = 0, difficulty = -1, answer = 0;

        while (difficulty < 0)
        {
            System.out.println("Pick a difficulty level (1, 2, or 3): ");
            input = s.next();
            for (int i = 0; i < input.length(); i++)
            {
                if (Character.isLetter(input.charAt(i))){
                    System.out.println("Sorry. That's not a valid input.");
                    break;
                }
                else if (Integer.parseInt(input) < 0 && Integer.parseInt(input) > 4)
                {
                    System.out.println("Sorry. That's not a valid input.");
                    break;

                }
                else if (Integer.parseInt(input) > 0 && Integer.parseInt(input) < 4)
                {
                    difficulty = Integer.parseInt(input);
                    break;
                }
            }
        }

        Random r = new Random();
        if (difficulty == 1)
            answer = r.nextInt(10) + 1;
        if (difficulty == 2)
            answer = r.nextInt(100) + 1;
        if (difficulty == 3)
            answer = r.nextInt(1000) + 1;

        System.out.println("I have my number. What's your guess?");
        while (true)
        {
            input = s.next();
            for (int i = 0; i < input.length(); i++)
            {
                if (Character.isLetter(input.charAt(i))){
                    System.out.println("Sorry. That's not a valid input.");
                    count++;
                    break;
                }
                else if (Integer.parseInt(input) > answer)
                {
                    System.out.println("Too High");
                    count++;
                    break;
                }
                else if (Integer.parseInt(input) < answer)
                {
                    System.out.println("Too low");
                    count++;
                    break;
                }
                else if (Integer.parseInt(input) == answer)
                {
                    System.out.println("You got it in " + ++count + " guesses!");
                    System.out.println("Play Again?");
                    input = s.next();
                    if (input.charAt(0) == 'n')
                    {
                        System.out.println("Goodbye!");
                        return;
                    }
                    else
                        guessTheNumber();
                    return;
                }
                System.out.println("Guess again:");
            }
        }
    }
}
