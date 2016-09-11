/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

/**
 * this class is required by the problem4_3 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * This class has the following instance variables double miles: the number of
 * miles taken so far double rate: the rate of miles/gallons
 *
 * It has a set and get for each one of the instance variables above and in
 * addition: 1) reset: set the milage to zero. 2) addMiles: add a trip in miles
 * to the miles counter 3) getNumberOfGallons: return the number of gallons
 * consumed (total) since last reset.
 
 * ofcourse there are a lot of checks that could be done in this class.
 * Like for example checking the number of miles to be positive.
 * I only did the first type of check
 */
class Odometer
{

    private double miles;
    private double rate;

    private void checkRate(double rate) throws Exception
    {
        if (rate == 0)
        {
            throw new Exception("rate should not be zero unless super green car!");
        }
    }

    public Odometer(double miles, double rate) throws Exception
    {
        this.miles = miles;
        checkRate(rate);
        this.rate = rate;
    }

    public Odometer() throws Exception
    {
        //we consider the default being 1,1
        this(1, 1);
    }

    public double getMiles()
    {
        return miles;
    }

    public double getRate()
    {
        return rate;
    }

    public void setMiles(double miles)
    {
        this.miles = miles;
    }

    public void setRate(double rate) throws Exception
    {
        checkRate(rate);
        this.rate = rate;
    }
    
    //reset method
    public void reset()
    {
        this.miles = 0;
    }
    
    //numberofgallons
    public int getNumberOfGallons()
    {
        return (int) (this.miles * 1.0/rate);
    }
    
    //addmiles
    public void addMiles(double miles)
    {
        this.miles += miles;
    }
}
