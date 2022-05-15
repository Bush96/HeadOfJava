import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TwoButtons  {    //теперь тут интерфейс не реализовываем

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons tb = new TwoButtons();
        tb.gow();
    }

    public void gow() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //эта строка завершает работу при закрытии окна

        JButton labelButton = new JButton("Меняй цвет");    //создаем кнопку
        labelButton.addActionListener(new LabelListener());
        //вместо того чтобы передавать зис мы передаем соответствующий экземпляр слушателя

        JButton colorButton = new JButton("Меняй окружность");    //создаем кнопку
        labelButton.addActionListener(new ColorListener());

        label = new JLabel("I am a label");
        MyDrawPanel1 dp1 = new MyDrawPanel1();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        //добавляем кнопку на фрейм
        frame.getContentPane().add(BorderLayout.CENTER, dp1);
        frame.getContentPane().add(BorderLayout.EAST,labelButton);
        frame.getContentPane().add(BorderLayout.WEST,label);

        frame.setSize(300, 300);  // задаем фрейму размер
        frame.setVisible(true);  //делаем фрейм видимым
    }

    class LabelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
         label.setText("AUF!");
        }
    }

    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.repaint();
        }
    }
}

class MyDrawPanel1 extends JPanel {                   //создаем налсденика ДЖпанель, который в дальнейшем будем использовать как простой виджет
    public void paintComponents(Graphics g) {      //Большой важный графиеский метод который вызыватся сам, можно смотреть на него как на холст для рисования
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }

}

