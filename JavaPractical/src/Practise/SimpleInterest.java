package Practise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleInterest {
    JFrame f;
    JLabel l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    JButton btn;
    SimpleInterest(){
        f=new JFrame("Interest");

        l1 = new JLabel("Enter Principle: ");
        t1 = new TextField();
        t1.setBounds(60,50,120,30);

        l2= new JLabel("Enter Time: ");
        t2= new TextField();
        t2.setBounds(60,80,120,30);

        l3 = new JLabel("Enter Rate: ");
        t3 = new TextField();
        t3.setBounds(60,110,120,30);

        l4= new JLabel("Total Simple Interest:  ");
        t4= new TextField();
        t4.setBounds(60,140,120,30);

        btn= new JButton("Calculate Interest");
        btn.setBounds(60,170,80,40);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a= t1.getText();
                String b= t2.getText();
                String c= t3.getText();
                int d=Integer.parseInt(a);
                int f=Integer.parseInt(b);
                int g=Integer.parseInt(c);
                int result=(d*f*g)/100;
                t4.setText(String.valueOf(result));
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(btn);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleInterest();
    }
}
