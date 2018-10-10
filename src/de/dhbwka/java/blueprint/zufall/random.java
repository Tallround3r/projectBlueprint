package de.dhbwka.java.blueprint.zufall;

import java.util.Random;

public class random
{

    static Random randomNumber;
    static String[] test = new String[3];
    static String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", //
        "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static void main(String[] args)
    {
        randomNumber = new Random();

        for (int i = 0; i < 10; i++)
        {
            System.out.println(letters[randomNumber.nextInt(26)]);
        }
    }
}
