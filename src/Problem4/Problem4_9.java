/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Scanner;

/**
 * This code is the solution of problem4_9 of the book AbsoluteJava
 * @author it-elias
 * 
 * Problem:
 * Define a class whose objects are records on animal species. The class should have instance
 * variables for the species name, population and the growth rate. The groth
 * rate is a percentage that can be positive or negative and can exceed 100%. Include a suitable collection
 * of constructors, mutator methods, and accessor methods.
 * Include tostring method and an equal method. Include a boolean balued method named endagered that returns true
 * when the growth rate is negative and returns false otherwise.
 * Write a test program (or programs) that tets each method in your clas definition.
 * 
 * for this problem I will create the class AnimalRecord
 */
public class Problem4_9
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        AnimalRecord ar = new AnimalRecord("SeaMonkey", 30, 200);
        System.out.println(ar);
        ar.yearsPassed(3);
        System.out.println(ar);
    }
}
