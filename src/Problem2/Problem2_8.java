/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.Scanner;

/**
 * This code is the solution of problem 8 of the book Absolute Java chapter 2
 * @author it-elias
 * Problem:
 * 
 * Write a program that reads a line of text and then outputs that line of text first in all uppercase letters and then in all lowercase letters.
 * 
 */
public class Problem2_8
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a line");
        String line = input.nextLine();
        
        if(line.length() == 0)
            System.exit(1);
        
        System.out.println("Upper " + line.toUpperCase());
        System.out.println("Lower " + line.toLowerCase());
    }
}
