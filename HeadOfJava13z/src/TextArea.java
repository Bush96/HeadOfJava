import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea implements ActionListener {
    JTextArea text;       //создаем текстовую область

    public static void main(String[] args) {
        TextArea gui = new TextArea();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click");
        button.addActionListener(this);
        text = new JTextArea(10, 20);    //10 - строки, 20 - столбцы
        text.setLineWrap(true);   // включаем перенос текста

        JScrollPane scroller = new JScrollPane(text);  //создаем панель для скролла и добавляем на неее панель для ввода
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        text.append("button clicked \n");
    }
}
