/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

/**
 * This class is requited by the class BlogEntry of the problem4_4
 * @author it-elias
 * 
 * This is a simple class that do not even checks for wrong input of date.
 */
public class Date
{
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear()
    {
        return year;
    }

    @Override
    public String toString()
    {
        return day + "/"+ month+"/" + year;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        else if(obj.getClass() != this.getClass())
            return false;
        
        Date other = (Date) obj;
        
        return this.day == other.day && this.month == other.month && this.year == other.year;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 29 * hash + this.year;
        hash = 29 * hash + this.month;
        hash = 29 * hash + this.day;
        return hash;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }
    
    
}
