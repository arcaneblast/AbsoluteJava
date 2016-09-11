/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This code is the solution for problem 13 of chapter 2 of the book Absolute
 * Java
 *
 * @author it-el
 *
 * A Simple rule to estimate your ideal body weight is to allow 110 pounds for
 * the first 5 feet of height and 5 pounds for each additional inch. Create the
 * following text in a text file. It contains the names and heights in feet and
 * inches of Tom Atto 6'3'' and Eaton Wright 5'5'' and cary Oki 5'11''
 *
 */
public class Problem2_13
{

    /**
     * Implementation of the problem above It takes its input from a file in the
     * format of name feet inches
     */
    public static void main()
    {
        try
        {
            Scanner input = new Scanner(new File("test/inputFile2_13.txt"));

            while (input.hasNextLine())
            {
                String name = input.nextLine();
                int feet = input.nextInt();
                int inches = input.nextInt();

                //clear input
                input.nextLine();

                //get the name and ideal weight
                System.out.println("The ideal weight of " + name + " is " + idealWeight(feet, inches));
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            Logger.getLogger(Problem2_13.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int idealWeight(int feet, int inches)
    {
        if(feet <5)
            System.exit(-1);
        
        inches += (feet -5 ) * 12;
        
        return 110 + 5 * inches;
    }
}
