/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 * This code is the solution of problem 5 of chapter 1 of the book Aboslute JAVA
 *
 * @author it-elias
 *
 * Write a program that starts with a line of text and then outputs that line of
 * text with the first occurrence of "hate" changed to "love". For example, a
 * possible sample output ight be
 *
 * The line of text to be changed is: I hate you. I have rephrased that line to
 * read: I love you.
 *
 * You can assume that word "hate" occurs in input. If the word "hate" occurs
 * more than once in the line, your program will replace only the first
 * occurence of "hate".
 */
public class Problem1_5
{

    /**
     * This method is the implementation of the problem above
     */
    public static void main()
    {
        Scanner myInput = new Scanner(System.in);
        String text = null;
        int index;
        
        System.out.println("Please enter the whole text you want and write exit to terminate");
        while (myInput.hasNextLine())
        {
            text = myInput.nextLine();
            
            if (text.indexOf("exit") == 0)
                break;
            
            if ( (index = text.indexOf("hate ")) >=0)  //this way it will not take hate at the end of the line
            {
                System.out.println(text.substring(0, index) + "love " + text.substring(index+5));
            }
            else
                System.out.println("No hate in this world!");
        }
    }

}
