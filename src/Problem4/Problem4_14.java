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
 * This code is the soluiton of problem 4_14 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * A comma-seperated values (CSV) file is a simple text format used to store a
 * list of records. A comma is used as a delimiter to separate the fields for
 * each record. This format is commonly used to transfer data between a
 * spreadsheet or database. In this programming project, consider a store that
 * selss five products abbreviated as AB,C,D,E. Customers can rate each product
 * from 1-5 where 1 is low and 5 is hight. The ratings are stored in a CSV file
 * where each row contains the customer's rating for each product. Here is a
 * sample file with three customers ratings: A,B,C,D,E 3,0,5,1,2 1,1,4,2,1
 * 0,0,5,1,3 In this format, the first line gives the products. The digit 0
 * indicates that a customer did not rate a product. In this case, the first
 * customer rated A as 3, C as 5 and D 1 and E 2. 0 means that the product was
 * not rated.
 *
 * Createa text file in this format with sample ratings. Then, write a program
 * that reads in this text file and extracts each rating using the
 * StringTokenizer class. Finally the program should output the average rating
 * for each product. Customers that did not rate the product should not be
 * considered when computeing the average rating for that product. Your program
 * can assume there will always be exactly five products but it should work with
 * an arbitrary number of customers ratings.
 *
 */
public class Problem4_14
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
    }
}