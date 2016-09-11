/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 * This class provides the solution of the problem 2 chapter 1 of the book absolute java.
 * @author it-elias
 * 
 * The video game machines at your local arcade output coupons according to ow well you play the game. You can redeem
 * 10 coupons for candy bar on 3 coupons for a gumball. You prefer candy bars to gumballs. Write a program that defines
 * a variable intially assigned the numbe rof coupons you win. Next, the program should ouput how many
 * candy bars and gumballs you can get if you spend all of your coupons on candy bars first, and any remaining coupons on gumballs.
 */
public class Problem1_2 {

    public static final int COUPONS_CANDYBAR = 10;
    public static final int COUPONS_GUMBALL = 3;
    /**
     * this method provide the solution for the problem.
     * The question is straight forward and the solution is easy
     */
    public static void main()
   {
       int numberOfCoupons = 0, candyBars = 0, gumBalls = 0, couponsLeft =0;
       
       Scanner input = new Scanner(System.in);
       System.out.println("Please dear Sir, enter the number of coupons you have");
       numberOfCoupons = input.nextInt();
       
       // test for error inputs
       if(numberOfCoupons < 0)
       {
           System.out.println("Input ERRROR!");
           System.exit(0);
       }
       
       candyBars = numberOfCoupons / 10;
       gumBalls = (numberOfCoupons % 10) / 3;
       couponsLeft = (numberOfCoupons %10) % 3;
       
       System.out.println("Number of candyBars "+ candyBars);
       System.out.println("Number of gumballs "+ gumBalls);
       System.out.println("Number of useless coupons "+ couponsLeft);
   }
}
