import javax.swing.*;
import java.awt.*;

class MenuDemo {
    public static void main(String args[]) {
        JFrame f = new JFrame("Menu Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 250);
        f.setLayout(new FlowLayout());

        JMenu colorsMenu = new JMenu("Colors");
        colorsMenu.add(new JMenuItem("Red"));
        colorsMenu.add(new JMenuItem("Green"));

        JMenu coursesMenu = new JMenu("Courses");
        JMenu twoDMenu = new JMenu("IT");
        JMenu threeDMenu = new JMenu("Management");

        twoDMenu.add(new JMenuItem("BCA"));
        twoDMenu.add(new JMenuItem("CSIT"));
        threeDMenu.add(new JMenuItem("BBA"));
        threeDMenu.add(new JMenuItem("BBM"));

        coursesMenu.add(twoDMenu);
        coursesMenu.add(threeDMenu);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(coursesMenu);
        menuBar.add(colorsMenu);

        f.setJMenuBar(menuBar);
        f.setVisible(true);
    }
}
