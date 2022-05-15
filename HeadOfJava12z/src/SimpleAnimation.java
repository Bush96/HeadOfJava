import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 10;
    int y = 10;

    public static void main(String[] args) {
        SimpleAnimation sm = new SimpleAnimation();
        sm.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel2 dp2 = new MyDrawPanel2();

        frame.getContentPane().add(dp2);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            dp2.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception ex) {
            }
        }
    }

    class MyDrawPanel2 extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(), this.getHeight());
            g.setColor(Color.black);
            g.fillOval(x, y, 50, 50);
        }
    }
}


