/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 * Problem1_9 is the solution of the 9th problem of chapter 1 of the book
 * absolute java
 *
 * @author it-elias
 *
 * A simple rule to estimate your ideal body weight is to allow 110 pounds for
 * the first 5 feet of height and 5 pounds for each additional inch. Write a
 * program with a variable for the height of a person in feet and another
 * variable for the additional inches. Assume the person is at least 5 feet
 * tall. For example, a person that is 6 feet and 3 inches tall would be
 * represented with a variable that stoures the number 6 and another variable
 * that stores the number 3. Based on these values, calculate and output the
 * ideal body weight.
 */
public class Problem1_9
{

    public static void main()
    {
        Scanner input = new Scanner(System.in);

        int inches = 0;
        int feet = 0;

        System.out.println("Please enter the heigh in feet first and then the additional inches");
        feet = input.nextInt();
        inches = input.nextInt();

        //condition given in the problem
        assert feet >= 5;

        inches += feetToInches(feet - 5);
        int weight = 110 + 5 * inches;
        System.out.println("The ideal weight is " + weight);

    }

    private static int feetToInches(int feet)
    {
        return 12 * feet;
    }
}
