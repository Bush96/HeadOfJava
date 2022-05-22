import javax.swing.*;
import java.awt.*;

public class FlowPanel {
    public static void main(String[] args) {
        FlowPanel fp = new FlowPanel();
        fp.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //без этой сторки п оумолчанию будетFlowLayout
        // а так делаем чтобы перейти на BoxLayout, ему нужно знать что мы размещаем и какую ось принимать
        JButton button = new JButton("Click me");
        JButton button1 = new JButton("Me");
        panel.add(button);
        panel.add(button1);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}

