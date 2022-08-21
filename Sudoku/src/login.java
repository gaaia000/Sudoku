import javax.swing.*;
import java.awt.*;

public class login {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setSize(600,600);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(10,20,80,25);
        panel.add(usernameLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(25);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        /*
        box.add(Box.createVerticalGlue());
        sudoku.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 65));
        sudoku.setForeground(Color.WHITE);
        sudoku.setAlignmentX(Component.CENTER_ALIGNMENT);
        sudoku.setAlignmentY(Component.CENTER_ALIGNMENT);
        box.add(sudoku);
        box.add(Box.createVerticalGlue());

         */


































        frame.add(panel);

    }
}
