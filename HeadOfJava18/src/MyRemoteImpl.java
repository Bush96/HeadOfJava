import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {     //наследование UnicastRemoteObject самый простой способ создать удаленный обьект
    public String sayHello() {     //необходимо реализовать все методы интерфейса
        return "Server say: 'Hello'";
    }

    public MyRemoteImpl() throws RemoteException {    //в обьявлении UnicastRemoteObject содержится исключчение, поэтому создаем свой конструктор, ведь его наличие говорит о вызове опасного кода

    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();   //создаем удаленный обьект
            Naming.rebind("Remote Hello", service);    //так помещаем его в реестр РМИ,это имя будетиспользоваться клиентом для поиска обьекта в реестре
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


//Пример реализации удаленного сервиса
