import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"лук", "меч", "кастет"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"голые руки", "большой топор"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        one = null;        //присвоим им значение нулл, тобы мы не могли обратиться к ним в куче
        two = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();

            System.out.println("Тип первого: " + oneRestore.getType());
            System.out.println("Оружие второго: " + twoRestore.getWeapons());
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}



