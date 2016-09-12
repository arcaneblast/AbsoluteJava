/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 * This code is the solution of problem5_1 of the book AbsoluteJava
 * @author it-elias
 * 
 * problem:
 * You operate several hot dog stands distributed throughout twon. Define a class named HotDogStand that has an instance
 * variable for the hotdog stand's id number and an instance variable for how many hotdogs the stand has sold that day.
 * Create a constructor that allows a user of the class to initialize both variables.
 * 
 * Also create a method named justSold that increments by one the number of hotdogs the stand has sold. The idea is that this method will be
 * invoked each time the stand sells a hotdog so that you can track the total number of hotdogs sold by the stand. Add
 * anoterh method that returns the number of hoddogs sold.
 * 
 * Finally, add a static variable that tracks the total number of hotdogs sold by all hot dog stands and a static method that returns the value in this variable.
 * 
 * Write a main method to test your class with at least three hodog stands that each sell a variety of hotdogs.
 */
public class Problem5_1
{

    /**
     * This class would have to use the other class named HotDogStand which could be used in conjunction to
     * the following
     */
    public static void main()
    {
        //the input method would be random
        HotDogStand[] a = new HotDogStand[3];
        
        for(int i=0; i<3; i++)
        {
            a[i] = new HotDogStand();
            int sales = (int)(Math.random() * 10);
            for(int j=0; j<sales; j++)
                a[i].justSold();
            
        }
        
        for(int i=0; i<3; i++)
        {
            System.out.println( i + " " + a[i]);
        }
        
        System.out.println(HotDogStand.getTotalHotDogs());
    }
}
