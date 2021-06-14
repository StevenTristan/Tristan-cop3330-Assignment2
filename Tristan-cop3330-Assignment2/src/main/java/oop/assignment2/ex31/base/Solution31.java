/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Steven Tristan
 */

package oop.assignment2.ex31.base;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args)
    {
        heartRateCalc();
    }

    private static void heartRateFunction(int age, int resting)
    {
        int intensity;
        double target;
        System.out.println("Resting pulse: " + resting + "\tAge: " + age);
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        for (intensity = 55; intensity < 96; intensity+=5)
        {
            target = (((220 - age) - resting) * (intensity * .01) + resting);
            System.out.println(intensity + "%          | " + Math.round(target) + " bpm");
        }
    }

    public static void heartRateCalc()
    {
        Scanner s = new Scanner(System.in);
        String input;
        int age = -1, resting = -1, intensity, target;

        while (age < 0)
        {
            System.out.println("What is your age?");
            input = s.next();
            for (int i = 0; i < input.length(); i++)
            {
                if (Character.isLetter(input.charAt(i))){
                    System.out.println("Sorry. That's not a valid input.");
                    break;
                }
                else if (Integer.parseInt(input) >= 0)
                {
                    age = Integer.parseInt(input);
                    break;
                }
            }
        }

        while (resting < 0)
        {
            System.out.println("What is your resting heart rate?");
            input = s.next();
            for (int i = 0; i < input.length(); i++)
            {
                if (Character.isLetter(input.charAt(i))){
                    System.out.println("Sorry. That's not a valid input.");
                    break;
                }
                else if (Integer.parseInt(input) >= 0)
                {
                    resting = Integer.parseInt(input);
                    break;
                }
            }
        }
        heartRateFunction(age, resting);
    }
}
