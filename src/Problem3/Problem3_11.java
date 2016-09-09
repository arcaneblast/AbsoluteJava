/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.util.Random;

/**
 * This code is the solution of the problem3_11 of the book AbsoluteJava
 * @author it-elias
 * 
 * You have three identiacal prizes to give away and a pool of 30 finalists. The finalists
 * are assigned numbers from 1 to 30. Writee a program to randomly select the numbers for three finalists to recieve a prize.
 * Make sure not to pick the same number twice. For example picking finalists 3, 15, 29 would be valid
 * but picking 3,3,31 would be invalid because 3 is listed twice and 31 is not a valid number
 */
public class Problem3_11
{
    public static void main()
    {
        Random random = new Random();
        boolean done = false;
        int[] winners = new int[3];
        int i = 0;
        
        while(i<winners.length)
        {
            winners[i] = random.nextInt(30) + 1;
            assert ( winners[i] >0 && winners[i] <= 30);
            if(!checkIfDuplicate(winners))
                i++;
        }
        
        for(i=0; i<winners.length; i++)
        {
            System.out.printf("%d ", winners[i]);
        }
        System.out.println();
    }
    
    private static boolean checkIfDuplicate(int[] a)
    {
        for(int i=0; i< a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
                if(a[i] == a[j] && a[i] !=0)
                    return true;
        }
        return false;
    }
}
