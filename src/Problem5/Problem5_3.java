/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 * This code is the solution of problem5_3 of the book AbsoluteJava
 * @author it-elias
 * 
 * problem:
 * In the land of Puzzlevania, Aron bob and Charlie had an argument over which one
 * of thme was the greatest puzzler of all time. To end the arguemtn once and for all,
 * they agreed on a duel to the death. Aaron was a poor shooter and only hit his target with a probability of 1/3. Bob was a 
 * bit better and had a hit of 1/2. Charlie was an expert and never missed. A hit means a kill and the person hit drops out of the duel.
 * 
 * To compenstate for the inequities in their markship skills, the three decided that they would fire in turns, starting with aaron, followed by bob and then by
 * Charlie. The cycle would repeat until there was no but one man standing, and that man would be the greatest puzzler of all time.
 * 
 * An obvious and reasonable startegy is for each man to shoot at the most accureate shooter still alive, on the grounds that thiss shooter is the deadliest, and has the best chance of hitting back.
 * 
 * Write a program to simulate the duel using this strategy. Your program should use random
 * numbers and the probabilites given in the problem to deterine wether
 * a shooter hits the target. Create a class named Duelist that contains the duler's
 * name and shooting acuccuracy, A boolean indicating wether the duler is still alive, and a method ShootAtTarget(Duelist target)
 * that sets the target to dead if the duler hists his target (using a random number and the shooting accuracy) and nothing otherwise.
 * 
 * Once you can simulate a single duel, add a loop to your program that sumulates 10,000 duels. Count the number
 * of times that each contestant wins and print the probability of winning for each contestant.
 * e.g, for Aaron your program might output "Aaron won 3.595/10.000 duels or 35.95%.
 * 
 * An alternate strategy is for Aron is to intentionally miss on his first shot. Modify the program to accomodate this new strategy and output the probability of winning for each
 * contestnat. which strategy is better for Aaron: to intentionally miss on the first hsot or try to hit the best shooter? Who has the best chance of winning the best shoort or the worst shooter?
 */
public class Problem5_3
{
    public static int NUMBER_OF_FIGHTS = 10000;
    public static void main()
    {
        Duelist[] a;
        a = new Duelist[3];
        
        a[0] = new Duelist(30, true);
        a[1] = new Duelist(50, true);
        a[2] = new Duelist(100, true);
        int[] wins;
        wins = new int[3];
        
        for(int i=0; i< NUMBER_OF_FIGHTS; i++)
        {
            int deads =0;
            boolean done = false;
            int turn = 0;
            while(!done)
            {
                if(a[turn%3].isAlive() &&a[turn%3].hitOrMiss() && turn!=0)
                {
                    findTheHighestAndKill(a, turn%3);
                    deads++;
                    if(deads == 2)
                    {
                        for(int j=0; j<3; j++)
                        {
                            if(a[j].isAlive())
                                wins[j]++;
                            a[j].rebirth();
                        }
                        done = true;
                    }
                }
                turn++;
            }
        }
        for(int i=0; i<3; i++)
            System.out.print(wins[i]+ " ");
    }
    
    public static void findTheHighestAndKill(Duelist[] a, int me)
    {
        for(int i=a.length-1; i>=0; i--)
        {
            if(a[i].isAlive() && i!=me)
            {
                a[i].kill();
                return;
            }
        }
    }
}
