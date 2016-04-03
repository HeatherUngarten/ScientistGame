/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientistgame;
import java.util.Random;
/**
 *
 * @author hungart
 */
public class CoinFlip 
{    
    
    public static String coinFlip()
    {
       String roll = null;
       Random CoinFlip = new Random();
        int flip = CoinFlip.nextInt(2) +1;
        if (flip == 1)
        {
            roll = "O";                 
        }
        else
        {
            roll = "X";
        }
        return roll;        
    }
    
    
}
