/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This code is the solution of problem3_14 of the book AbsoluteJava
 * @author it-elias
 * The file words.txt on the book website. Wrtie a program that reads through this file and finds the word that has the most consecutive vowels. For example, the word 
 * bedouin has three consecutive vowels.
 */
public class Problem3_14
{
    public static void main()
    {
        try
        {
            System.setIn(new FileInputStream("test/inputFile.txt"));
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Problem3_13.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner input = new Scanner(System.in);
        
        String word = input.hasNext()? input.next() : null;
        while(input.hasNext())
        {
            
            String temp = input.next();
            if(numberOfConsecutiveVowels(word) < numberOfConsecutiveVowels(temp))
                word = temp;
        }
        
        System.out.println(word);
    }
    
    private static int numberOfConsecutiveVowels(String s)
    {
        if(s == null || s.length() ==0)
            System.exit(0);
        
        int max = Integer.MIN_VALUE;
        int counter = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(isVowel(s.charAt(i)))
                counter++;
            else
            {
                if(counter > max)
                    max = counter;
                counter = 0;
            }
        }
        if(counter > max)
            max = counter;
        return max;
    }
    
    private static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);
        return ( c == 'a' || c == 'e' || c=='o' || c=='i' || c =='u');
    }
}

