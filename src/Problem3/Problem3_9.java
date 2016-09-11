/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This code is the solution of problem3_9 of the book Absolute Java
 * 
 * @author it-el
 * Write a program that caclulates the total grade for N classromm exercises as a percentage. Use the DecimalFormat
 * class to ouptu the value as a percent. The user should input the value for N forllowed by each of the N scores and totals. Caclulate
 * the overtall percentage and output it using the Decimal format
 */
public class Problem3_9
{

    /**
     * This program takes the number of exercises first and then iterates
     * for each exercise we take two things
     * 1. the mark and the highest mark possible.
     * 
     * The decimal formatter would automaticaly convert to a percent value.
     */
    public static void main()
    {
        DecimalFormat df = new DecimalFormat("#.##%");
        Scanner input = new Scanner(System.in);
        int markTotal = 0, perfectTotal = 0;
        int n;
        System.out.println("How many exercises to input?");
        n = input.nextInt();
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Score received for exercise " + i+1);
            markTotal += input.nextInt();
            
            System.out.println("Total points possible for exercise "+ i+1);
            perfectTotal += input.nextInt();
        }
        
        double percent = (1.0 * markTotal) / perfectTotal;
        System.out.printf("Your total is %d out of %d or %s", markTotal, perfectTotal, df.format(percent));
    }
    
}
