/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Scanner;

/**
 * his code is the solution of the problem 1 of the chapter 4 of the book Absolute Java. 
* @author it-elias
* 
* Write a program that outputs the lyrics ofor "Ninety-nine Bottles of Beerr on the Wall". Your program should print the number of bottles in English, not as a number. For example,
* 
* Ninety-nine bottles of beer on the wall,
* Ninety-nine bottles of beer,
* Take one down, pass it around,
* Ninety-eight bottles of beer on the wall.
* 
* One bottle of beer on the wall,
* One bottle of beer,
* Take one down and pass it around,
* Zero bottles of beer on the wall.
* 
* Your program should not use ninety-nine output statements!
* 
* Design your program with a class named BeerSong whose constructor takes an integer parameter that is the number of bottles of beer initially on the wall.
* Ifthe parameter is less than zero, set the number of bottles to zero. Similarly, if the parameter is greater than 99, set the number of bottles to 99. Then make a public method
* called printSong that ouputs all stanzas from the number of the bottles of beer down to zero. Add any additional private methods you need.
 */
public class Problem4_1
{

    private int n;
    /**
     * This code is implementation of the problem above
     * We are going to use a private method that turns a number from 0 to 99 into a string
     * 
     * This program is not the best method to solve this problem because there are special numbers name in english
     * like eleven instead of Onety
     * this cases should be handled as special cases.
     */
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of beers");
        int n = input.nextInt();
        
        Problem4_1 pro = new Problem4_1(n);
        
        pro.writeSong();
    }
    
    public Problem4_1(int n)
    {
        if(n<0)
            n=0;
        else if(n>99)
            n=99;
        this.n = n;
    }
    
    public void writeSong()
    {
        for(int i=this.n; i>=0; i--)
        {
            System.out.println(numberToString(i)+ " bottles of beer on the wall,");
            System.out.println(numberToString(i)+ " bottles of beer");
            if(i!=0) System.out.println("Take one down, pass it around");
        }
    }
    
    private static String numberToString(int n)
    {
        String part1 = "";
        String part2 = "";
        
        String[] names = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        if(n/10 !=0)
            part1 = names[n/10]+"ty-";
       
        if(!part1.equals("") && n%10 !=0)
            part2 = names[n%10];
        else if(part1.equals(""))
            part2 = names[n%10];
        else
        {
            part1 = part1.substring(0, part1.length()-1);
        }
        
        String result = part1 + part2;
        result = Character.toUpperCase(result.charAt(0)) + result.substring(1);
        return result;
    }
}
