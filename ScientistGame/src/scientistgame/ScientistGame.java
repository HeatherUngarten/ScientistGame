/*
 * Heather and Noah Ungarten Design
 * and open the template in the editor.
 * This is the class to run the whole program.
 */
package scientistgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hungart
 */

public class ScientistGame 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Coin Flip:  " + CoinFlip.coinFlip() + "\n");     
        ScientistCards newDeck = new ScientistCards();
        newDeck.readIn();
        
        new GameBoard();      
        
        //readFile();
    }//end main
    
    
    
    
}//end public class ScientistGame
