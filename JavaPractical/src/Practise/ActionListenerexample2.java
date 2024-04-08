package Practise;

//This program is of ActionListener

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionListenerexample2 extends JFrame implements ActionListener {
    TextField tf;
    JLabel label;

    public ActionListenerexample2() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);

        label = new JLabel("Click the button!");
        label.setBounds(60, 70, 170, 20);

        JButton b = new JButton("Click Me");
        b.setBounds(60, 90, 170, 20);

        b.addActionListener(this);
        add(tf);
        add(label);
        add(b);

        setSize(300, 300);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Button Clicked!!!");
    }

    public static void main(String[] args) {
        new ActionListenerexample2();
    }
}
