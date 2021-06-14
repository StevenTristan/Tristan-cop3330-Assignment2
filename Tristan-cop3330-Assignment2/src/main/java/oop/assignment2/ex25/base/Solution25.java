package oop.assignment2.ex25.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution25
{
    public static void main(String[] args)
    {
        passwordValidatorTester();
    }

    public static void passwordValidatorAnswer(int strength, String pw)
    {
        String ans;

        switch (strength)
        {
            case 2:
                ans = "weak";
                break;

            case 3:
                ans = "strong";
                break;

            case 4:
                ans = "very strong";
                break;

            default: ans = "very weak";
        }

        System.out.println("The password '" + pw + "' is a " + ans + " password");
    }

    public static void passwordValidatorTester()
    {
        int strength = 0;

        ArrayList<String> dictionary = new ArrayList<String>();

        for (int n =0; n < 5; n++)
        {
            System.out.println("Enter 5 passwords: ");
            Scanner pass = new Scanner(System.in);
            String s = pass.nextLine();
            dictionary.add(s);
        }

        for (String s : dictionary)
        {
            strength = passwordValidator(s);
            passwordValidatorAnswer(strength, s);
        }
    }

    private static int passwordValidator(String pw)
    {
        int numbers = 0;
        int letters = 0;
        int symbols = 0;

        for (int i = 0; i < pw.length(); i++)
        {
            if (Character.isLetter(pw.charAt(i)))
            {
                letters++;
                continue;
            }
            if (!Character.isLetter(pw.charAt(i)) && !Character.isDigit(pw.charAt(i)))
            {
                symbols++;
                continue;
            }
            if (Character.isDigit(pw.charAt(i)))
                numbers++;
        }

        if (numbers > 0 && letters > 0 && symbols > 0 && pw.length() > 7)
            return 4;
        else if (numbers > 0 && letters > 0 && pw.length() > 7)
            return 3;
        else if (letters > 0 && pw.length() < 8)
            return 2;
        else if (numbers > 0 && pw.length() < 8)
            return 1;

        return 0;
    }
}