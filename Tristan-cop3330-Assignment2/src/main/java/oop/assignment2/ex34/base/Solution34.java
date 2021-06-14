/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Steven Tristan
 */

package oop.assignment2.ex34.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args)
    {
        printNames();
    }

    public static void printNames()
    {
        Scanner s = new Scanner(System.in);
        String input;

        ArrayList<String> employees = new ArrayList<>();

        System.out.println("\nThere are " + employees.size() +" employees:");
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        for (int i = 0; i < employees.size(); i++)
            System.out.println(employees.get(i));
        System.out.println("");

        System.out.println("Enter an employee name to remove: ");

        input = s.nextLine();

        if (!employees.contains(input))
            System.out.println("That name was not found");
        else
            employees.remove(input);

        System.out.println("\nThere are " + employees.size() +" employees:");
        for (int i = 0; i < employees.size(); i++)
            System.out.println(employees.get(i));
    }
}
