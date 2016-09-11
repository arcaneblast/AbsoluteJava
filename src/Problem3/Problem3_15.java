/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This code is the solution for problem3_15 of the book absolute Java
 * @author it-el
 * 
 * This problem is based on a "Nify assighnment" by steve Wolfman. Consider lists of numbers
 * for real-life data sources- for example, a list containing the number of students enrolled in different
 * course sections, the number of comments posted for different faacebook status updates,
 * the number of books in different library holding, the number of votes per
 * precint, It might seem like the leading digit of each number in the list could be 1-9 with an equally likely porbability.
 * However, Benford's Law states that the leading digit is 1 about 30% of the time and drops with larger digits. The leading digit is 9 only about 5% of the time.
 * 
 * Write a program that tests Benfords lae. Collect a list of at least 100 numbers
 * from some real-life data source and enter them into a text file. Your program
 * should loop through the list of numbers and count how many times 1 is the first digit,
 * 2 is the first and etc, for each digit, output the percentage it appears as the first digit.
 */
public class Problem3_15
{

    /**
     * This program will read until hasNextInt() return false;
     * 
     */
    public static void main()
    {
        try
        {
            System.setIn(new FileInputStream("test/inputFile.txt"));
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Problem3_15.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner input = new Scanner(System.in);
        int[] digits = new int[9];
        int count = 0;
        while(input.hasNextInt())
        {
            count++;
            int temp = input.nextInt();
            digits[firstDigit(temp)-1]++;
        }
        
        DecimalFormat df = new DecimalFormat("##.##%");
        
        for(int i=0; i<9; i++)
        {
            System.out.println("The probability of "+ (i+1) + " "+ df.format(digits[i]*1.0/count));
        }
    }
    
    private static int firstDigit(int n)
    {
        int firstDigit = n;
        while(n != 0)
        {
            firstDigit = n;
            n/=10;
        }
        return firstDigit;
    }
}
