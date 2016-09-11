/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Scanner;

/**
 * This code is the solution of problem4_7 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * Problem: Write a Temperature clas that has two instance variables: a
 * temperature value (a floating-point number) and a character for the scale,
 * either C for Celsius or F for Fahrenheit. The class should have four
 * constructor methods: one for each instance variable(assume zero degrees if no
 * value is specified and Celisus if no scale is specified), one two parameters
 * for the two instance variables, and no-arguemnt constructor set to zero
 * degrees Celsius). Include the following: 1) two accessor to return the
 * degrees Fahrenheit and Celisous, the other to return the values in either C
 * of F use the following formula and round it to the nearest tenth of a degree:
 * DegreesC = 5(F - 32)/9 F = (9C/5) + 32;
 *
 * (2) three mutator methods: one to set the value, one to set the scale F or C
 * and one to set both. (3) three comparision methods: equals is greater or less
 * (4) a suitable tostring. Then write a driver program (a test program) that
 * tests all the methods. Be sure to use each of the constructors, to include at
 * least one true and one false case for each of the comparision methods, an to
 * test at least the following temperature equalities: 0C = 32F -40C = -40F 100C
 * = 212F
 *
 * This problem would have to use the class temperature
 */
public class Problem4_7
{

    public static void main()
    {

        Scanner input = new Scanner(System.in);
        Temperature temperature = new Temperature(50, true);
        System.out.println(temperature);
        
        if(new Temperature(0,true).equals(new Temperature(32.0, false)))
            System.out.println("test 1 pass");
        
        if(new Temperature(-40.0,true).equals(new Temperature(-40.0, false)))
            System.out.println("test 2 pass");
        
        if(new Temperature(100.0,true).equals(new Temperature(212.0, false)))
            System.out.println("test 3 pass");

    }

}
