/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 * This class is used to solve problem5_1 of the book Absolute java
 * @author it-elias
 * 
 * it has two instance variables
 * the number of hotdogs sold and an id which is a numerical increment id. 
 * the id should not be provided by the user
 */
class HotDogStand
{
    private static int counter = 0;
    private int id =0;
    private static int totalHotDogs = 0;
    private int hotDogsSold;

    public static int getCounter()
    {
        return counter;
    }
    
    public static int getTotal()
    {
        return totalHotDogs;
    }
    public void justSold()
    {
        this.hotDogsSold++;
        HotDogStand.totalHotDogs++;
    }

    public HotDogStand()
    {
        this.id = counter++;
        this.hotDogsSold = 0;
    }

    @Override
    public String toString()
    {
        return "HotDogStand{" + "id=" + id + ", hotDogsSold=" + hotDogsSold + '}';
    }
    
    
    public HotDogStand(int hotDogsSold)
    {
        HotDogStand.totalHotDogs+= hotDogsSold;
        this.id = counter++;
        this.hotDogsSold = hotDogsSold;
    }


    public static int getTotalHotDogs()
    {
        return totalHotDogs;
    }

    public int getHotDogsSold()
    {
        return hotDogsSold;
    }


    public static void setTotalHotDogs(int totalHotDogs)
    {
        HotDogStand.totalHotDogs = totalHotDogs;
    }

    public void setHotDogsSold(int hotDogsSold)
    {
        this.hotDogsSold = hotDogsSold;
    }
    
    
}
