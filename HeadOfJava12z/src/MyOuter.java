public class MyOuter {
    private  int x;   //внешний класс содержит приватную переменную

    MyInner inner = new MyInner();  //создаем экземпляр внутренего класса

    public void doStuff(){   //в методе внешнего класса вызываем метод внутреннего класса
        inner.go();
    }
    class MyInner{
        void go(){
            x=42;   // метод внутреннго лкасса использует переменную внешнего будто она своя
        }
    }
}
