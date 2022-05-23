import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("FOO.txt");    //если название не написать - создасться само
            writer.write("Привет!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
