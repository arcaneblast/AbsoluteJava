/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This code is the solution for problem2_14 of the book Absolute Java
 *
 * @author it-elias
 *
 * 10 grams of caffeine consumed at one time is a lethal overdose. Write two
 * programs to compute how many drinks it takes to kill a person.
 *
 * The first program should input the name of the drink and the number of
 * milligrams of caffeine in the drink. It should then output the drink name and
 * the number of drinks it takes to kill a person. For example, if the user
 * enters "coffe" and 160 then the program should output "it will take
 * approximately 62.5 drinks of coffe to kill a person from caffeine.
 *
 * The second program should have the same thing but reads its input from a file
 * since the second program is harder I will do the second program only.
 */
public class Problem2_14
{

    /**
     * the lethal does of caffeine estimated in mg
     */
    public static final int CAFFEINE_LETHAL_DOSE = 10000;

    /**
     * Implementation of the problem above and it takes its input from a file
     * named drinks.txt in the test directory
     */
    public static void main()
    {
        try
        {
            Scanner input = new Scanner(new File("test/drinks.txt"));
            while (input.hasNextLine())
            {
                String name = input.nextLine();
                int caffeine = input.nextInt();

                if (input.hasNextLine())
                //clear input 
                {
                    input.nextLine();
                }

                DecimalFormat formatter = new DecimalFormat("##.## cups");
                System.out.println("The beverage " + name + "needs " + formatter.format(cupsToKill(caffeine)));
            }
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Problem2_14.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * determines the number of cups to kill a person from caffeine.
     *
     * @param caffeine the mg of caffeine in beverage
     * @return the double number of cups to kill
     */
    public static double cupsToKill(int caffeine)
    {
        return CAFFEINE_LETHAL_DOSE / (1.0 * caffeine);
    }
}
