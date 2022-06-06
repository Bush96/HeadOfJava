import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote Hello");   //тут приводим полуенный обьек к имени интерфейса + осуществляем поиск обьекта по имени в реестре РМИ
            String s = service.sayHello();     //выглядит как вызов обычного метода
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

//Пример кода клиента
