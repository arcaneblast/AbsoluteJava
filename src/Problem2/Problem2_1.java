/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.Scanner;

/**
 * This code is the solution of the problem2_1 from the book absolute java
 * @author it-elias
 * 
 * Problem:
 * The Babylonian algorithm to compute the square root of a positive number n is as follows:
 * 1. Make a guess at the number (you can pick n/2 as your initial guess).
 * 2. Compute r =n / guess
 * 3. Set guess = (guess +r)/2
 * 4. Go back to step 2 for as many iteration as necessary. The more yuor epeat steps 2 and 3, the coser guess will become to the square root of n.
 * Write a program inputs a double for n, iterates through the Babylonian algorithm five times, and outputs the answer as a double to two decimal places. Your answer will be most accurate for small values of n.
 */
public class Problem2_1
{

    /**
     * THis method is the implementation of the problem mentioned above.
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number n followed by the number of interations");
        int n = input.nextInt();
        int iterations = input.nextInt();
        
        int guess = (int)(Math.random() * n);
        int r = n / guess;
        int i = 0;
        for(i =0; i< iterations; i++)
        {
            guess = (guess + r) /2;
            r = n / guess;
        }
        
        System.out.println("The square root of " + n + " is " + guess);
        
    }
}
