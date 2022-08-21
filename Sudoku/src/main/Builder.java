package main;

import javax.swing.*;
import java.awt.*;

public class Builder{


    protected static CardLayout cardLayout;
    /**
     * Creates new JButton object
     *
     * @return JButton
     **/
    public static JButton createButton(String value) {
        JButton button = new JButton(value);

        button.setPreferredSize(new Dimension(150, 50));
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        button.setForeground(Color.WHITE);
        button.setVisible(true);

        return button;
    }

    private static void  createCardLayout()
    {
        cardLayout =  new CardLayout();
    }

    public static CardLayout getCardLayout(){
        if(cardLayout == null){
            createCardLayout();
        }
        return cardLayout;
    }
}
