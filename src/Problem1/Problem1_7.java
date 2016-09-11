/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 * This code is he solution of problem 6 of chapter 1. Book absolute java
 * @author it-el
 * 
 * WRite a program that outputs the number of hours, minutes and seconds that corresponds to 50391 total seconds,
 * the output should be 13 hours, 59 minutes and 51 seconds. Test your program with a different number of total seconds to ensure that it works for other cases.
 */
public class Problem1_7
{

    /**
     * Implementaiton of the problem above.
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        
        int seconds = 0;
        
        System.out.println("Please enter the number of seconds");
        seconds = input.nextInt();
        
        System.out.println("the number of hours, minutes, and seconds :" + seconds / 3600 + ", " + (seconds %3600) / 60 + ", " + seconds % 60);
    }
}
