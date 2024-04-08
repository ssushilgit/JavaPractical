package Databasee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginFrame extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton submitButton;
    private JLabel messageLabel;

    public LoginFrame() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        add(usernameLabel);

        usernameField = new JTextField();
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel);

        passwordField = new JPasswordField();
        add(passwordField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        messageLabel = new JLabel();
        add(messageLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (checkCredentials(username, password)) {
            JOptionPane.showMessageDialog(this, "Login Successful");
            // Open the success window or perform any other action
        } else {
            messageLabel.setText("Credentials not matched.");
        }
    }

    private boolean checkCredentials(String username, String password) {
        try {
            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM student_profile WHERE username='" + username + "' AND password='" + password + "'");
            return result.next(); // If result set has next, means credentials exist
        } catch (Exception e) {
            System.out.println("Some error " + e);
            return false;
        }
    }

    private Connection getConnection() throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String databaseUrl = "jdbc:mysql://localhost:3306/mysqll"; // Change the database name if needed
        String userName = "root";
        String password = "";
        Class.forName(driver);
        return DriverManager.getConnection(databaseUrl, userName, password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}
