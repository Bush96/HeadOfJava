class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }
}

public class StaticTest extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("Статический блок" + rand);
    }

    StaticTest() {
        System.out.println("Конструктор");
    }

    public static void main(String[] args) {
        System.out.println("Внутри мэйн");       //эта строка так же запускаетсяраньше конструктора, но позже статических блоков
        StaticTest s = new StaticTest();
    }
}

//статические блоки классов запускаются раньше любых конструкторов