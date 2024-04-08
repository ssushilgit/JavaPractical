package Practical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class Calculator {
    private JFrame frame;
    private JTextField textField;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 38));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            button.setFont(new Font("Arial", Font.PLAIN, 38));
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {
                try {
                    String result = evaluateExpression(textField.getText());
                    textField.setText(result);
                } catch (Exception ex) {
                    textField.setText("Error");
                }
            } else if (buttonText.equals("C")) {
                textField.setText("");
            } else {
                textField.setText(textField.getText() + buttonText);
            }
        }
    }

    private String evaluateExpression(String expression) {
        try {
            // Split the expression into operands and operator
            String[] tokens = expression.split("[\\+\\-\\*\\/]");
            BigDecimal operand1 = new BigDecimal(tokens[0].trim());
            BigDecimal operand2 = new BigDecimal(tokens[1].trim());
            char operator = expression.replaceAll("[0-9\\s]", "").charAt(0);

            // Perform the operation based on the operator
            BigDecimal result;
            switch (operator) {
                case '+':
                    result = operand1.add(operand2);
                    break;
                case '-':
                    result = operand1.subtract(operand2);
                    break;
                case '*':
                    result = operand1.multiply(operand2);
                    break;
                case '/':
                    // Handle division by zero
                    if (operand2.equals(BigDecimal.ZERO)) {
                        return "Error";
                    }
                    result = operand1.divide(operand2, 10, BigDecimal.ROUND_HALF_UP);
                    break;
                default:
                    return "Error"; // Invalid operator
            }
            return result.stripTrailingZeros().toPlainString();
        } catch (Exception ex) {
            return "Error"; // Invalid expression or other exceptions
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}





