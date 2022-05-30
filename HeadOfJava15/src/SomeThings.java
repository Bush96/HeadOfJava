import java.io.*;
import java.net.Socket;

public class SomeThings {

    public SomeThings() throws IOException {
    }

    Socket chatSocket = new Socket("123.2.3.1", 5043);
    InputStreamReader stream = new InputStreamReader(chatSocket.getInputStream());
    BufferedReader reader = new BufferedReader(stream);
    String message = reader.readLine();                             //таким обазоммыподключаемся спомощьюсокета к серверу и принимаем сообщения с сервера

    public void go() throws IOException {                                 //таким обазом мы подключаемся с помощью сокета к серверу и отправляем сообщения на сервер
        Socket chatSocket = new Socket("123.2.3.1", 5043);
        PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
        writer.println("Hello");


    }
}
