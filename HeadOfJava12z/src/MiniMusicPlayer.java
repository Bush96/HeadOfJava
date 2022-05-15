import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer {
    static JFrame f = new JFrame("Концерт тимыБелорусских");       //создаем фрейм
    static MyNewDrawPanel m1;                                          //обьвляем кастомную панель, которую в дальнейшем сделаем под себя

    public static void main(String[] args) {
        MiniMusicPlayer mini = new MiniMusicPlayer();          //создаем саму программу и запускаем обьявленный метод
        mini.going();
    }

    public void setUpGui() {           //обьявляем метод в котором создается наша панель, задаем ей размер и видимость, добавляем панель на фрейм
        m1 = new MyNewDrawPanel();
        f.setContentPane(m1);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

    public void going() {              //каждый раз призапуске метода будет создаваться наша кастомная панель которая явлется фигурой
        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();   //обьявляем муз инстурмент и открываем
            sequencer.open();
            sequencer.addControllerEventListener(m1, new int[]{127});   //ловим синтезатором событие слушателя
            Sequence seq1 = new Sequence(Sequence.PPQ, 4);   //создаем последовательность
            Track track = seq1.createTrack();  //создаем трек и добавляем его в последовательность, так мы ловим ритм

            int r = 0;
            for (int i = 0; i < 60; i += 4) {   //в этом цикле мы рандомим ноты которые будут сыграны синтезатором
                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(144, 1, r, 100, i));    // и добавляем их в трэк + в событие которые будет обрабатываться для подставления фигур
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, r, 100, i + 2));
            }

            sequencer.setSequence(seq1);   //ловим последовательность и начинаем играть
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) { //то саоме событие которое отвечает за ноты и их проигрыш
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception ex) {
        }
        return event;
    }

    class MyNewDrawPanel extends JPanel implements ControllerEventListener{ //внутренний класс нашей кастомной панели
    boolean msg = false;

    public void controlChange (ShortMessage event){  //метод который будет менять цвет фируг при вызове каждой последующей ноты
        msg = true;
        repaint();
    }
    public void paintComponent(Graphics g){   //сам метод который рандомит цвет, форму и расположение фигуры которые будут вызываться программой на каждой ноте
        if (msg){
            Graphics2D g2 = (Graphics2D) g;

            int r = (int) (Math.random() * 250);
            int gr = (int) (Math.random() * 250);
            int b = (int) (Math.random() * 250);

            g.setColor(new Color(r,gr,b));

            int ht = (int)((Math.random()*120) + 10);
            int width = (int)((Math.random()*120) + 10);

            int x = (int)((Math.random()*40) + 10);
            int y = (int)((Math.random()*40) + 10);

            g.fillRect(x,y,ht,width);
            msg = false;
        }
    }
    }
}

