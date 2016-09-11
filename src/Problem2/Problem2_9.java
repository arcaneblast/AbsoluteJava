/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.util.Scanner;

/**
 * This code is the solution of problem2_9 of the book Absoute Java
 *
 * @author it-el Write a program that reads a line of text and then outputs that
 * line of text with the all occurences of the world hate hanged to love.
 */
public class Problem2_9
{

    public static void main()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your text and end with the world exit");
        
        while(true)
        {
            String line = input.nextLine();
            if(line.contains("exit"))
                break;
            
            System.out.println(changeHateToLove(line));
        }
        
        System.out.println("Fin!");
    }

    public static String changeHateToLove(String line)
    {
        int index = line.indexOf("hate");
        while (index >= 0)
        {
            line = line.substring(0, index) + "love" + line.substring(index+4);
            //search for the next instance
            index = line.indexOf("hate");
        }
        
        return line;
    }
}
