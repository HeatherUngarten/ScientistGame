/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientistgame;

/**
 *
 * @author hungart
 */
public class ScientistCards 


{    
    public String name;
    public String field; 
    private String weakness = null;
    private int knowledgeNeeded;
    private int knowledgeNeeded2;
    private String aname1;
    private String aname2;
    private int apoints1;
    private int apoints2;
    private String flip;
    private String imageFileName;

    public Object[] readIn()
    {    
        ScientistCards[] CardArray =  new ScientistCards[15];
        
        String [][] scientists = new String[][] {};
        ScientistsClass array = new ScientistsClass();
        scientists = array.readFile();
        
        //I don't think I need to use set method because ob obj array below
        
        for (int i = 0; i < 15; i++)
        {       
                int c = 0;  
                CardArray[i] = new ScientistCards();
                CardArray[i].name=((scientists[i][c]));
                //setName((scientists[i][c]));
                c++;
                CardArray[i].field = ((scientists[i][c]));
                //setField ((scientists[i][c]));
                c++;
                CardArray[i].knowledgeNeeded = ((Integer.parseInt((scientists[i][c]))));
                //setKnowledge ((Integer.parseInt((scientists[i][c]))));
                c++;
                CardArray[i].aname1 = ((scientists[i][c]));
                //setAName1 ((scientists[i][c]));
                c++;
                CardArray[i].apoints1 = ((Integer.parseInt((scientists[i][c]))));
                //setApoints1((Integer.parseInt((scientists[i][c]))));
                c++;
                CardArray[i].knowledgeNeeded2 = ((Integer.parseInt((scientists[i][c]))));
                //setKnowledge2 ((Integer.parseInt((scientists[i][c]))));
                c++;
                CardArray[i].aname2 = ((scientists[i][c]));
                //setAName2 ((scientists[i][c]));
                c++;
                CardArray[i].apoints2 = ((Integer.parseInt((scientists[i][c]))));
                //setApoints2 ((Integer.parseInt((scientists[i][c]))));
                c++;
                CardArray[i].flip = ((scientists[i][c]));
                
                c++;
                CardArray[i].imageFileName = ((scientists[i][c]));
                //setFlip ((scientists[i][c]));
                
                //System.out.println(CardArray[i].name + " " + CardArray[i].field + " " +CardArray[i].aname1);               
        }  
        
    return CardArray;
    }
}//end class

