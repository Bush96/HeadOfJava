import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote  extends Remote {       //Интерфейс обязательно долен быть унаследован отсюда
    public String sayHello() throws RemoteException;   //Все удаленные методы должны содержать обьявление этого исклчения
}
//Пример удаленного интерфейса