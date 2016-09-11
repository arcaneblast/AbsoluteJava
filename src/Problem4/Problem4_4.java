/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Scanner;

/**
 * This class is the solution of problem4_4 of the book AbsoluteJava
 * @author it-elias
 * 
 * Problem:
 * Define a class called BlogEntry that could be used to store an entry for a Web log.
 * The class should have instance variables to store the poster's username, text of the entry, and the 
 * date of the entry using the date class from this chapter. Add
 * a constructor that allows the user of the class to set all instance variables. Also add
 * a method, DisplayEntry, that outputs alll of the instance variables, and another method called get summary
 * that returns the first 10 words from the text(or the entrire text if it is less than 10 words). Test your class fro the main method.
 * 
 * 
 * I will create two classes BlogEntry and the class Date
 */
public class Problem4_4
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the name of the date(day,month,year) the name and the text of the post");
        System.out.println("Please note the name(id) should has no spaces and the text is after the name");
        
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        
        Date date = new Date(year, month, day);
        String name = input.next();
        String text = input.nextLine();
        BlogEntry entry = new BlogEntry(name, text, date);
        
        System.out.println("the blog entry:\n"+ entry);
        System.out.println("The summary:\n"+entry.getSummary());
    }
}
