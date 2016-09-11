/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Objects;

/**
 * This class is required by the problem 4_9 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * This is a simple class Instance variables: 1) name string 2) population
 * integer 3) growth rate integer expressed as 100% (percentage);
 */
class AnimalRecord
{

    private String name;
    private int population;
    private int growthRate;

    public AnimalRecord(String name, int population, int growthRate)
    {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }

    public AnimalRecord()
    {
        this.name = "No Name";
        this.population = 0;
        this.growthRate = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getPopulation()
    {
        return population;
    }

    public int getGrowthRate()
    {
        return growthRate;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }

    public void setGrowthRate(int growthRate)
    {
        this.growthRate = growthRate;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.population;
        hash = 79 * hash + this.growthRate;
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
        final AnimalRecord other = (AnimalRecord) obj;
        if (this.population != other.population)
        {
            return false;
        }
        if (this.growthRate != other.growthRate)
        {
            return false;
        }
        if (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "AnimalRecord{" + "name=" + name + ", population=" + population + ", growthRate=" + growthRate + '}';
    }
    
    public boolean endangered()
    {
        return growthRate<0;
    }
    
    public void yearsPassed(int n)
    {
        this.population = this.population * (int)Math.pow(1+growthRate/100.0, n);
    }
}
