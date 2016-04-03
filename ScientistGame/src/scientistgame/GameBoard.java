
package scientistgame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author hungart
 */
public class GameBoard extends JFrame
{
    private GreetingPanel banner;
    private UserOnePanel user1Screen;
    private GameSpacePanel GameSpace;
    private UserTwoPanel user2Screen;
    private FooterPanel footer;
    private JPanel buttonPanel;
    
    private final int WINDOW_WIDTH = 1500;
    private final int WINDOW_HEIGHT = 750;
           

    public GameBoard()
    {        
        setTitle("Noah's and Mom's Scientist Game");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        setLayout(new BorderLayout());
        
        buildButtonPanel();
        
        banner = new GreetingPanel();
        user1Screen = new UserOnePanel();
        GameSpace = new GameSpacePanel();
        user2Screen = new UserTwoPanel();
        footer = new FooterPanel();
        
        //add(banner, BorderLayout.NORTH);
        add(user1Screen, BorderLayout.WEST);
        add(GameSpace, BorderLayout.CENTER);
        //add(user2Screen , BorderLayout.EAST);
        //add(footer, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);

        
    }

    private void buildButtonPanel()
            
    {
        buttonPanel = new JPanel();      
    }
    
   
    
//click enter
                    //when start is clicked each user gets 7 cards rom the deck
                    //each user gets 6 invention cards (prize cards)
                    //A coin is flipped and if heads user 1 goes first and tails user2 goes first
                    //and a person to start is randomly selected.
                    
}
