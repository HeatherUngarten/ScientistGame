/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientistgame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GameSpacePanel extends JPanel
{
    private JPanel GameSpacePanel;
    private  JLabel imageLabel1;
    private  JLabel imageLabel2;
    
    public GameSpacePanel()
    {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Active Cards"));
        buildGameSpacePanel();
        add(GameSpacePanel, BorderLayout.CENTER);
        //pack();
        setVisible(true);
    }
    
    private void buildGameSpacePanel()
    {
        GameSpacePanel = new JPanel();
        imageLabel1 = new JLabel();
        GameSpacePanel.add(imageLabel1);
        imageLabel2 = new JLabel();
        GameSpacePanel.add(imageLabel2);
        int cardHeight = 500;
        int cardWidth = 400;
        imageLabel1.setPreferredSize(new Dimension(cardHeight,cardWidth));
        imageLabel2.setPreferredSize(new Dimension(cardHeight,cardWidth));
         
        //need to pass the card cliccked image here to the 
        String nameofImageFile;
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("Tyson.jpg")
                .getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT));

        imageLabel1.setIcon(imageIcon);
        
        imageLabel2.setIcon(imageIcon);
        
    }


    
}
