/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

/**
 * This class is required by the problem 4_2 of the book Absolute Java The class
 * is simple and straight forward. It consists of a fraction (nominator and
 * denominator) It has two essential methods (sauf the get and set)
 *
 * 1) return double value of the fraction 2) return the fraction in reduced
 * terms
 *
 * @author it-el
 */
class Fraction
{

    private int nominator;
    private int denominator;

    public Fraction(int n, int m)
    {
        if (m == 0)
        {
            System.exit(244);
        }

        nominator = n;
        denominator = m;
    }

    public Fraction()
    {
        //considering the default value is 1, 1
        this(1, 1);
    }

    public int getNominator()
    {
        return this.nominator;
    }

    public void setNominator(int n)
    {
        this.nominator = n;
    }
    
    public int getDenominator()
    {
        return this.denominator;
    }
    
    public void setDenominator(int n)
    {
        if(n==0)
            System.exit(0);
        
        this.denominator = n;
    }
    
    public double value()
    {
        return nominator*1.0d/ denominator;
    }
    
    public String getSimlified()
    {
        int gcd = this.GCD();
        
        return  this.nominator/gcd + " / "+ this.denominator/gcd;
    }
    
    private int GCD()
    {
        int n = this.nominator;
        int m = this.denominator;
        
        while(n!=0 && m!=0)
        {
            if(n>m)
                n %=m;
            else if(m>n)
                m%=n;
        }
        
        return n+m;
    }
}
