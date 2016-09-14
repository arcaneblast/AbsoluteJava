/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 * This class is used to solve Problem5_5
 * @author it-elias
 * 
 * This is a simple class. It has two integer variables for the number of cents
 * and the number of dollars
 * it has multiple stuff like add and minus
 * equals and toString and multiple constructors
 */
public class Money
{
    private int dollars;
    private int cents;

    public Money(int dollars, int cents)
    {
        this.dollars = dollars;
        this.cents = cents;
        fixCents();
    }

    public Money(int dollars)
    {
        this.dollars = dollars;
    }

    public Money()
    {
    }

    public int getDollars()
    {
        return dollars;
    }

    public int getCents()
    {
        return cents;
    }
    
    private void fixCents()
    {
        int result = cents / 100;
        cents %= 100;
        dollars += result;
    }
    
    public void addMoney(int dollars, int cents)
    {
        this.dollars += dollars;
        this.cents += cents;
        fixCents();
    }
    
    public void minusMoney(int dollars, int cents)
    {
        this.dollars -= dollars;
        this.cents -= cents;
        //Please note that here the sum could be negative. liabilities
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 97 * hash + this.dollars;
        hash = 97 * hash + this.cents;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Money other = (Money) obj;
        if (this.dollars != other.dollars)
        {
            return false;
        }
        if (this.cents != other.cents)
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Money{" + "dollars=" + dollars + ", cents=" + cents + '}';
    }
    
    public void add(Money m)
    {
        this.addMoney(m.dollars, m.cents);
    }
    
}
