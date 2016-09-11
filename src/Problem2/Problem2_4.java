/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.Scanner;

/**
 * This code is the solution of the problem2_4 of the book Absolute Java.
 * @author it-elias
 * An automobile is used for commuting purposes. Write a program that takes as input the distance of the commute in miles,
 * the automobile's fuel consumption rate in miles per gallon, and the price of a gallon of gas. The program then should output the cost of the commute.
 */
public class Problem2_4
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter three doubles: 1) the distance 2) the consumption rate dis/gallon 3) the price of a gallon");
        double distance = input.nextDouble();
        double consumptionRate = input.nextDouble();
        double gallonPrice = input.nextDouble();
        
        double totalPrice = distance * (1.0 / consumptionRate) * gallonPrice;
        
        System.out.printf("The total price is %.2f %n", totalPrice);
    }
}
