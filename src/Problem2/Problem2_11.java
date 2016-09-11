/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This code is the solution of problem 2_11 of the book Absolute Java
 * @author it-elias
 * Write a program that caculates the total grade of three classroom exercises as a percentage.
 * Use the DecimalFormat class to ooutput the value as a percent. The
 * scores should be summarized in a table. Input the assignment information in this
 * order: name of assignment (may include spaces), points earned (integer), and total
 * points possible (integer). The percentage is the sum of the total points earned divided by the total points possible.
 */
public class Problem2_11
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("##.##%");
        
        //vars
        int[] mark = new int[3];
        int[] total = new int[3];
        String[] name = new String[3];
        for(int i=0; i<3; i++)
        {
            System.out.println("Please enter the name of the exercise "+ (i+1));
            name[i] = input.nextLine();
            System.out.println("Please enter the mark of the exercise "+ (i+1));
            mark[i] = input.nextInt();
            System.out.println("Please enter the total of the exercise "+ (i+1));
            total[i] = input.nextInt();
            
            //clear the line
            input.nextLine();
        }
        System.out.printf("%-10s%-10s%-10s %n", "Exercise", "Score", "TotalPossible");
        int sumMarks = 0, sumTotals = 0;
        for(int i=0; i<3; i++)
        {
            System.out.printf("%-10s%-10d%-10d%n", name[i], mark[i], total[i]);
            sumMarks += mark[i];
            sumTotals += total[i];
        }
        System.out.printf("%-10s%-10d%-10d%n", "Total", sumMarks, sumTotals);
        
        System.out.printf("Your total is %d out of %d, or %s%n",sumMarks, sumTotals, formatter.format(sumMarks/(sumTotals*1.0)));
    }
}
