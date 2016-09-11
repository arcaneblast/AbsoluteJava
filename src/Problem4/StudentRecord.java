/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Arrays;

/**
 * This class is required by problem4_6 of the book Absolute Java
 * @author it-elias
 * 
 * this class is simple it has the following marks
 * three quizzes of 10 points;
 * midterm of 100;
 * final of 100;
 */
class StudentRecord
{
    private int[] quizzes;
    private int midTerm;
    private int finalTerm; //used finalTerm in place of final well you know why!
    //I hated their way of defining the total and letter mark!
    
    public static final int TOTAL = 230;
    public int getTotal()
    {
        double sum = 0;
        for(int i=0; i<this.quizzes.length; i++)
            sum+= quizzes[i];
        sum /= 30;
        sum *= 25;
        
        sum += 0.35 * midTerm + 0.4 *finalTerm;
        return (int)sum;
    }
    
    public char getLetterMark()
    {
        int total = getTotal();
        if(total>90)
            return 'A';
        else if(total > 80)
            return 'B';
        else if(total > 70)
            return 'C';
        else if(total > 60)
            return 'D';
        else
            return 'F';
    }
    public StudentRecord(int[] quizzes, int midTerm, int finalTerm)
    {
        this.quizzes = quizzes;
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
    }

    public StudentRecord()
    {
        //here I am going to give random number to avoid input!
        this.quizzes = new int[3];
        quizzes[0] = 5;
        quizzes[1] = 6;
        quizzes[2] = 7;
        this.midTerm = 75;
        this.finalTerm = 90;
    }

    public int[] getQuizzes()
    {
        return quizzes;
    }

    public int getMidTerm()
    {
        return midTerm;
    }

    public int getFinalTerm()
    {
        return finalTerm;
    }

    public void setQuizzes(int[] quizzes)
    {
        this.quizzes = quizzes;
    }

    public void setMidTerm(int midTerm)
    {
        this.midTerm = midTerm;
    }

    public void setFinalTerm(int finalTerm)
    {
        this.finalTerm = finalTerm;
    }

    @Override
    public String toString()
    {
        return "StudentRecord{" + "quizzes=" + quizzes.toString() + ", midTerm=" + midTerm + ", finalTerm=" + finalTerm + '}';
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 83 * hash + Arrays.hashCode(this.quizzes);
        hash = 83 * hash + this.midTerm;
        hash = 83 * hash + this.finalTerm;
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
        final StudentRecord other = (StudentRecord) obj;
        if (this.midTerm != other.midTerm)
        {
            return false;
        }
        if (this.finalTerm != other.finalTerm)
        {
            return false;
        }
        if (!Arrays.equals(this.quizzes, other.quizzes))
        {
            return false;
        }
        return true;
    }
    
    
    
    
}
