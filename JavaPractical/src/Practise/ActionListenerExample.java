package Practise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample extends JFrame implements ActionListener {
    // Create a JLabel
    private JLabel label;
    public ActionListenerExample() {
        // Set frame properties
        setTitle("ActionListener Example");
        setSize(300, 150);
        setLayout(null);
        setVisible(true);

        // Create a JLabel
        label = new JLabel("Click the button!");
        label.setBounds(10, 20, 200, 30);

        // Create a JButton
        JButton button = new JButton("Click Me");
        button.setBounds(10, 60, 150, 30);

        // Add the ActionListener to the button
        button.addActionListener(this); // "this" refers to the ActionListenerExample instance

        // Add components to the frame
        add(label);
        add(button);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        if (e.getActionCommand().equals("Click Me")) {
            label.setText("Button Clicked!");
        }
    }

    public static void main(String[] args) {
        // Create an instance of ActionListenerExample
        new ActionListenerExample();
    }
}
