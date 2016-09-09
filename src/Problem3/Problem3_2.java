/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * This code is the solution of problem3_2 of the book: AbsoluteJava
 * @author it-elias
 * 
 * The problem:
 * In the game of craps, a pass line bet proceeds as follows:
 * The first roll of the dice in a craps round is called the "come out roll"
 * A come out roll of 7 or 11 automatically wins, and a come out roll of 2,3,12 automatically loses.
 * If 4,5,6,8,9or 10 is rolled on the come out roll, that
 * number becomes "the point" The player keeps rolling the dice until either 7 or the point is rolled. If the point is rolled first, the the player wins the bet. If a 7 is rolled
 * first the the player loses the bet.
 * 
 * Write a program that simulates a game of craps using these rules without human input. Instead asking for a wager,
 * the program should caculate wether the player would win or lose.
 * The program should simulate rolling the two dice and calculate the sum. Add a loop so that the program plays 10,000 games. Add counters that count
 * how many times the player wins and how many times the player loses. At the end of 10,000 games, compute the probability of winning and output this value. Over the long run, who is going to win the most of games, you or the house.
 */
public class Problem3_2
{
    public static final int NUMBER_OF_GAMES = 10000;
    
    /**
     * This program runs the game described above 10,000 times and then calculate the chances of winning and losing.
     */
    public static void main()
    {
        int wins = 0;
        for(int i=0; i<NUMBER_OF_GAMES; i++)
        {
            if(winGame())
                wins++;
        }
        
        System.out.println("The number of wins is "+ wins + " of "+ NUMBER_OF_GAMES);
        double precent = (wins*1.0)/NUMBER_OF_GAMES;
        DecimalFormat df = new DecimalFormat("#%");
        
        System.out.println(df.format(precent));
    }
    
    private static boolean winGame()
    {
        //first roll Come out roll
        int comeOutRoll = rollingTwoDice();
        switch (comeOutRoll)
        {
            case 7:
            case 11:
                return true;
            case 2:
            case 3:
            case 12:
                return false;
            default:
                int nextRoll = rollingTwoDice();
                while(nextRoll != 7 && nextRoll!=comeOutRoll)
                    nextRoll = rollingTwoDice();
                
                return nextRoll != 7;
        }
    }
    
    private static int rollingTwoDice()
    {
        int roll1 = rollTheDice();
        int roll2 = rollTheDice();
        
        return roll1+roll2;
    }
    private static int rollTheDice()
    {
        Random random = new Random();
        int value = random.nextInt(6) +1;
        assert (value > 0) &&(value <7);
        return value;
    }
}
