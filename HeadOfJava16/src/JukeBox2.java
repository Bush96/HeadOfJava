import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox2 {
    ArrayList<Song> songList1 = new ArrayList<>();

    public static void main(String[] args) {
        new JukeBox2().go();
    }

    class ArtistCompare implements Comparator<Song> {     //создаемвложенный класс с типом параметра который собираемся сравнивать
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());   //гет артист становится строкой(именем исполнителя)
            // сомпэйр ту работает со стороковыми обьектами и умеет сортировать п оалфавиту, теперь будет работать он
        }
    }

    public void go() {
        getSongs1();
        System.out.println(songList1);
        Collections.sort(songList1);
        System.out.println(songList1);

        ArtistCompare artistCompare = new ArtistCompare();   //Создаем экзмепляр вложенного класса Comparator
        Collections.sort(songList1, artistCompare);
        System.out.println(songList1);
    }

    void getSongs1() {
        try {
            File file = new File("C:\\Users\\Bush\\Desktop\\SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList1.add(nextSong);
    }

}


