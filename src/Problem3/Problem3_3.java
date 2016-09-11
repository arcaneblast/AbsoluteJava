/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This code is the solution of problem3_3 of the book Absolute Java
 *
 * @author it-elias
 *
 * One way to estimate the adult height of a child is to use the following
 * formula, which uses the height of the parent: Hmale_child = ((Hmothher x
 * 13/12) + Hfather)/2 Hfemale_child = ((Hfather x 12/13) + Hmother)/2;
 *
 * All hieghts are in inches. Write a program that takes as input the gender of
 * the child, the height of the mother in inches and the ehgiht of the father in
 * inches. The program should allow the user to enter a new set of values and
 * output the predicted height until the user decides to exit. The user should
 * be able to input the heights in feet and inches and the program should output
 * the estimated height of the child in feet and inches. Use the int data type
 * to store the height
 */
public class Problem3_3
{

    public static final int GENDER_MISMATCH_EXIT_CODE = 239;

    /**
     * This program should allow infinite input until the user enters exit the
     * program would also allow the user to specify input in feet or inches.
     */
    public static void main()
    {
        //vars
        int fatherInches = 0, motherInches = 0;
        DecimalFormat df = new DecimalFormat("##.##");
        Scanner input = new Scanner(System.in);

        System.out.println("Please note when input a string all letters should be lowercase");
        System.out.println("Please input the gender of the child or exit to exit");
        String gender = input.next();
        while (!gender.equals("exit"))
        {
            System.out.println("please enter the height of the father");
            System.out.println("please specify the unit before the value as inches or feet if feet you are required to enter inches too");
            String unit = input.next();
            fatherInches = input.nextInt();
            if (unit.equals("feet"))
            {
                //get rid of inches
                input.next();
                fatherInches *= 12;
                fatherInches += input.nextInt();
            }

            System.out.println("please enter the height of the mother");
            System.out.println("please specify the unit before the value as inches or feet if feet you are required to enter inches too");
            unit = input.next();
            motherInches = input.nextInt();
            if (unit.equals("feet"))
            {
                //get rid of inches
                input.next();
                motherInches *= 12;
                motherInches += input.nextInt();
            }

            if (checkMale(gender))
            {
                System.out.println("The predicted height in inches " + df.format(maleHeight(fatherInches, motherInches)));
            } else
            {
                System.out.println("The predicted height in inches " + df.format(femaleHeight(fatherInches, motherInches)));
            }
        }
    }

    private static double maleHeight(int father, int mother)
    {
        return ((mother * 13.0 / 12.0) + father) / 2.0;
    }

    private static double femaleHeight(int father, int mother)
    {
        return ((father * 12.0 / 13.0) + mother) / 2.0;
    }

    private static boolean checkMale(String gender)
    {
        switch (gender)
        {
            case "male":
                return true;
            case "female":
                return false;
            default:
                System.exit(GENDER_MISMATCH_EXIT_CODE);
        }
        //dummy return statement
        return false;
    }
}
