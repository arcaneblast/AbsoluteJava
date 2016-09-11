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
 * This code is the solution of problem3_13 of the book AbsoluteJava
 * @author it-elias
 * 
 * The file words.txt on the book's website contains 87,314 words from the English language. Write a program that
 * reads throguh this file and finds the longest word that is palindrome.
 * Since I dont have internet Acess I will write the program annd test it manually.
 */
public class Problem3_13
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
            if(temp.length() > word.length() && isPalindrom(temp))
                word = temp;
        }
        
        System.out.println(word);
    }
    
    private static boolean isPalindrom(String s)
    {
        for(int i=0; i<s.length()/2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}
