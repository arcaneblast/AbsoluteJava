/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.Scanner;

/**
 * This code is the solution of the problem2_7 of the book Absolute Java
 * @author it-elias
 * 
 * This code is the following:
 * A vending machine that only accepts a dollar bill to pay for an item. The item price has the range from 25 cents to 1$
 * the problem is the vending machine need to know what to return exactly knowing that
 * a quarter is 25 cents
 * a nickle is 5 cents
 * a dime is is 10 cents
 */
public class Problem2_7
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the price of an item 25 cents to 1 dolar (5 cents increase)");
        int price = input.nextInt();
        
        int change = 100 - price;
        int quarter = change / 25; change %=25;
        int dimes = change / 10; change %=10;
        int nickle = change / 5; change %=5;
        
        System.out.println("Quarters : " + quarter + " Dimes: " + dimes + " Nickles: " + nickle);
        
    }
}
