/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Objects;
import java.util.StringTokenizer;

/**
 * This class uses the class Date to solve problem4_4 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * This class has three instance variables String the name of the poster Date
 * the date of the post String the text of the entry.
 *
 */
public class BlogEntry
{

    private String name;
    private String text;
    private Date date;

    public BlogEntry(String name, String text, Date date)
    {
        this.name = name;
        this.text = text;
        this.date = date;
    }

    public String getName()
    {
        return name;
    }

    public String getText()
    {
        return text;
    }

    public Date getDate()
    {
        return date;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.text);
        hash = 79 * hash + Objects.hashCode(this.date);
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
        final BlogEntry other = (BlogEntry) obj;
        if (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        if (!Objects.equals(this.text, other.text))
        {
            return false;
        }
        if (!Objects.equals(this.date, other.date))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "BlogEntry{" + "name=" + name + ", text=" + text + ", date=" + date + '}';
    }

    public String getSummary()
    {
        StringTokenizer st = new StringTokenizer(text);
        
        int i =0;
        String result = "";
        while(st.hasMoreTokens() && i<=10)
        {
            i++;
            result += st.nextToken();
            result += " ";
        }
        
        return result;
    }
}
