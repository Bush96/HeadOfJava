import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Jukebox3 {
    ArrayList<Songs> songsList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox3().gow();
    }

    public void gow() {
        getSong();
        System.out.println(songsList);
        Collections.sort(songsLis);
        System.out.println(songsList);
        HashSet<Songs> songSet = new HashSet<>();         //создаем множестно хэшдля хранения обьектов сонг
        songSet.addAll(songsList);              //тоже что и просто эд, только не нужно добавлять каждую песню отдельно
        System.out.println(songSet);
    }

    private ArrayList<Songs> getSongsList() {
        return songsList;
    }

    void getSong() {
        try {
            File file = new File("C:\\Users\\Bush\\Desktop\\SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSongs(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSongs(String lineToParse) {
        String[] tokens = lineToParse.split("/");        //делим полученно лексемами начасти
        Songs nextSongs = new Songs(tokens[0], tokens[1], tokens[2], tokens[3]);    //создаемновый обьект сонг с помощью четырех лексем и добавляем этот обьект в список
        songsList.add(nextSongs);
    }

}

class Songs implements Comparable<Song> {       //Указываем тип с которым может сравниться наш класс, как правило они одинаковы но может быть и иначе
    String title;
    String artist;
    String rating;
    String bpm;

    public boolean equals(Object aSongs) {
        Songs s = (Songs) aSongs;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode() {
        return title.hashCode();
    }

    public int compareTo(Song s) {       //метод сортпередает обьект сонг в компэйр ту чтобы увидеть как тот соотносится с экзмепляром сонг из которого вызван метод
        return title.compareTo(s.getTitle());    //тупо запомнить
    }

    Songs(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }
}

