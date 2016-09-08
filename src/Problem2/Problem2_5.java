/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.Scanner;

/**
 * This code is the solution of problem2_5 of the book AbsoluteJava
 * @author it-el
 * Problem: 
 * The string-line method for cimputing the yearly depreciation if value of D for an item is given by the following forumula:
 * 
 * D = (P-S)/Y;
 * 
 * Where P is the purchase price, S is the salvage value, and Y is the number of years the item is used.
 * Write a program that takes as input the purchase price and the expected number of years of service and the expected salvage price.
 * The program should then ouput the yearly depreciation value of the item.
*/
public class Problem2_5
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the following values P S and Y");
        double P = input.nextDouble();
        double S = input.nextDouble();
        double Y = input.nextDouble();
        
        double D = (P-S)/Y;
        
        System.out.printf("The D the yearly depreciation value is %.2f %n", D);
    }
}
