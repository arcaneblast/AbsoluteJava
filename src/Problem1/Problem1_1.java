/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** this solution was created in accordance to the problem 1.1 in the book of absolute java */
package Problem1;

/**
 * One way to measure the amount of energy that is expended during exersise is to use metabolic equivalents (MET).
 * Here are some METS for various activites:
 * 
 * Running 6 MPH => 10 METS
 * Basketball   => 8 METS
 * Sleeping     => 1 METS
 * 
 * The number of calories burned per minute may be estimatedd using the following formula:
 * Calories/Minute = 0.0175 X MET X Weight in kilograms
 * 
 * Write a program that calculates and outputs the total number of alories burned for a 150-poind person who
 * runs 6 MPH for 30 miniutes, plays basketball 30 minutes, and then sleeps for 6 hours. 
 * Note: One kilogram is equal to 2.2 pounds
 * @author it-el
 */
public class Problem1_1 {
    
    public static final double MET_RUNNING = 10;
    public static final double MET_BASKETBALL = 8;
    public static final double MET_SLEEPING = 1;
    
    /**
     * this method takes pounds and gives back KG
     * note 1 kg is 2.2 pound
     * @param pounds double value which is the weight of a person in pounds
     * @return doulbe value for kg
     */
    public static double convertPoundtoKG(double pounds)
    {
        double weightInKG = pounds/2.2;
        return weightInKG;
    }
    
    /**
     * This method calculates the calories per minute related to a specific exercise and given
     * the time and weight.
     * @param met : the met related to a specific activity
     * @param weightInKG : the weight of a person in KG
     * @param minutes : integer represents the time in minutes
     * @return caloriesPerMinute in double value
     */
    public static double caloriesPerMinute(double met, double weightInKG, int minutes)
    {
        return 0.0175 * met * weightInKG;
    }
    
    /** test of the problem 1_1 with doing what's asked */
    public static void main()
    {
        //first convert the weight to KG
        double weightInPounds = 150.0;
        double weightInKG = convertPoundtoKG(weightInPounds);
        
        System.out.println("Problem 1.1");
        System.out.println("A person of "+ weightInKG +" KG Running for 30 minutes");
        System.out.println(caloriesPerMinute(MET_RUNNING, weightInKG, 30));
        
        System.out.println("A person of "+ weightInKG +" KG Playing Basketball for 30 minutes");
        System.out.println(caloriesPerMinute(MET_BASKETBALL, weightInKG, 30));
        
        System.out.println("A person of "+ weightInKG +" KG Sleeping for 6 Hours");
        System.out.println(caloriesPerMinute(MET_SLEEPING, weightInKG, 6*60));
        
    }
    
}
