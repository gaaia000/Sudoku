import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.BlockingQueue;

public class Sudoku_MainWindow extends Sudoku_solver{

    public JFrame app;

    JFrame mainWindow = new JFrame("SUDOKU +");

    //parent
    JPanel panelCont = new JPanel();

    //children
    JPanel frame = new JPanel();
    JPanel solver = new JPanel();

    //components
    JButton solve;
    JButton play;

    //card layout
    CardLayout cl = new CardLayout();

    public Sudoku_MainWindow(){

        panelCont.setLayout(cl);

        GridLayout gl = new GridLayout(2,1);
        gl.setVgap(20);
        gl.setHgap(20);
        this.frame.setSize(50,50);
        this.frame.setLayout(gl);
        this.frame.setBackground( Color.PINK);
        this.frame.setBorder(new EmptyBorder(50, 50, 50, 50));

        //"sudoku" box
        Box box = new Box(BoxLayout.Y_AXIS);
        box.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        box.setOpaque(true);
        box.setBackground(Color.BLACK);

        //-> "sudoku +" label
        JLabel sudoku = new JLabel("SUDOKU +");
        box.add(Box.createVerticalGlue());
        sudoku.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 65));
        sudoku.setForeground(Color.WHITE);
        sudoku.setAlignmentX(Component.CENTER_ALIGNMENT);
        sudoku.setAlignmentY(Component.CENTER_ALIGNMENT);
        sudoku.setVisible(true);
        box.add(sudoku);
        box.add(Box.createVerticalGlue());
        box.setVisible(true);

        //Lower part of JFrame GridLayout (row 2)
        //-> big pannel
        JPanel buttonBox = new JPanel();
        buttonBox.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        buttonBox.setBackground(Color.PINK);

        //-> buttons
        solve = new JButton("Sudoku solver");
        play = new JButton("Try yourself");

        //buttons customization
        solve.setPreferredSize(new Dimension(150,50));
        solve.setBackground(Color.BLACK);
        solve.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        solve.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        solve.setForeground(Color.WHITE);

        play.setPreferredSize(new Dimension(150,50));
        play.setBackground(Color.BLACK);
        play.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        play.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        play.setForeground(Color.WHITE);

        //-> two smaller panels for each button
        JPanel b2 = new JPanel();
        b2.setLayout(new GridBagLayout());
        b2.setBackground(Color.PINK);
        b2.add(solve);
        b2.setVisible(true);
        solve.setVisible(true);

        JPanel b1 = new JPanel();
        b1.setLayout(new GridBagLayout());
        b1.setBackground(Color.PINK);
        b1.add(play);
        b1.setVisible(true);
        play.setVisible(true);



        //Lower part of Jframe GridLayout devided into new GridLayout
        GridLayout buttonsMainWindow = new GridLayout(1,2);
        buttonsMainWindow.setHgap(20);
        buttonsMainWindow.setVgap(20);
        buttonBox.setLayout(buttonsMainWindow);
        buttonBox.add(b2);
        buttonBox.add(b1);
        buttonBox.setVisible(true);

        //ACTION LISTENER
        solve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.dispose();

                app = new JFrame();
                Sudoku_solver ss = new Sudoku_solver();
                GridLayout glBoard = new GridLayout(2,2);
                app.setLayout(glBoard);
                app.setResizable(false);
                app.getContentPane().setBackground(Color.PINK);
                app.setSize(600, 600);
                app.add(ss.getBoard());
                app.setVisible(true);

            }
        });


        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.dispose();

                new Sudoku_Cards();

            }
        });



        //ADDING
        panelCont.add(frame, "1");
        panelCont.add(solver, "2");
        cl.show(panelCont, "1");


        //frame
        //mainWindow.pack();
        frame.add(box);
        frame.add(buttonBox);
        mainWindow.setResizable(false);
        mainWindow.getContentPane().setBackground( Color.PINK);
        mainWindow.add(panelCont);
        panelCont.setVisible(true);

        mainWindow.setSize(600,600);
        mainWindow.setVisible(true);


    }


}
