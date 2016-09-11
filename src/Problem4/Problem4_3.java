/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Scanner;

/**
 * This code is the solution of problem 3 of chapter 4 of the book AbsoluteJava
 * @author it-elias
 * 
 * Define a class called odometer that will be used to track fuel and milegae for an automobile.
 * The class should have instance variables to track the miles driven and the fuel efficiency of the vehicle in miles
 * per gallon. Include a mutator method to reset the odometer to zero miles, a mutator method to set the fuel efficiency, a 
 * mutator method that accepts miles driven for a trip and adds it to the odometer's
 * total, and an accessor method that returns the number of gallons of gasoline that
 * the vehicle has consumed since the odometer was last reset.
 * 
 * Use your clas with a test program to test several different fuel efficincies.
 * You should decide which variables should be public, if any.
 * 
 * We will create the class Odometer that will be linked  to this problem
 */
public class Problem4_3
{

    /**
     * The problem implementation
     * @throws java.lang.Exception In case the rate is defined 0 (super green car!)
     */
    public static void main() throws Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter miles done and the fuel effeicincy (miles/gallons)");
        double miles = input.nextDouble();
        double rate = input.nextDouble();
        
        Odometer odmeter = new Odometer(miles, rate);
        System.out.println("You need "+ odmeter.getNumberOfGallons() + " gallons");
        System.out.println("Please enter additional miles");
        double additionalMiles = input.nextDouble();
        odmeter.addMiles(additionalMiles);
        
        System.out.println("Now you need "+ odmeter.getNumberOfGallons() + " gallons");
        
        
    }
    
}
