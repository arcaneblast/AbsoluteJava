package Problem2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This code is the solution for problem2_2 from the book Absolute java
 * @author it-elias
 * 
 * Problem:
 * (This is a version with input of an exercise from Chapter 1.) WRite a program that inputs two string variables, first and last, which the user should enter with his or her name. First, convert both string to all lower case.
 * Your program should then create a new string that contains the full name in pig latin with the first letter capitialized
 * Use it to output the name used in input into a piglatin name
 */
public class Problem2_2
{

    /**
     * Implementation of the problem above.
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        String first= null, last = null;
        
        System.out.println("Please enter your first name followed by your last name on the same line");
        first = input.next();
        last = input.next();
        //just to remove the enter
        input.nextLine();
        
        //first requirement
        first = first.toLowerCase();
        last = last.toLowerCase();
        
        System.out.println(nameToPigLatin(first,last));
    }
    
    /**
     * this method uses the toPigLatin method to transform a name
     * @param first string the first name
     * @param last string the last name
     * @return the full name in piglatin
     */
    public static String nameToPigLatin(String first, String last)
    {
        return toPigLatin(first) + toPigLatin(last);
    }
    
    private static String toPigLatin(String someString)
    {
        char first = someString.charAt(0);
        char second = someString.charAt(1);
        second = Character.toUpperCase(second);
        
        return " "+ second + someString.substring(2) + first + "ay";
    }
}
