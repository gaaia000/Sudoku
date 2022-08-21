package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Builder;

import javax.swing.*;
import java.awt.*;
import java.lang.module.ModuleDescriptor;

public class Login implements ComponentInterface {

    private static JPanel component;
    private static Color color = Color.PINK;
    private static CardLayout cardLayout;

    public JPanel getComponent() {
        setup();
        return component;
    }

    //TODO: popravi da dela + dodaj še za: signup, settings, user
    public void setup() {
        // Settings
        GridLayout layout = new GridLayout(3, 1);
         cardLayout = Builder.getCardLayout();
        JButton goBackLogin = Builder.createButton("Back");
        JButton loginPlay = Builder.createButton("Confirm");

        // Build
        component.setLayout(layout);
        component.setBackground(color);
        component.setBackground(Color.PINK);

        //-> label "LOGIN" and BOX2 in the first row
        Box box2 = new Box(BoxLayout.Y_AXIS);
        box2.setOpaque(true);
        JLabel LOGIN = new JLabel("LOGIN");
        box2.add(Box.createVerticalGlue());
        LOGIN.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
        LOGIN.setForeground(Color.WHITE);
        LOGIN.setAlignmentX(Component.CENTER_ALIGNMENT);
        LOGIN.setAlignmentY(Component.CENTER_ALIGNMENT);
        LOGIN.setVisible(true);
        box2.add(LOGIN);
        box2.add(Box.createVerticalGlue());

        //->user login
        JLabel usernameLabel2 = new JLabel("Username: ");
        usernameLabel2.setBounds(10, 20, 80, 25);
        usernameLabel2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        usernameLabel2.setForeground(Color.WHITE);

        JTextField userText2 = new JTextField(20);
        userText2.setBounds(100, 20, 165, 25);
        userText2.setBackground(Color.WHITE);
        userText2.setForeground(Color.BLACK);
        userText2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JLabel passwordLabel2 = new JLabel("Password: ");
        passwordLabel2.setBounds(10, 50, 80, 25);
        passwordLabel2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        passwordLabel2.setForeground(Color.WHITE);

        JPasswordField passwordText2 = new JPasswordField(20);
        passwordText2.setBounds(100, 20, 165, 25);
        passwordText2.setBackground(Color.WHITE);
        passwordText2.setForeground(Color.BLACK);
        passwordText2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        //Box in middle row
        JPanel userLoginBox = new JPanel();
        userLoginBox.setBackground(Color.PINK);

        GridLayout loginGrid = new GridLayout(2, 2);
        userLoginBox.setLayout(loginGrid);

        //-> four smaller boxes for each of the components
        JPanel userL2 = new JPanel();
        userL2.setLayout(new GridBagLayout());
        userL2.setBackground(Color.PINK);


        JPanel userT2 = new JPanel();
        userT2.setLayout(new GridBagLayout());
        userT2.setBackground(Color.PINK);


        JPanel passwordL2 = new JPanel();
        passwordL2.setLayout(new GridBagLayout());
        passwordL2.setBackground(Color.PINK);


        JPanel passwordT2 = new JPanel();
        passwordT2.setLayout(new GridBagLayout());
        passwordT2.setBackground(Color.PINK);

        //TODO popravi da so JLabel blizje okvirju!!!
        loginGrid.setVgap(20);
        loginGrid.setHgap(20);

        userL2.add(usernameLabel2);
        userT2.add(userText2);
        passwordL2.add(passwordLabel2);
        passwordT2.add(passwordText2);

        userLoginBox.add(userL2);
        userLoginBox.add(userT2);
        userLoginBox.add(passwordL2);
        userLoginBox.add(passwordT2);

        usernameLabel2.setVisible(true);
        userText2.setVisible(true);
        passwordLabel2.setVisible(true);
        passwordText2.setVisible(true);

        userL2.setVisible(true);
        userT2.setVisible(true);
        passwordL2.setVisible(true);
        passwordT2.setVisible(true);

        //Box in last row (buttons)
        JPanel buttonLoginBox = new JPanel();
        buttonLoginBox.setBackground(Color.PINK);

        GridLayout bull = new GridLayout(1, 2);
        buttonLoginBox.setLayout(bull);

        //two smaller boxes for each button
        JPanel smallBox2_1 = new JPanel();
        smallBox2_1.setLayout(new GridBagLayout());
        smallBox2_1.setBackground(Color.PINK);

        JPanel smallBox2_2 = new JPanel();
        smallBox2_2.setLayout(new GridBagLayout());
        smallBox2_2.setBackground(Color.PINK);

        //login -> ADDING
        smallBox2_1.add(loginPlay);
        smallBox2_2.add(goBackLogin);
        buttonLoginBox.add(smallBox2_1);
        buttonLoginBox.add(smallBox2_2);

        component.add(box2);
        component.add(userLoginBox);
        component.add(buttonLoginBox);

        box2.setVisible(true);
        userLoginBox.setVisible(true);
        smallBox2_1.setVisible(true);
        smallBox2_2.setVisible(true);
        buttonLoginBox.setVisible(true);
        component.setVisible(true);


    }
}
