package Practise;

import java.awt.*;
import java.awt.event.*;

public class awt {
    public static void main(String[] args) {
        // Create a frame (window) with a title
        Frame frame = new Frame("Simple AWT Program");

        // Create a button
        Button button = new Button("Click Me!");

        // Add an ActionListener to handle button clicks
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the layout manager for the frame (FlowLayout is the default)
        frame.setLayout(new FlowLayout());

        // Set the size of the frame
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);

        // Handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
