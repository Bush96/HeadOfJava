import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("MyText.txt");
            FileReader fileReader = new FileReader(myFile);    //файлридер - потомуу соединения для символов текстового файла

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;   //переменная которая будет принимать содержимое файла
            while ((line = reader.readLine()) != null) {  //пока в файле есть что читтаь - выводим это на экран
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
