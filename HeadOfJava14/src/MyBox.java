
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyBox implements Serializable {
    private int width;          //эти два значеиня будут сохранены
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public static void main(String[] args) {
        MyBox box = new MyBox();
        box.setHeight(50);
        box.setHeight(20);

        try {         //операции вводва\вывода могут вызывать исключения
            FileOutputStream fs = new FileOutputStream("myBox.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);             //связывае потоки для записи обьекта
            os.writeObject(box);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
