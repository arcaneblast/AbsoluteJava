/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

/**
 * This class is used to solve problem4_7 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * This class is straightforward and have two instance Variables boolean
 * isCelsius which returns true in case of C and false of F double degree: which
 * is the temperature without units. the units would be defined using the
 * boolean.
 *
 * 1)it has 4 constructors (based on my implementation it was only possible to
 * add three) 
 * 2)and accessors of both units. 
 * 3)mutator of both units
 * 4)comparable and equals
 *
 * Please note I am going to use the doubleerface comparable to implement this
 * instead of doing stupid methods
 */
class Temperature implements Comparable<Temperature>
{

    private double degree;
    private boolean isCelsius;

    public Temperature(double degree, boolean isCelsius)
    {
        this.degree = degree;
        this.isCelsius = isCelsius;
    }

    public Temperature(double degree)
    {
        this.degree = degree;
        this.isCelsius = true;
    }

    public Temperature()
    {
        this.degree = 0;
        this.isCelsius = true;
    }

    public double getDegree()
    {
        return degree;
    }

    public boolean isIsCelsius()
    {
        return isCelsius;
    }

    public void setDegree(double degree)
    {
        this.degree = degree;
    }

    public void setIsCelsius(boolean isCelsius)
    {
        this.isCelsius = isCelsius;
    }

    public double getCelsiuis()
    {
        if (isCelsius)
        {
            return degree;
        } else
        {
            double result = 5.0 * (degree - 32) / 9;
            result = Math.round(result * 10);
            return result / 10.0;
        }
    }

    public double getFahrenheit()
    {
        if (!isCelsius)
        {
            return degree;
        } else
        {
            double result = 9.0 * (degree /5.0) +32;
            result = Math.round(result * 10);
            return result / 10.0;
        }
    }
    
    public void setFahrenheit(double degree)
    {
        this.isCelsius = false;
        this.degree = degree;
    }
    
    public void setCelsiuis(double degree)
    {
        this.isCelsius = true;
        this.degree = degree;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.degree) ^ (Double.doubleToLongBits(this.degree) >>> 32));
        hash = 47 * hash + (this.isCelsius ? 1 : 0);
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
        final Temperature other = (Temperature) obj;
        double degree1 = this.getCelsiuis();
        double degree2 = other.getCelsiuis();
        return Double.doubleToLongBits(degree1) == Double.doubleToLongBits(degree2);
    }

    @Override
    public String toString()
    {
        return "Temperature{" + "degree=" + degree + ", isCelsius=" + isCelsius + '}';
    }
    
    
    
    
    @Override
    public int compareTo(Temperature o)
    {
        double degree1 = this.getCelsiuis();
        double degree2 = this.getCelsiuis();
        if(Math.abs(degree1-degree2) < 0.0001)
            return 0;
        else if( degree1 > degree2)
            return 1;
        else
            return -1;
    }

}
