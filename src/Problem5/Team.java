/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 * This class is used in solving Problem5_4 of the book AbsoluteJava
 * @author it-elias
 * 
 * This class (Team) has the following:
 * int n : number of members;
 * String array the names of the members;
 * string the name of the team
 * 
 * Make sure that the copyconstructor would return a deep copy.
 */
class Team
{
    private String name;
    private String[] memberNames;
    private int n;

    public Team(String name, String[] memberNames, int n)
    {
        this.name = name;
        //deep copy
        this.n = n;
        memberNames = new String[n];
    }
    
    
}
