/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.Scanner;

/**
 * This code is the solution from problem2_3 from the book AbsoluteJava
 * @author it-el
 * 
 * problem:
 * Write a program that reads in two integers typed on the keyboard and outputs their sum, difference and product
 */
public class Problem2_3
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers:");
        int n = input.nextInt();
        int m = input.nextInt();
        
        System.out.println("The add is " + (n+m) + " the product is " + (n*m) + " the difference is " + (n-m));
    }
}
