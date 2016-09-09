/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.text.DecimalFormat;

/**
 * This code is the solution for problem3_5 of the book AbsoluteJava
 * @author it-elias
 * 
 * You have jsut purchased a sterio system that cost $1,000 on the following credit plan:
 * no down payment, an interest rate of 18% per year ( and hence 1.5% per month), and monthly payment of $50.
 * The monthly payment of %50 is used to pay the interest and whatever is left is used to pay part of the remaining debt.
 * Hence, the first month you pay 1.5% of the $1000 in intrest. That is $15 in interest and So, the remaining $35 is dedut from your
 * debt, which leaves you with a adebt of $965,00. The next month, you pay interest of 1.5% of $965,00 , which is 14,48 dollars and the left
 * 35.52 is paid towards the capital. Write a program that tells you how many motnsh it will take you to pay off the loan, as well as the total amount of interest paid over the life of the loan. Use a loop to calculate the amount of interest and the
 * size of he debt after each month. (your
 * final program need no output the monthly amount of interest paid and remaining debt, but you may awnt to write a preliminary version of the program that doese output these values).
 * Use a variable to count the number of loop iterations and hence the number of months until the debt is zero. You may want to use other variables as well. 
 * The last payment may be less than $50 dollars if the debt is small, but do not forget the interest.
 * If you owe $50, your monthly payment of $50 will not pay off your debt, although it will come close. One month's interest on %50 is only 75 cents.
 */
public class Problem3_5
{
    //I am using the addition format to get things faster
    public static double MONTHLY_RATE = 1.015;
    /**
     * The program does not take any input. it counts the number of monthly payments
     * finacial rules are simple. Your monthly payment would be first used to payoff the interest
     * if whatever is left it contributes to loweroff the capital.
     * However, a stupid guy on loan will accept a monthly payment that would not even pay the interrest.
     * this way the interrest will add up to the capital and it will be impossible to pay off the capital.
     * The monthly payment should at least cover the interrest and a small part of the capital.
   */
   public static void main()
   {
       double capital = 1000;
       int month = 0;
       double paid =0;
       DecimalFormat df = new DecimalFormat("##.##");
       while( capital >0)
       {
           capital*=MONTHLY_RATE;
           capital -=50;
           month++;
       }
       
       System.out.println("The total ammount paid is "+ df.format((month*50.0) + capital));
       System.out.println("The total number of month is "+ month);
       System.out.println("The total paid in interrest is "+ df.format((month*50.0) + capital - 1000));
   }
}
