/*
 * User Data for the game player
 */
package scientistgame;

import java.util.Random;

/**
 *
 * @author hungart
 */
public class UserData 
{
    String name = "friend";
   
    int userPoints = 0;
    int numOfCards = 0;
    int maxNumOfCards = 7;
    int pointsToInvention = 1000;
    int numInventions = 0;
    int maxInventions = 5; 
    
    
    public Object [] drawCard()
    {
       ScientistCards newDeck = new ScientistCards();
       newDeck.readIn();
        
       Object [] userCards = new Object[]{};
       Random drawCards = new Random();
       
       for (int i= 0; i < 7; i ++)
       {
            int number = drawCards.nextInt(15);
            //userCards[i] =  
       }
       
       return userCards;
    
//functions picks cards
//wins random inventions    
}
}


