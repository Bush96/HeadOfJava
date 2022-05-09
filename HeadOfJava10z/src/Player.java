import java.util.ArrayList;

public class Player {
    static int playerCount = 0;   // 0 можно и не писаться, статическиепеременные инициализируются по умолчанию сами
    private String name;
    static  int z;
    final static int c = 2;

    public Player(String s){
        name = s;
        playerCount ++;
    }
    public void went(final int c){
        System.out.println(c);            //не статический метод может принимать и использовать константу
    }

    public void go(){               //не статический метод видит статическую переменную
        System.out.println(z);
    }

    //классы обертки: помещение простой переменной в arraylist:
    public void doNumsNewWay(){
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(3);
        int num1= listOfNumbers.get(1);
        int num2 = listOfNumbers.get(2);

    }
}

class TestDrivePlayer{
    public static void main(String[] args) {
        System.out.println(Player.playerCount);    //доступ к татическим переменным получают так же как и к статическим методам - через имя класса
        Player p = new Player("Dzhon");
        System.out.println(Player.playerCount);



    }
}
