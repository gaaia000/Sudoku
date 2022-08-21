import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sudoku_Cards{

    JFrame frame = new JFrame("Try yourself");

    JPanel panelCont = new JPanel();
    JPanel panelUser = new JPanel();
    JPanel signUp = new JPanel();
    JPanel login = new JPanel();

    JPanel settings = new JPanel();
    JPanel play = new JPanel();
    CardLayout cl = new CardLayout();
    GridLayout gl1 = new GridLayout(3,1);
    GridLayout gl2 = new GridLayout(3,1);


    public Sudoku_Cards(){

        //ALL BUTTONS
        JButton buttonSignup = new JButton("Sign up");
        JButton buttonLogin = new JButton("Login");

        JButton signupPlay = new JButton("Confirm");
        JButton loginPlay = new JButton("Confirm");

        JButton goBackSignup = new JButton("Back");
        JButton goBackLogin = new JButton("Back");
        JButton goBackSettings = new JButton("Back");
        JButton goBackPlay = new JButton("Back");

        //LAYOUTS
        panelCont.setLayout(cl);
        signUp.setLayout(gl1);
        gl1.setVgap(20);
        gl1.setHgap(20);
        login.setLayout(gl2);
        gl2.setVgap(20);
        gl2.setHgap(20);

        //MENU - USER
        panelUser.setBackground(Color.PINK);

        GridLayout menu = new GridLayout(3,1);
        panelUser.setLayout(menu);
        menu.setVgap(20);
        menu.setHgap(20);

        JLabel empty = new JLabel();
        panelUser.add(empty);

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.PINK);

        GridLayout mP = new GridLayout(1,2);
        menuPanel.setLayout(mP);

        JPanel smallPanel1 = new JPanel();
        smallPanel1.setLayout(new GridBagLayout());
        smallPanel1.setBackground(Color.PINK);
        smallPanel1.add(buttonSignup);

        JPanel smallPanel2 = new JPanel();
        smallPanel2.setLayout(new GridBagLayout());
        smallPanel2.setBackground(Color.PINK);
        smallPanel2.add(buttonLogin);

        mP.setVgap(20);
        mP.setHgap(10);

        menuPanel.add(smallPanel1);
        menuPanel.add(smallPanel2);
        panelUser.add(menuPanel);

        menuPanel.setVisible(true);
        smallPanel1.setVisible(true);
        smallPanel2.setVisible(true);
        buttonLogin.setVisible(true);
        buttonSignup.setVisible(true);

        //buttons customization
        buttonSignup.setPreferredSize(new Dimension(150,50));
        buttonSignup.setBackground(Color.BLACK);
        buttonSignup.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        buttonSignup.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        buttonSignup.setForeground(Color.WHITE);

        buttonLogin.setPreferredSize(new Dimension(150,50));
        buttonLogin.setBackground(Color.BLACK);
        buttonLogin.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        buttonLogin.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        buttonLogin.setForeground(Color.WHITE);

        //SIGNUP
        signUp.setBackground(Color.PINK);

        //-> label "SIGN UP" and BOX1 in the first row
        Box box1 = new Box(BoxLayout.Y_AXIS);
        box1.setOpaque(true);
        JLabel SIGNUP = new JLabel("SIGN UP");
        box1.add(Box.createVerticalGlue());
        SIGNUP.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
        SIGNUP.setForeground(Color.WHITE);
        SIGNUP.setAlignmentX(Component.CENTER_ALIGNMENT);
        SIGNUP.setAlignmentY(Component.CENTER_ALIGNMENT);
        SIGNUP.setVisible(true);
        box1.add(SIGNUP);
        box1.add(Box.createVerticalGlue());

        //-> user signup
        JLabel usernameLabel1 = new JLabel("New username: ");
        usernameLabel1.setBounds(10,20,80,25);
        usernameLabel1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        usernameLabel1.setForeground(Color.WHITE);

        JTextField userText1 = new JTextField(20);
        userText1.setBounds(100,20,165,25);
        userText1.setBackground(Color.WHITE);
        userText1.setForeground(Color.BLACK);
        userText1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JLabel passwordLabel1 = new JLabel("New password: ");
        passwordLabel1.setBounds(10,50,80,25);
        passwordLabel1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        passwordLabel1.setForeground(Color.WHITE);

        JPasswordField passwordText1 = new JPasswordField(20);
        passwordText1.setBounds(100,20,165,25);
        passwordText1.setBackground(Color.WHITE);
        passwordText1.setForeground(Color.BLACK);
        passwordText1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        //Box in middle row
        JPanel userBox = new JPanel();
        userBox.setBackground(Color.PINK);

        GridLayout user = new GridLayout(2,2);
        userBox.setLayout(user);

        //-> four smaller boxes for each of the components
        JPanel userL = new JPanel();
        userL.setLayout(new GridBagLayout());
        userL.setBackground(Color.PINK);


        JPanel userT = new JPanel();
        userT.setLayout(new GridBagLayout());
        userT.setBackground(Color.PINK);


        JPanel passwordL = new JPanel();
        passwordL.setLayout(new GridBagLayout());
        passwordL.setBackground(Color.PINK);


        JPanel passwordT = new JPanel();
        passwordT.setLayout(new GridBagLayout());
        passwordT.setBackground(Color.PINK);

        //TODO popravi da so JLabel blizje okvirju!!!
        user.setVgap(50);
        user.setHgap(5);

        userL.add(usernameLabel1);
        userT.add(userText1);
        passwordL.add(passwordLabel1);
        passwordT.add(passwordText1);

        userBox.add(userL);
        userBox.add(userT);
        userBox.add(passwordL);
        userBox.add(passwordT);

        usernameLabel1.setVisible(true);
        userText1.setVisible(true);
        passwordLabel1.setVisible(true);
        passwordText1.setVisible(true);

        userL.setVisible(true);
        userT.setVisible(true);
        passwordL.setVisible(true);
        passwordT.setVisible(true);

        //Box in last row (buttons)
        JPanel buttonBox = new JPanel();
        buttonBox.setBackground(Color.PINK);

        GridLayout buttons = new GridLayout(1,2);
        buttonBox.setLayout(buttons);

        //two smaller boxes for each button
        JPanel smallBox1_1 = new JPanel();
        smallBox1_1.setLayout(new GridBagLayout());
        smallBox1_1.setBackground(Color.PINK);

        JPanel smallBox1_2 = new JPanel();
        smallBox1_2.setLayout(new GridBagLayout());
        smallBox1_2.setBackground(Color.PINK);

        //buttons customization
        signupPlay.setPreferredSize(new Dimension(150,50));
        signupPlay.setBackground(Color.BLACK);
        signupPlay.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        signupPlay.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        signupPlay.setForeground(Color.WHITE);

        goBackSignup.setPreferredSize(new Dimension(150,50));
        goBackSignup.setBackground(Color.BLACK);
        goBackSignup.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        goBackSignup.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        goBackSignup.setForeground(Color.WHITE);

        //signup -> ADDING
        //(box.add(SUDOKU); ) ->zgoraj, ker drugače ne dela :)
        smallBox1_1.add(signupPlay);
        smallBox1_2.add(goBackSignup);
        buttonBox.add(smallBox1_1);
        buttonBox.add(smallBox1_2);

        signUp.add(box1);
        signUp.add(userBox);
        signUp.add(buttonBox);

        box1.setVisible(true);
        userBox.setVisible(true);
        smallBox1_1.setVisible(true);
        smallBox1_2.setVisible(true);
        buttonBox.setVisible(true);
        signUp.setVisible(true);

        //LOGIN
        login.setBackground(Color.PINK);

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
        usernameLabel2.setBounds(10,20,80,25);
        usernameLabel2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        usernameLabel2.setForeground(Color.WHITE);

        JTextField userText2 = new JTextField(20);
        userText2.setBounds(100,20,165,25);
        userText2.setBackground(Color.WHITE);
        userText2.setForeground(Color.BLACK);
        userText2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JLabel passwordLabel2 = new JLabel("Password: ");
        passwordLabel2.setBounds(10,50,80,25);
        passwordLabel2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        passwordLabel2.setForeground(Color.WHITE);

        JPasswordField passwordText2 = new JPasswordField(20);
        passwordText2.setBounds(100,20,165,25);
        passwordText2.setBackground(Color.WHITE);
        passwordText2.setForeground(Color.BLACK);
        passwordText2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        //Box in middle row
        JPanel userLoginBox = new JPanel();
        userLoginBox.setBackground(Color.PINK);

        GridLayout loginGrid = new GridLayout(2,2);
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

        GridLayout bull = new GridLayout(1,2);
        buttonLoginBox.setLayout(bull);

        //two smaller boxes for each button
        JPanel smallBox2_1 = new JPanel();
        smallBox2_1.setLayout(new GridBagLayout());
        smallBox2_1.setBackground(Color.PINK);

        JPanel smallBox2_2 = new JPanel();
        smallBox2_2.setLayout(new GridBagLayout());
        smallBox2_2.setBackground(Color.PINK);

        //buttons customization
        loginPlay.setPreferredSize(new Dimension(150,50));
        loginPlay.setBackground(Color.BLACK);
        loginPlay.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        loginPlay.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        loginPlay.setForeground(Color.WHITE);

        goBackLogin.setPreferredSize(new Dimension(150,50));
        goBackLogin.setBackground(Color.BLACK);
        goBackLogin.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        goBackLogin.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        goBackLogin.setForeground(Color.WHITE);

        //login -> ADDING
        smallBox2_1.add(loginPlay);
        smallBox2_2.add(goBackLogin);
        buttonLoginBox.add(smallBox2_1);
        buttonLoginBox.add(smallBox2_2);

        login.add(box2);
        login.add(userLoginBox);
        login.add(buttonLoginBox);

        box2.setVisible(true);
        userLoginBox.setVisible(true);
        smallBox2_1.setVisible(true);
        smallBox2_2.setVisible(true);
        buttonLoginBox.setVisible(true);
        login.setVisible(true);

        //- -> settings
        settings.setBackground(Color.PINK);
        settings.add(goBackSettings);
        //- - -> play
        play.setBackground(Color.BLACK);
        play.add(goBackPlay);


        //ADDING
        panelCont.add(panelUser, "1");
        panelCont.add(signUp, "2");
        panelCont.add(login, "3");
        panelCont.add(settings, "4");
        panelCont.add(play, "5");
        cl.show(panelCont, "1");


        //ACTIONS
        buttonSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { cl.show(panelCont, "2");
            }
        });
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { cl.show(panelCont, "3");
            }
        });
        goBackSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCont, "1");
            }
        });
        goBackLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCont, "1");
            }
        });
        loginPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCont, "4");
            }
        });
        goBackSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCont, "3");
            }
        });
        goBackPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCont, "4");
            }
        });



        //FRAME
        this.frame.setPreferredSize(new Dimension(600,600));
        frame.setResizable(false);
        frame.getContentPane().setBackground( Color.PINK);
        frame.add(panelCont);
        panelCont.setVisible(true);
        panelUser.setVisible(true);
        frame.pack();
        frame.setVisible(true);

    }

}
