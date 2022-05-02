public class car {

    public static void main(String[] args) {
        car car1= new car();
        car car2 = new uaz();         //при полиморфизме этот уаз на переменной кар не знает личных методов класса уаз, он рассматриваетс просто как кар
        uaz car3 = new uaz();
        car1.start();
        car1.howCost();
        System.out.println("");

        car2.start();                  //но здесь уаз исползует метод уаза, т е использовать можно только те методы которые определены в обоих классах
        car2.howCost();
        System.out.println(" ");


        car3.start();
        car3.howCost();
    }
    public void start(){
        System.out.println("Fast");
    }
    public void howCost(){
        System.out.println("Some money");
    }
}

class uaz extends car {
    public void start(){
        System.out.println("Too slow");
    }
}

