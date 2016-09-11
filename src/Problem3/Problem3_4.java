/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This class is the solution for problem 3_4 of the book AbsoluteJava
 * @author it-elias
 * 
 * It is difficult ot make a budget that spans several years, because prices are not stable. If your
 * company needs 200 pencils per year, you cannot simply use this year's price
 * as the cost of pencils two years from now. Because of
 * inflation, the cost is likely to be higher than it is today. Write a program to gauge the expected cost of an item in
 * a specified number of years. The program asks for the cost of the item, the number
 * of years from now that the item will be purchased, and the rate of infilation. The program then
 * outputs the estimated cost of the item after the specified period.
 * Have the user enter the inflation ratte as a percentage, so 5.6% would be entered as 5.6.
 * Your program should then convert the percent to a fraction, such as 0.056 and should use a loop to estimate the price adjusted for inflation.
 * 
 * using a loop is stupid while we can use the compound interrest rule.
 */
public class Problem3_4
{

    /**
     * This program would take as input the price, years and rate. and output the new price.
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##$");
        
        System.out.println("Please enter the current price");
        double price = input.nextDouble();
        
        System.out.println("Please enter the number of years");
        int years = input.nextInt();
        
        System.out.println("Please enter the inflation rate as 5.6%");
        double rate = input.nextDouble();
        
        //convert to fraction
        rate /= 100.0;
        
        double finalPrice = price * Math.pow((1 + rate),years);
        System.out.println("the final price is "+ df.format(finalPrice)+ " using the compound interrest rule");        
    }
}
