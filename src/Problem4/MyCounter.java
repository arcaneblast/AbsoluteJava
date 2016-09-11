/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

/**
 * This class is required by problem4_5 of the book AbsoluteJava
 * @author it-elias
 * 
 * This class is simple
 * only one instance varaible called count (integer)
 * there should be no set but only get
 * there is a reset method and a method to increase
 */
class MyCounter
{
    private int count;

    public int getCount()
    {
        return count;
    }
    
    public void reset()
    {
        this.count = 0;
    }
    
    public void increase()
    {
        this.count++;
    }

    @Override
    public String toString()
    {
        return "MyCounter{" + "count=" + count + '}';
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
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
        final MyCounter other = (MyCounter) obj;
        return this.count == other.count;
    }
    
    
    
}
