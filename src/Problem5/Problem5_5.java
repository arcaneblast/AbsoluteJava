/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

import java.util.Scanner;

/**
 * This code is the soluiton of problem 5 of chapter 5 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * Part One: define a class named Money whose objects represent amounts of U.S.
 * Money. The class should have two instance variables of type int for the
 * dollars and cents in the amount of money. Include a constructor with two
 * parameters of type int for the dollars and cents. One with one constructor of
 * type int for an amount of dollars with zero cents and a no argument
 * constructor. Include the methods add and minus for addition and substraction
 * of the amounts of money. These methods should be static methods, should each
 * have two parameters of type Money, and return a value of type Money. Include
 * a reasonable set of get and set methods as well the mothods equals and to
 * Strong.
 *
 * Part Two: Add a second version of the methods for addition and subtraction.
 * These methods should have the same name as the static version but should use
 * a calling object and a single argument. For example, this version could use
 * the following m1.add(m2)
 *
 */
public class Problem5_5
{

    public static void main()
    {   
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt();
        int c1 = input.nextInt();

        Money m1 = new Money(d1, c1);
        int d2 = input.nextInt();
        int c2 = input.nextInt();
        
        Money m2 = new Money(d2, c2);
        m1.add(m2);
        System.out.println((m1));
    }
}
