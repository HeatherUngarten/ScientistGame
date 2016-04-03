/*
 * This class will be all the characteristics of scientists.
 */
package scientistgame;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.StringTokenizer;




public class ScientistsClass 
{
    //variables
    
    Scanner inputFile;
    File file;
    public String name;
    public String fieldOfScience;
    public int points; 
    private String weakness = null;

    
    public void setWeakness()
    {    
        if (fieldOfScience == "Chemistry")
        {
            weakness = "Physics";               
        }

        else if (fieldOfScience == "Physics")
        {
            weakness = "Astronomy";               
        }

        else if (fieldOfScience == "Astronomy")
        {
            weakness = "Biology";               
        }

        else if (fieldOfScience == "Biology")
        {
            weakness = "Chemistry";           
        }
    }//end set weakness 

public static String[][] readFile()
{
    File file;
    String filename = "ScientistList.txt";   
    try 
    {
        file = new File (filename);
        Scanner in = new Scanner(file);
        String str;
        String[][] scientists = {};
        int rows = 15;
        int cols = 10;
        scientists = new String[rows][cols];
        int counter = 0;
        
        while (in.hasNextLine())            
        {
            for (int i = 0; i < rows ; i ++)
            {         
                str = in.nextLine();       
                StringTokenizer strTokenizer = 
                    new StringTokenizer(str.trim(),",");
                 
                    while (strTokenizer.hasMoreTokens())    
                    {    
                        for (int c = 0; c < cols; c++)
                        {                                                      
                            scientists[i][c] = strTokenizer.nextToken().trim();
                            System.out.println(scientists[i][c]);
                        }//end second for loop
                    }//end while inner
            }//outer for 
            counter++;    
        }//end 1st while
        
/*        
        for (int i = 0; i < rows ; i ++)
            {
                for (int c = 0; c < cols; c++)
                {
                    System.out.println("*" + scientists[i][c] + "*\n");
                }
            }
 */    //test for array set up   

        return scientists; 
        
    }//end try

    catch (FileNotFoundException e)
    {
         System.out.println("file not found"); 
         return null;
    }//end catch
      
}//end readfile class

//need to create Scientist objects and store in an array of objects

    
}//end Scientist Class
