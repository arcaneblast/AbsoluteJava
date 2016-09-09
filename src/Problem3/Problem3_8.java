/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

/**
 * This code is the solution of the problem3_8 of the book Absolute Java
 *
 * @author it-elias
 *
 * In cryptarithmatic puzzles, mathematical equations are written using letter.
 * Each letter can be a digit from 0 to 9 but no two letters can be the same.
 * Here is a sample problem: SEND + MORE = MONEY
 *
 * A solution to the puzzle is (S,R,O,M,Y,E,N,D) = (9,8,0,1,2,5,6); wRITE A
 * PROGRAM THAT FINDS A SOLUTION TO THE cryptarithmetic puzzle of the following:
 *
 * TOO + TOO + TOO + TOO = GOOD;
 *
 * the simplest technique to use a nested loop for each unique letter(in this
 * case T, O, G, D). The loops would systematically assign the digits from 0 to
 * 9 to each letter. For example, it might first digits ok. In short it is brute
 * force.
 */
public class Problem3_8
{

    /**
     * This program finds the solution for the equation 4* TOO = GOOD;
     * brute forced:
     * However,
     * 4T +8O = 2O + G +D
     * 4T +6O = G + D
     *  4   0   9   7
     * manually!
     */
    public static void main()
    {
        int O = -1, T = -1, G = -1, D = -1;
        outer:
        for (O = 0; O < 10; O++)
        {
            for (T = 0; T < 10; T++)
            {
                for (G = 0; G < 10; G++)
                {
                    for (D = 0; D < 10; D++)
                    {
                        if (checkEquality(O, T, G, D))
                        {
                            break outer;
                        }
                    }
                }
            }
        }
        System.out.printf("The solution is %d %d %d %d", O, T, G, D);
    }

    private static boolean checkEquality(int O, int T, int G, int D)
    {
        if(O == T || O== G || O == D)
            return false;
        else if(T== G || T == D)
            return false;
        else if(G == D)
            return false;
        
        return ((4 * (T + O + O)) == (G + O + O + D));
    }
}
