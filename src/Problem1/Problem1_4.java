/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 * This class was created to solve the problem number 4 of chpater 1 of the book
 * Absolute java
 *
 * @author it-elias
 *
 * A government research lab has concluded that an artificial sweetener commonly
 * used in diet soda pop will cause death in laboratory mice. A friend of yours
 * is desperate to lose weight but cannot give up soda pop Your friend wants to
 * know how much diet soda pop it is possible to drink without dying as a
 * result. Write a program to supply the answer The program has no input but
 * does have a defined constant for the following items: the amount of
 * artificial sweetener needed to kill a mouse, the weight of the mouse, the
 * starting weight of the dieter, and the desired weight of the dieter. To
 * ensure the safety of your friend, be sure the program uses the weight at
 * which the dieter will stop dieting, rather than the dieter's current weight,
 * to calculate how much soda pop the dieter can safely drink. You may use any
 * reasonable values for these defined constants. Assume that diet soda contains
 * 1/10th of 1% aritificial sweetener. Use another named constant for this
 * fraction. You may want to express the perccent as the double value 0.001. (If
 * your program turns out not to use a defined constant, you may remove that
 * defined constant from your program.)
 */
public class Problem1_4
{

    public static final double SWEETNER_PERCENTAGE_IN_COKE = 0.001;
    public static final double COKE_VOLUME = 333.4; //IMAGINED
    /**
     * This is the implementation of the problem above
     * I think the problem is not very well defined
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        //vars
        double sweetnerKillMouse = 0, mouseWeight = 0, startWeight = 0, endWeight = 0;
        
        System.out.println("Please enter the following values in double");
        System.out.println("sweetnerKillMouse, mouseWeight startWeight, endWeight");
        sweetnerKillMouse = input.nextDouble();
        mouseWeight = input.nextDouble();
        startWeight = input.nextDouble();
        endWeight = input.nextDouble();
        
        //we are going to use the end Weight as a safety measure (suggested in the problem description)
        double sweetnerToKillPerson = sweetnerKillMouse * endWeight / mouseWeight;
        double sweetnerInOneCoke = SWEETNER_PERCENTAGE_IN_COKE * COKE_VOLUME;
        
        int maxNumberOfCoke = (int) Math.round(sweetnerToKillPerson / sweetnerInOneCoke);
        
        System.out.println("Please drink less than " + maxNumberOfCoke);
    }

}
