import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomeButtons {
    JFrame frame;
    JLabel label;
    JLabel label1;
    JButton button;
    JButton button1;

    public static void main(String[] args) {
        SomeButtons sb = new SomeButtons();
        sb.went();
    }

    public void went() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Нажми меня");
        label = new JLabel("Смотри сюда");
        label1 = new JLabel("Потом смотри сюда");
        button.addActionListener(new button());
        button1 = new JButton("Теперь нажми сюда");
        button1.addActionListener(new button1());
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.getContentPane().add(BorderLayout.EAST, label);
        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.getContentPane().add(BorderLayout.WEST, label1);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class button implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText("Пойду курить");
        }
    }

    class button1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label1.setText("Уже ходил");
        }
    }
}
