/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This problem is the solution of the problem3_7 of the book Absolute Java
 * @author it-elias
 * 
 * The value e^x can be approximated by the following sum
 * Segma(0,n) = x^n/n!
 * 
 * Write a program that takes a value of x as input and outputs this sum for n taken to be
 * each of the values 1 to 10,50, and 100. Your program should repeat the calculation for new values of
 * x until the user syas she or he is through. The expression n! is called the factorial of n and is defined as
 * n! = 1 * 2 * 3 ... * n;
 * 
 * Use varaibles of type double to store the factorials(or arrange your calculation to avoid any direct calculation of factorials);
 * otherwise, you are likely to produce integer oveerfolow, that is integers larger than java allows;
 */
public class Problem3_7
{
    static double[]  factorialMatrix;
    
    /**
     * This program takes only one input which is the x value and outputs the equation represated as the sum
     * of value
     * This program would also compare the result to the real exp(x) function
     */
    public static void main()
    {
        //the first thing to do is to fill the factorial matrix
        fillTheFactorialMatrix();
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        
        boolean answer = true;
        while( answer)
        {
            System.out.println("Please enter the value x");
            double x = input.nextDouble();
            System.out.println(df.format(myExp(x,10)));
            System.out.println(df.format(myExp(x,50)));
            System.out.println(df.format(myExp(x,100)));
            System.out.println(df.format(Math.exp(x)));
            
            
            System.out.println("do You want to continue? true or false");
            answer = input.nextBoolean();
            
        }
    }
    
    /**
     * This method is used in advance to fill the matrix
     */
    public static void fillTheFactorialMatrix()
    {
        //we are trying to fill the matrix once so we will reduce the number of calculations required.
        factorialMatrix = new double[101];
        factorialMatrix[0] = 1;
        for(int i=1; i<101; i++)
            factorialMatrix[i] = factorialMatrix[i-1] * i;
    }
    
    /**
     * This method uses the sequence x^n/n!
     * @param x The double value at which to compute exp(x)
     * @param repetition the number of times to use the sequence
     * @return a double value which is the value of exp(x)
     */
    public static double myExp(double x, int repetition)
    {
        double result = 1 + x;
        double power = x;
        for(int i=2; i<=repetition; i++)
        {
            power *= x;
            result += power / factorialMatrix[i];
        }
        return result;
    }
}
