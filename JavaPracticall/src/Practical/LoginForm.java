package Practical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 0, 0));

        JLabel usernameLabel = new JLabel("           Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("            Password:");
        passwordField = new JPasswordField();
        JButton loginButton = new JButton(" Login");

        messageLabel = new JLabel("");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                authenticate();
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(loginButton);
        panel.add(messageLabel);

        add(panel);
    }

    private void authenticate() {
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        // Perform authentication (Replace this with your actual authentication logic)
        if ("Sushil".equals(username) && "123456".equals(password)) {
            messageLabel.setText("Login Successful");
        } else {
            messageLabel.setText("Login Failed. Please check your credentials.");
        }

        // Clear the password field after authentication
        passwordField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}




