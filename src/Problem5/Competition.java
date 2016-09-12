/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
  This class is used to solve the problem5_4 of the book AbsoluteJava
 * @author it-elias
 * 
 * This class has a String which is the name of the competition
 * a string which is the name of the team who won.
 * int year which is what year did the competition took place.
 */
class Competition
{
    private int year;
    private String name;
    private String winningTeam;
    private Team[] teams;

    public Competition(int year, String name, String winningTeam)
    {
        this.year = year;
        this.name = name;
        this.winningTeam = winningTeam;
    }

    public int getYear()
    {
        return year;
    }

    public String getName()
    {
        return name;
    }

    public String getWinningTeam()
    {
        return winningTeam;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setWinningTeam(String winningTeam)
    {
        this.winningTeam = winningTeam;
    }
    
    
}
