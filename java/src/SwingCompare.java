import javax.swing.JOptionPane;

public class SwingCompare {
    public static void main(String args[]) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number : "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number : "));
        int c = a + b;
        JOptionPane.showMessageDialog(null, "The sum is " + c, null, JOptionPane.PLAIN_MESSAGE);
        // ERROR_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE
        if (a > b) {
            JOptionPane.showMessageDialog(null, "The number " + a, "is greatest", c);
        } else if (b > a) {
            JOptionPane.showMessageDialog(null, "The number " + b, "is greatest", c);

        } else {
            JOptionPane.showMessageDialog(null, "Both are equal", null, c);
        }
    }
}
