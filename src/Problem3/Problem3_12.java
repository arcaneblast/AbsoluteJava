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
 * This code is the solution of problem 12 of the book Absolute Java.
 * @author it-el
 * 
 * This probelm is like Problem2_13 but instead of inputing names by hand. it takes input from a file.
 */
public class Problem3_12
{
    public static void main()
    {
        try
        {
            System.setIn( new FileInputStream("test/inputFile.txt"));
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Problem3_12.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner input = new Scanner(System.in);
        
        //the file format will be names first and last on the same line
        //because I have coded pigLatin like a million times I will just read and write names as is
        
        while(input.hasNextLine())
        {
            String first = input.next();
            String last = input.next();
            //clear
            if(input.hasNextLine()) //Becaues the final line might not have enter.
                input.nextLine();
            
            System.out.println(first + " "+ last);
        }
    }
}
