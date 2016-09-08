/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 * This code is the solution of problem 6 of chapter 1 of the book Absolute java
 * @author it-elias
 * 
 * Bicyclists can calculate their speed if the gear size and cadene are known. Gear size refers to the 
 * effective diameter of the wheel. Gear size multiplied by pi (3.14) gives the distance travelled with one turn of the pedals. Cadence refers to the number of pedal revolution per minute (rpm).
 * The pseed in miles per hour is calculated  by the following:
 * 
 * Speed (mph) = Gear size( inches ) * pi * (1(ft) / 12 (inches)) * (1 (mile) / 5280 (ft)) * Cadence (rpm) * 60 minutes / hour
 * This program calculates the speed for gear of size of 100 inches and a adence of90 rpm. This would be considered a high cadence and a maximum
 * gear size for a typical bicycle. In writing yor program, don't forget that  the expersion 1/12 will result in 0, because both 1 and 12 are intergers.
 */

public class Problem1_6
{

    /**
     * Implementation of the problem above
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in); 
        
        double cadence = 0.0, gearSize = 0.0;
        
        System.out.println("Please enter the following values cadence and gearSize");
        cadence = input.nextDouble();
        gearSize = input.nextDouble();
        
        System.out.println("The mph is "+ gearSize * 1.0/12.0 * 1.0/ 5280.0 * cadence * 60.0);
    }
}
