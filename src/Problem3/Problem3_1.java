/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This code is the solution of problem3_1 of the book AbsoluteJava.
 * @author it-elias
 * 
 * The babylonian algorithm to compute the square root of a positive number n is as follows:
 * 1. Make a guess at the answer (you can pick n/2 as your initial guess)
 * 2. Compute r = n/guess
 * 3. Set guess = (guess + r) /2
 * 4. Go back to step 2 until the last two guess values are within 1% of each other.
 * Write a program than inputs a double for n, iterates through the Babylonian algorithm until the guess is withn 1% of the previous guess an outputs the answer as a double to two decimal places.
 * 
 */
public class Problem3_1
{

    /**
     * The main function
     * This program takes as input a double n and stops when the difference in guess is smaller than 1%
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("Please enter the value of n");
        double n = input.nextDouble();
        double guess = (Math.random() * n);
        double r = n / guess;
        
        while(Math.abs(((guess + r) / 2) - guess) > 0.01)
        {
            guess = (guess + r) /2;
            r = n / guess;
        }
        
        System.out.println("The value was found and it is " + df.format(guess));
    }
}
