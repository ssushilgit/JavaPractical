package Practical;

import javax.swing.*;
import java.awt.event.*;

public class SumDifferenceCalculator {
    JFrame frame;
    JLabel label1, label2, label3;
    JTextField textField1, textField2, textField3;
    JButton addButton;

    SumDifferenceCalculator() {
        frame = new JFrame("Sum and Difference Calculator");

        label1 = new JLabel("First Number:");
        textField1 = new JTextField();
        textField1.setBounds(60, 50, 120, 30);

        label2 = new JLabel("Second Number:");
        textField2 = new JTextField();
        textField2.setBounds(60, 80, 120, 30);

        label3 = new JLabel("Result:");
        textField3 = new JTextField();
        textField3.setBounds(60, 110, 120, 30);

        addButton = new JButton("Calculate");

        // Add MouseListener to the button
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });

        addButton.setBounds(60, 140, 120, 40);

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(textField3);
        frame.add(addButton);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void calculateSum() {
        try {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int sum = num1 + num2;
            textField3.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            textField3.setText("Invalid Input");
        }
    }

    private void calculateDifference() {
        try {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int difference = num1 - num2;
            textField3.setText(String.valueOf(difference));
        } catch (NumberFormatException ex) {
            textField3.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SumDifferenceCalculator();
            }
        });
    }
}

