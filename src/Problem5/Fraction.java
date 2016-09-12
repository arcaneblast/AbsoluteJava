/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 * this class is used to solve problem2_5 of the book Absolute Java
 * @author it-elias
 * 
 * this class is simple it was only used to create identical method that returns true if two fractions are equals
 * please note i wont be doning checks for the denominator if zero or not
 */
class Fraction
{
    private int nominator;
    private int denominator;

    public Fraction(int nominator, int denominator)
    {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public Fraction()
    {
        this.nominator = 1;
        this.denominator = 1;
    }

    public int getNominator()
    {
        return nominator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setNominator(int nominator)
    {
        this.nominator = nominator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }
    
    public boolean identical(Fraction other)
    {
        return ( (nominator * other.denominator) == (denominator * other.nominator));
    }

    @Override
    public String toString()
    {
        return "Fraction{" + "nominator=" + nominator + ", denominator=" + denominator + '}';
    }
    
}
