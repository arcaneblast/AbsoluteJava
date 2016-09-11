/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This code is the solution of problem4_2 of the book Absolute Java.
 * @author it-elias
 * 
 * Define a class Called Fraction. This iclass is used tto represent a ratio of two integers. Include mutator methods
 * that allow the user to set the numerator and the
 * denominator. Also include a method that returns a value of the numerator divided
 * by the denominator as a double. Include an additional method that outputs the value of the fraction reduced to the lowest terms. This
 * is required finding the greatest common divisor for the numerator and denominator, then dividing both by that number.
 * Make a test program
 */
public class Problem4_2
{

    /**
     * Instead of calling the class Fraction I will make another class (public) in the same package as problem 4
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of n and d");
        int n = input.nextInt(); int d = input.nextInt();
        
        Fraction f = new Fraction(n,d);
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("The value in double is "+ df.format(f.value()));
        System.out.println("The best fraction (simplified) is " + f.getSimlified());
    }
}
