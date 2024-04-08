package Practise;


import java.awt.*;
import java.awt.event.*;

public class awt2 {
    private Frame frame;
    private Label userLabel, passwordLabel, messageLabel;
    private TextField userText, passwordText;
    private Button loginButton;

    public awt2() {
        frame = new Frame("Login Page");

        userLabel = new Label("Username:");
        passwordLabel = new Label("Password:");
        messageLabel = new Label("");

        userText = new TextField();
        passwordText = new TextField();
        passwordText.setEchoChar('*'); // Set password field to show '*' for each character

        loginButton = new Button("Login");

        // ActionListener for the login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validateLogin();
            }
        });

        // Layout setup using GridLayout
        frame.setLayout(new GridLayout(4, 2));

        // Adding components to the frame
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passwordLabel);
        frame.add(passwordText);
        frame.add(new Label()); // Empty label for spacing
        frame.add(loginButton);
        frame.add(messageLabel);

        // Handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Set the size of the frame
        frame.setSize(300, 150);

        // Make the frame visible
        frame.setVisible(true);
    }

    private void validateLogin() {
        String username = userText.getText();
        String password = passwordText.getText();

        // For simplicity, let's check if both fields are non-empty
        if (!username.isEmpty() && !password.isEmpty()) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid username or password");
        }
    }

    public static void main(String[] args) {
        new awt2();
    }
}
