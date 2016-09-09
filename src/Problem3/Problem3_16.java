/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.util.Scanner;

/**
 * This code is the solution for problem3_16 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * Create a text file that contains 10 integers with one integer per line. You
 * may choose any 10 integers to enter in the file. Then write a program that
 * inputs a number from the keyboard and determines wether any pair of the 10
 * integers in the text file adds up to exactly the number typed in from the
 * keyboard. If so, the program should output the pair of integers. If no pair
 * of integers adds up to the numbere, then the program should output "No Pair
 * Found".
 */
public class Problem3_16
{

    /**
     * Instead of getting the array from a file I will enter it manually.
     */
    public static void main()
    {
        int[] numbers = new int[10];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 10;
        numbers[6] = 100;
        numbers[7] = 130;
        numbers[8] = 114;
        numbers[9] = 800;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number n");
        int n = input.nextInt();
        int i = 0, j = 0;
        boolean found = false;

        outer:
        for (i = 0; i < 10; i++)
        {
            int temp = n - numbers[i];
            for (j = 0; j < 10; j++)
            {
                if (temp == numbers[j] && i != j)
                {
                    found = true;
                    break outer;
                }
            }
        }
        if (i == 10)
        {
            System.out.println("Not Found");
        } else
        {
            System.out.println("The two numbers are " + i + " " + j);
            System.out.printf("%d %d %n", numbers[i], numbers[j]);

        }
    }
}
