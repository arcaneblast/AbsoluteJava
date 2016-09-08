/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

/**
 * This code is the solution of problem 1_8 of the book Absolute Java
 *
 * @author it-elias
 *
 * The following program will compile and ru, but it uses poor programming
 * style, modify the program so that it uses the spelling conventions, constant
 * naming conventins and formatting style recommended in this book. Here I will
 * just write the program as is
 */
public class Problem1_8
{
    public static final double DISTANCE = 6.21;
    /**
     * Code Fixed
     */
    public static void main()
    {
        double time = 0, pace = 0;
        System.out.println("This program calculates your pace given a tie and distance traveled.");
        
        time = 35.5;
        pace= time / DISTANCE;
        System.out.println("Your pace is " + pace + " miles per hour.");
    }
}
