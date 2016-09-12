/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 * this class is used to solve problem 5_3 of the book AbsoluteJava
 * @author it-elias
 * 
 * This class is simple it has wether the man is dead or not.
 * the probability of hit
 */
class Duelist
{
    private int rate;
    private boolean alive;

    public Duelist(int rate, boolean alive)
    {
        this.rate = rate;
        this.alive = alive;
    }

    public int getRate()
    {
        return rate;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public void kill()
    {
        this.alive = false;
    }
    
    public void rebirth()
    {
        this.alive = true;
    }
    @Override
    public String toString()
    {
        return "Duelist{" + "rate=" + rate + ", alive=" + alive + '}';
    }
    
    public boolean hitOrMiss()
    {
        double d = Math.random();
        if(100-this.rate <= d* 100)
            return true;
        return this.rate == 100;
    }
    
}
