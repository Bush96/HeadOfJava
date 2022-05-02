public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b2.setLenght(32);
        b1.move();
        b3.move();
        b2.move();
    }
}

class Boat {
    private int lenght;

    public void setLenght(int len) {
        lenght = len;
    }

    public int getLenght() {
        return lenght;
    }

    public void move() {
        System.out.print("Дрейф ");
    }
}

class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.println("Go Natasha!");
    }
}

class Sailboat extends Boat {
    public void move() {
        System.out.print("Поднять паруса!");
    }
}
