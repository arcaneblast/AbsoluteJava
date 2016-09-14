package Problem5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
//this lass is not required by any problem
public class Solution {

    public static void main() {
        try
        {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            System.setIn(new FileInputStream("test/inputFile.txt"));
                    } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Solution.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.useDelimiter("");
        boolean[][] array = new boolean[n][n];
        for(int i=0; i<n; i++)
            {
            
            input.nextLine();
            for(int j =0; j<n; j++)
                {
                char c = input.next().charAt(0);
                if(c == '.')
                    array[i][j] = true;
                else
                    array[i][j] = false;
            }
        }
        System.out.println(maxCircleDynamic(array,n));
        
        
    }
    
    public static boolean checkAllNeighbors(boolean[][] a,int[][] values, int i, int j, int n, int answer)
        {
         int[] directionx={-1, 0, 1, 0};
        int[] directiony={0, 1, 0, -1};
        int x=0, y=0;
        for(int index=0; index<4; index++)
            {
            x= i + directionx[index];
            y= j + directiony[index];
            
            if( x<0 || y<0 || x>n-1 || y>n -1 )
                return false;
            if(!a[x][y] || values[x][y] < answer)
                return false;
        }
        return true;
    }
    public static int maxCircleDynamic(boolean [][]a, int n)
        {
        int [][]values = new int[n][n];
        
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                if(a[i][j])
                    values[i][j]=0;
                else
                    values[i][j]=-1;
            
        for(int answer=1; answer<=n/2; answer++)
            {
            boolean success = false;
            for(int i=0; i<n; i++)
                {
                    for(int j=0; j<n; j++)
                {
                if(a[i][j] && checkAllNeighbors(a,values,i,j,n,answer-1))
                {
                    success = true;
                    values[i][j] = answer;
                }
            }
            }
            
            if(!success)
                return answer-1;
        }
        return n/2;
    }
    public static int maxCircle(boolean[][] a, int n)
        {
        int max = 0;
        for(int i=0; i<n; i++)
            {
            for(int j=0; j<n; j++)
                {
                int call = tryHere(i,j,a, n);
                if(a[i][j] && call > max)
                    max = call;
            }
        }
        
        return max;
    }
    
    public static int tryHere(int i, int j, boolean[][] a,int n)
        {
        if(a[i][j] == false)
            return -1;
        
        int[] directionx={-1, 0, 1, 0};
        int[] directiony={0, 1, 0, -1};
        
        int[] direction2x = {1,1,-1,-1};
        int[] direction2y = {1,-1,1,-1};
        
        int counter = 0;
        int multiplier = 1;
        int x =0, y =0;
        while(true)
            {
            //for each loop we test arround first by emplementing normal then by non normal.
            for(int index=0; index<4; index++)
              {
                x = i + multiplier * directionx[index];
                y = j + multiplier * directiony[index];
                if(x>n-1 || x<0 || y<0 || y>n-1)
                    return counter;
                else if(!a[x][y])
                    return counter;
            }
            
            counter++;
            
            for(int index=0; index<4; index++)
              {
                x = i + multiplier * direction2x[index];
                y = j + multiplier * direction2y[index];
                if(x>n-1 || x<0 || y<0 || y>n-1)
                    return counter;
                else if(!a[x][y])
                    return counter;
            }
            multiplier++;
            
        }
    }
}