public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for (int x = 0; x<3; x++){   //вызываем обьекты по порядку из массива
            ma[x].frighter(x);       // на каждом вызываем их усуловия (начиная с низу) как положено
        }                              //п с - последний вариант из задания не сработал, хотя должен был, изза аргумента не int a byte
    }                                  // а все потому что если методы одинаковые но в них разные аргументы то и сами методы становятся разными совсем!!!!
}

class Monster{
boolean frighter (int z){
    System.out.println("Grrrrrrr");
    return false;
}
}

class Vampire extends Monster{
    boolean frighter(int b){
        System.out.println("Укусить?");
        return true;
    }

}

class Dragon extends Monster{
    boolean frighter( int degree) {
        System.out.println("Огненное дыхание");
        return true;
    }
}
