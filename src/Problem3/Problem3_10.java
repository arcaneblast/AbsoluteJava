/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.io.File;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/**
 * This code is the solution of the probelm 10 of chpater 3 of the book
 * Absoulute Java
 *
 * @author it-elias
 *
 * The game of Pig is a simple two-player dice game in which the first player to
 * earch 100 or more points wins. Players take turns. On each turn, a player
 * rolls a six sided dice: * if the player rolls a 1, then the player gets no
 * new points and it becomes the other player's turn. * if the player rolls 2
 * through 6, then he or she can either ** ROLL AGAIN or ** HOLD. At this point,
 * the sum of all rolls is added to the player's score, and it becomes the
 * players the other player's turn.
 *
 * Write a program that plays the game of Pug, where one player is a human and
 * the other is the computer. When it is human's turn, the program should show
 * the score of both players and the previous roll. This allow the human to
 * input r to roll again or h to hold. * The computer program should play
 * according to the following rule. the computer will roll for ever :P
 */
public class Problem3_10
{

    public final static int MAX_SCORE = 100;

    public static void main()
    {
        // the input should be r or h
        Scanner input = new Scanner(System.in);
        // if one player gets over a 100 it gets mode and hands over the turn.
        int myScore = 0, computerScore = 0;
        boolean myTurn = true;

        while (myScore != MAX_SCORE || computerScore != MAX_SCORE)
        {
            myScore %= MAX_SCORE;
            computerScore %= MAX_SCORE;

            while (myTurn)
            {
                int dice = rollTheDice();
                if (dice == 1)
                {
                    myTurn = false;
                } else
                {
                    myScore += dice;
                    if (myScore == 100)
                    {
                        System.out.println("Won!");
                    } else if (myScore > 100)
                    {
                        myTurn = false;
                        break;
                    }
                    System.out.println("r or h");
                    char c = input.next().charAt(0);
                    c = Character.toLowerCase(c);

                    if (c == 'h')
                    {
                        myTurn = false;
                    } else if (c != 'r')
                    {
                        System.exit(-1);
                    }

                }
            }

            while (!myTurn)
            {
                int dice = rollTheDice();
                if (dice == 1)
                {
                    myTurn = true;
                } else
                {
                    computerScore += dice;
                    if (computerScore == 100)
                    {
                        System.out.println("Computer Won!");
                    } else if (computerScore > 100)
                    {
                        myTurn = true;
                    }
                }
            }
        }
    }

    public static int rollTheDice()
    {
        return (int) ((5 * Math.random()) + 1);
    }
}
