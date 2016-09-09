/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.util.Scanner;

/**
 * This code is the solution of problem3_6 of the book Absolute Java
 * @author it-elias
 * 
 * The fibanocci numbers are defined as follows:
 * F0 = 1
 * F1 = 1
 * Fn = Fn-1 + Fn-2;
 * One place where these numbers occur is as certain population growth rates.
 * If a population has no deaths, then the series
 * shows the size of the population after each time period. It takes an organism
 * two time periods to mature to reproducing age, and then the organism reproduces once every time period. The 
 * formula appplies most straight forwardly to green crud population grows at this rate and has a time period of five days,
 * Hence if a green crud population starts out as 10 pounds of crud, then in 5 days, there is still
 * 10 pounds of crus; in 10 days , there would be 20 pounds of crus;
 * in 15 days, 30 pounds and 20 days 50 pounds and so forth.
 * Write a program that takes both the initail size of a green crud pouplation (in pounds) and a number of days as input and outputs the number of pounds of the green crud afterthat many days.
 * Assume that the population size is tsame for four days and then encreases eevery fifth day. your program should allow the user to repeat this calculation as often as desired.
 * 
 * 
 * So the cruds starts off as babies (which cannot reproduce.)
 */
public class Problem3_6
{

    /**
     * This program takes the size(pounds) of the green cruds
     * The number of days
     * How often do they reproduce (life cycle step)
     * Outputs the number of green cruds by the end of the days specified
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the following size, days, life cycle step");
        int size = input.nextInt();
        int days = input.nextInt();
        int step = input.nextInt();
        
        int a = 0;
        int b = 1;
        for(int i=0; i<days; i+=step)
        {
            int temp = b;
            b = (a+b);
            a = temp;
        }
        
        System.out.println("The final size is "+ size*b);
    }
}
