/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Scanner;

/**
 * This class is the solution of problem4_5 of the book AbsoluteJava
 * @author it-elias
 * 
 * Define a class called counter whose objects count things. An object of this class records
 * a count that is a nonnegative integer. Include methods to set the counter to 0, to increase the
 * count by 1, and to decrease the count by 1.  Be sure that no method allows the value of the counter to become negative.
 * Include an accessor method that reurns the current count value and a method that outputs the count to the screen.
 * There should be no input method or other mutator methods.
 * the only method that can set the counter is the one that sets it to 0.
 * Also include a toString method and an equals method.
 * 
 * Write a program that test your class.
 * 
 * In short the class should be able to perform the basic functions of a counter.
 * I will create this class in a seperate java class file.
 */
public class Problem4_5
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        
        MyCounter count = new MyCounter();
        
        for(int i=0; i<10; i++)
            count.increase();
        
        System.out.println(count);
        count.reset();
        count.increase();
        System.out.println(count);
    }
}
