/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This code is the solution of the problem4_15 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * This program extends the solution presneted in problem 14. After reading the
 * input the program will use the input from the user keyboard to caculate the
 * simularity between the two inputs. The program then would output the lowest
 * score (greater simularity) as its guess for the user.
 */
public class Problem4_15
{

    public static final int MAX_LINES = 1000;

    /**
     * This implementation does not need a class
     */
    public static void main()
    {
        try
        {
            System.setIn(new FileInputStream("test/inputFile.txt"));
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Problem4_14.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scanner input = new Scanner(System.in);
        String[] lines = new String[MAX_LINES];
        int[][] ratings = new int[MAX_LINES][5];
        String[] products = new String[5];
        int i = 0;
        while (input.hasNextLine())
        {
            lines[i] = input.nextLine();
            StringTokenizer st = new StringTokenizer(lines[i], ",");
            if (i == 0)
            {
                for (int j = 0; j < 5; j++)
                {
                    products[j] = st.nextToken();
                }
            } else
            {
                for (int j = 0; j < 5; j++)
                {
                    ratings[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            i++;
        }

        //compute average
        double[] average = new double[5];
        for (int j = 0; j < 5; j++)
        {
            average[j] = 0;
            int count = 0;
            for (int k = 1; k < i; k++)
            {
                if (ratings[k][j] != 0)
                {
                    count++;
                    average[j] += ratings[k][j];
                }
            }
            average[j] /= count;
        }

        for (int j = 0; j < 5; j++)
        {
            System.out.println("Product :" + products[j]);
            System.out.println("Average :" + average[j]);

        }
        
        System.out.println("I will use hardcoded input to avoid changing the System.in back to original");
        int[] keyboard = {1,2,4,5,6};
        int min = Integer.MAX_VALUE;
        int lineIndex = -1;
        for(int j=1; j<i; j++)
        {
            int tempMin =computeSimilarity(keyboard, ratings[j]);
            if(tempMin < min)
            {
                min = tempMin;
                lineIndex = j;
            }
        }
        
        System.out.println("the similarity is " + min + " the winner is line " + lineIndex);
    }

    public static int computeSimilarity(int[] a, int[] b)
    {
        int sum = 0;
        for (int i = 0; i < a.length && i < b.length; i++)
        {
            sum += (int) Math.abs(a[i]-b[i]);
        }
        return sum;
    }

}
