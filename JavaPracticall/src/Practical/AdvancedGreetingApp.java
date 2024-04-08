package Practical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedGreetingApp {
    public static void main(String[] args) {
        // Create a JFrame (window) and set its properties
        JFrame frame = new JFrame("Advanced Greeting App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 430);

        // Create a JPanel with a GridLayout (2 rows, 1 column)
        JPanel panel = new JPanel(new GridLayout(2, 1));

        // Create a JPanel for input components with a FlowLayout
        JPanel inputPanel = new JPanel(new FlowLayout());

        // Create a JLabel and a JTextField for name input
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(15);

        // Add name components to the inputPanel
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);

        // Create a JPanel for greeting type selection with a FlowLayout
        JPanel greetingTypePanel = new JPanel(new FlowLayout());

        // Create a JLabel and a JComboBox for greeting type selection
        JLabel greetingTypeLabel = new JLabel("Select greeting type:");
        String[] greetingTypes = {"Hello", "Good morning", "Congratulations"};
        JComboBox<String> greetingTypeComboBox = new JComboBox<>(greetingTypes);

        // Add greeting type components to the greetingTypePanel
        greetingTypePanel.add(greetingTypeLabel);
        greetingTypePanel.add(greetingTypeComboBox);

        // Create a JButton for generating the greeting message
        JButton greetButton = new JButton("Greet");

        // Create a JLabel to display the greeting message
        JLabel greetingLabel = new JLabel();

        // Add an ActionListener to the button
        greetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the name and selected greeting type
                String name = nameField.getText();
                String selectedGreeting = (String) greetingTypeComboBox.getSelectedItem();

                // Set a larger font for the greeting label
                Font font = new Font("Arial", Font.BOLD, 24); // You can adjust the font size (24 in this case)
                greetingLabel.setFont(font);

                // Display the personalized greeting message
                greetingLabel.setText(selectedGreeting + ", " + name + "!");
            }
        });

        // Add components to the inputPanel
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);

        // Add components to the greetingTypePanel
        greetingTypePanel.add(greetingTypeLabel);
        greetingTypePanel.add(greetingTypeComboBox);

        // Add components to the main panel
        panel.add(inputPanel);
        panel.add(greetingTypePanel);

        // Add components to the frame's content pane using BorderLayout
        frame.add(panel, BorderLayout.NORTH);
        frame.add(greetButton, BorderLayout.CENTER);
        frame.add(greetingLabel, BorderLayout.SOUTH);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
