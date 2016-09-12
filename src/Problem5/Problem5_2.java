/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

import java.util.Scanner;

/**
 * This code is the solution of problem5_2 of the book Absolute Java
 * @author it-elias
 * 
 * Define a class called Fraction. This class is used to represent a ratio of two integers. Include mutator methods
 * that allow the user to set the numerator and the
 * denominator. Also include a method that displays the fraction on the screen as a
 * ratio (5/9). This method does not need to reduce the fraction to the lowest terms.
 * 
 * Include an additional method, equals, that takes as input another fraction and returns
 * true if the two fractions are identical and false if they are not.
 * This method should treat fractions reduced to the lowest froms.
 * for example 20/60 == 1/3
 * 
 * Embed your class in a test program that allows the user to create a fraction. Then the program should
 * loop repeatedly until the usere decides to quit. Inside the body of the loop the program should allow the user to
 * enter a target fraction into an anonymous object and learn wether the fractions are identicial.
 */
public class Problem5_2
{

    /**
     * This class uses the class fraction
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        Fraction a = new Fraction(input.nextInt(), input.nextInt());
        if(a.identical(new Fraction(input.nextInt(), input.nextInt())))
            System.out.println("yeah!");
    }
}
