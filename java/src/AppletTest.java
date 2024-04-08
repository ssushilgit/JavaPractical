import javax.swing.JApplet;
import java.awt.Graphics;

public class AppletTest extends JApplet {
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("My Applet", 100, 100);
    }
}
