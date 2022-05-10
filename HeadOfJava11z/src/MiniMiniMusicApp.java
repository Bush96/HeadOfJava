/*import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer(); //получаем синетзатор и открываем его тобы ипользовать
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);   // ни на что не обращаем внимание, считаем эту часть подготовленной

            Track track = seq.createTrack();   //запрашиваем трек у последовательности : последовательность - трек- миди данные

            ShortMessage a = new ShortMessage();                            //4 сроки вниз заранее подготовлен, так мы помещаем в трэк Миди событие
            a.setMessage(144,1,20,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();                            //4 сроки вниз заранее подготовлен, так мы помещаем в трэк Миди событие
            b.setMessage(128,1,20,100);
            MidiEvent noteOff = new MidiEvent(b,4);
            track.add(noteOff);

            player.setSequence(seq);       //передаем последовательность синтезатору

            player.start();                 //запускаем синтезатор
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }}

 */

