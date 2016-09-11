/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.Scanner;

/**
 * This program is the solution of problem2_10 of the book Absolute Java.
 *
 * @author it-elias
 *
 * Write a program that inputs the name, quantity, and price of three items. The
 * name may contain spaces. Output a bill with a tax rate of 6.25%. All pricess
 * should be output to two decimal places. The bill should be formatted in
 * columns with 30 characters for the name, 10 character for the quantitiy and
 * 10 characters for the price and 10 characters for the total.
 */
public class Problem2_10
{

    public static void main()
    {

        Scanner input = new Scanner(System.in);
        String names[] = new String[3];
        int quantities[] = new int[3];
        double prices[] = new double[3];

        for (int index = 1; index <= 3; index++)
        {

            System.out.println("Input name of item " + index + ":");
            names[index - 1] = input.nextLine();

            System.out.println("Input quantity of item " + index + ":");
            quantities[index - 1] = input.nextInt();

            System.out.println("Input price of item " + index + ":");
            prices[index - 1] = input.nextDouble();
            input.nextLine();
        }
        double total = 0;
        System.out.println("Your BIll");
        System.out.printf("%30s %10s %10s %10s%n", "Item", "Quantitiy", "Price", "Total");

        for (int index = 1; index <= 3; index++)
        {
            double local = prices[index - 1] * quantities[index - 1];
            total += local;
            System.out.printf("%30s %10d %10.2f %10.2f%n", names[index - 1], quantities[index - 1], prices[index - 1], local);
        }

        System.out.println("6.25 sales tax");
        System.out.printf("%50s %10.2f%n", "Total", total * 1.0625);
    }

}
