/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 * This code is the solution for the problem1_10 in the book Absolute Java
 *
 * @author it-elias
 *
 * Scientists estimate that roughly 10 grams of caffeine consumed at one time is
 * a lethal overdose. Write a program with a variable that holds the number of
 * milligrams of caffeine in a drink and ouputs how many drinks it takes to kill
 * a person. For example, A 12-ounce can of cola has approximately 34mg of
 * caffeine, while a 16-ounce cup of coffe has approximately 160 mg of caffeine
 */
public class Problem1_10
{
    /** the lethal dose */
    public static final int LETHAL_DOSE = 10000;
    /**
     * Implementation of the problem above
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        int mgCaffeine = 0;
        
        System.out.println("Please enter the number of mg of Caffeine your beverage has");
        mgCaffeine = input.nextInt();
        
        System.out.println("You will die after drinking about " + LETHAL_DOSE/ mgCaffeine + "cups!");
    }
}
