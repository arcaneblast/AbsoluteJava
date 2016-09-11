/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 * This class was created in accordance with the problem number 3 of chapter 1 of the book absolute java.
 * @author it-elias
 * 
 * Write a program that starts with the string variable first set to your first name and the string variable last set to your last name.
 * Both names should be all lowercase.
 * Your program should then create a new string that contains your full name in pig latin with the first letter capitalized for the first and last name.
 * Use only the pig latin rule of moving the first letter to the end of the world and adding "ay".
 * Output the pig latin name to the screen. Use the sbstring and toUpperCase methods to construct the name.
 * For example:
 * first = "wlat";
 * last = "savitch";
 * 
 * the program should create a new string with the text Altway Avitchsay" and print it.
 * Basically the pig latin method takes the first character of your name and put it in the end with the ay string.
 */
public class Problem1_3 {
    
    /**
     * basically this method would prompt the user to enter his first name and last name
     * after that it will print the pig latin name method.
     */
    public static void main()
    {
        //create the scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your first and last name on the same line with space in between");
        System.out.print("Please note that failure to do so would cause the program to terminate");
        
        String first = null, last = null;
        first = input.next();
        last = input.next();
        
        input.nextLine(); //to remove enter useless here
        
        System.out.println("Your name in PigLatin " + transformNameToPigLatin(first, last));
    }
    
    /**
     * this method takes the two parts first and last name and returns the piglatin name
     * @param first the first name string
     * @param last the last name string
     * @return a string with the whole name as pig latin
     */
    public static String transformNameToPigLatin(String first, String last)
    {
        //checking proper length
        if(first.length() == 0 || last.length() == 0)
        {
            System.out.println("Input ERROR");
            System.exit(0);
        }
        
        return toPigLatin(first) + " " + toPigLatin(last);
    }
    
    // This method takes whatever string and returns the piglatin (support method)
    private static String toPigLatin(String word)
    {
        char firstChar = word.charAt(0);
        char secondChar = word.charAt(1);
        
        return Character.toUpperCase(secondChar) + word.substring(2) + firstChar + "ay";
    }
}
