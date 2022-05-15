import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleGui1 implements ActionListener {    //реализуем интерфейс, кнопка будет передавать собтие только тем кто реализуем АктионЛистенер

    JFrame frame;

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1();
        gui.go();
    }

    public void go() {
        frame = new JFrame();          //создаем фрейм
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //эта строка завершает работу при закрытии окна

        JButton button = new JButton("Меняй цвет");    //создаем кнопку
        button.addActionListener(this);
        //Регистрируем нашу заинтересованность в кнопке

        MyDrawPanel dp = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        //добавляем кнопку на фрейм
        frame.getContentPane().add(BorderLayout.CENTER, dp);

        frame.setSize(300, 300);  // задаем фрейму размер
        frame.setVisible(true);  //делаем фрейм видимым
    }

    public void actionPerformed(ActionEvent event) {        //реализуем метод АктионПерформд интерфейса АктионЛистенер. Это фактический метод обработки событий
        frame.repaint();      //когда пользователь нажимает кнопку метод paintComponents вызывается для каждого виджета во фрейме

    }
}

class MyDrawPanel extends JPanel {                   //создаем налсденика ДЖпанель, который в дальнейшем будем использовать как простой виджет
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

