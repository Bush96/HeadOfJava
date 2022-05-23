import java.io.*;

public class DungeonTest {
    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();
        System.out.println(d.getX()+d.getZ()+d.getY());     //суть задачи ясна, до записи мы имеет 12, после теряется одна переменная помеченная как трансиент, т.к. она не записывается
        try{
            FileOutputStream fos = new FileOutputStream("dr.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileInputStream fis = new FileInputStream("dr.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d= (DungeonGame) ois.readObject();
            ois.close();

        }catch (Exception e){e.printStackTrace();
    }
        System.out.println(d.getX()+d.getZ()+d.getY());
}

static class DungeonGame implements Serializable{
    public int x = 3;
    transient long y = 4;
    private short z = 5;

    short getZ(){
        return z;
    }

    int getX(){
        return x;
    }

    long getY(){
        return y;
    }

}}
