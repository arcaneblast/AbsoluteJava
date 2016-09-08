/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This program is the solution of the problem 12 of chapter 2 of the book
 * Absoulute Java
 *
 * @author it-el Create a program that reads a text file and transform the word
 * hate into love!
 */
public class Problem2_12
{

    /**
     * Here I am going to need a file
     */
    public static void main()
    {
        File inputFile = null;
        try
        {
            inputFile = new File("test/inputFile.txt");
            Scanner input = new Scanner(inputFile);

            while (input.hasNextLine())
            {
                String line = input.nextLine();
                System.out.println(changeHateToLove(line));
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            Logger.getLogger(Problem2_12.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method takes string as input and returns a string with the hate replaced by love
     * @param line: a string variable that may contain the word hate
     * @return returns a string with every instance of the word hate is changed to love
     */
    public static String changeHateToLove(String line)
    {
        int index = line.indexOf("hate");

        while (index >= 0)
        {
            line = line.substring(0,index) + "love" + line.substring(index+4);
            index = line.indexOf("hate");
        }
        return line;
    }
}
