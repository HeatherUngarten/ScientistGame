/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientistgame;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hungart
 */
public class UserOnePanel extends JPanel
{
    
    private JPanel user1Panel;
    private  JLabel imageLabel1;
    private  JLabel imageLabel2;
    private  JLabel imageLabel3;
    private  JLabel imageLabel4;
    private  JLabel imageLabel5;
    private  JLabel imageLabel6;
    private  JLabel imageLabel7;
    private  JLabel imageText1;
    private  JLabel imageText2;
    private  JLabel imageText3;
    private  JLabel imageText4;
    private  JLabel imageText5;
    private  JLabel imageText6;
    private  JLabel imageText7;
    String userName;
    private JLabel turnLabel;
    private JButton draw;
    
    public UserOnePanel()
    {
        userName = "User One";
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder(userName));
        setPreferredSize(new Dimension(700, 800));
        buildUser1Panel();
        add(user1Panel);
        //pack();
        setVisible(true);
    }
    
    private void buildUser1Panel()
    {
        user1Panel = new JPanel();
        imageLabel1 = new JLabel();
        user1Panel.add(imageLabel1);
        imageLabel2 = new JLabel();
        user1Panel.add(imageLabel2);
        imageLabel3 = new JLabel();
        user1Panel.add(imageLabel3);
        imageLabel4 = new JLabel();
        user1Panel.add(imageLabel4);
        imageLabel5 = new JLabel();
        user1Panel.add(imageLabel5);
        imageLabel6 = new JLabel();
        user1Panel.add(imageLabel6);
        imageLabel7 = new JLabel();
        user1Panel.add(imageLabel7);
        
        
        imageText1 = new JLabel();
        user1Panel.add(imageText1);
        imageText2 = new JLabel();
        user1Panel.add(imageText2);
        imageText3 = new JLabel();
        user1Panel.add(imageText3);
        imageText4 = new JLabel();
        user1Panel.add(imageText4);
        imageText5 = new JLabel();
        user1Panel.add(imageText5);
        imageText6 = new JLabel();
        user1Panel.add(imageText6);
        imageText7 = new JLabel();
        user1Panel.add(imageText7);

        int cardHeight = 300;
        int cardWidth = 175;
        imageLabel1.setPreferredSize(new Dimension(cardHeight,cardWidth));
        imageLabel2.setPreferredSize(new Dimension(cardHeight,cardWidth));
        imageLabel3.setPreferredSize(new Dimension(cardHeight,cardWidth));
        imageLabel4.setPreferredSize(new Dimension(cardHeight,cardWidth));
        imageLabel5.setPreferredSize(new Dimension(cardHeight,cardWidth));
        imageLabel6.setPreferredSize(new Dimension(cardHeight,cardWidth));
        imageLabel7.setPreferredSize(new Dimension(cardHeight,cardWidth));
         
        //need to pass the card cliccked image here to the 
        String nameofImageFile;
        
        
        //draw a card if give value of the jpg file in aobject
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("Tyson.jpg")
                .getImage().getScaledInstance(175, 300, Image.SCALE_DEFAULT));

        imageLabel1.setIcon(imageIcon);        
        imageLabel2.setIcon(imageIcon);
        imageLabel3.setIcon(imageIcon);        
        imageLabel4.setIcon(imageIcon);
        imageLabel5.setIcon(imageIcon);        
        imageLabel6.setIcon(imageIcon);
        imageLabel7.setIcon(imageIcon);   
        
        imageText1.setText("Hi");
        imageText2.setText("Hi");
        imageText3.setText("Hi");
        imageText4.setText("Hi");
        imageText5.setText("Hi");
        imageText6.setText("Hi");
        imageText7.setText("Hi");
     
    }

    
}
