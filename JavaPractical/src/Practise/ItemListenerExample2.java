package Practise;

import javax.swing.*;
import java.awt.event.*;

public class ItemListenerExample2 {
    JFrame frame;
    public ItemListenerExample2() {
        frame = new JFrame("ItemListener Example");
        JCheckBox checkBox = new JCheckBox("Check Me");
        checkBox.setBounds(100, 50, 150, 30);

        JLabel label = new JLabel("State: Unchecked");
        label.setBounds(100, 100, 150, 30);

        // Add ItemListener to the checkbox
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setText("State: Checked");
                } else {
                    label.setText("State: Unchecked");
                }
            }
        });

        frame.add(checkBox);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ItemListenerExample2();
    }
}

