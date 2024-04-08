package Practise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Sum {
    JFrame f;
    JLabel l1,l2,l3;
    TextField t1,t2,t3;
    JButton btn;
    Sum(){
        f=new JFrame("Addition");

        l1 = new JLabel("First Number: ");
        t1 = new TextField();
        t1.setBounds(60,50,120,30);

        l2= new JLabel("Second Number: ");
        t2= new TextField();
        t2.setBounds(60,80,120,30);

        l3= new JLabel("Total Sum:  ");
        t3= new TextField();
        t3.setBounds(60,110,120,30);

        btn= new JButton("Add");
        btn.setBounds(60,140,80,40);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a= t1.getText();
                String b= t2.getText();
                int c=Integer.parseInt(a);
                int d=Integer.parseInt(b);
                int result=c+d;
                t3.setText(String.valueOf(result));
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(btn);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Sum();
    }
}
