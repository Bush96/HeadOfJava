import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class DailyAdviceServer {
    String[] adviceList = {"advice 1", "advice 2", "advice3", "advice 4", "advice 5"};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(5000);   //благодаря этому приложение отслеживает клиентские запроы на порту 4242 на том же компьютере где выполнен этот код
            while (true) {                                       //сервер входит в состояне цикла, ожидая клиентские подключения
                Socket sock = serverSock.accept();                //метод ассерт блокирует прилоение до тех пор, пока не посутпит запрос , после чего возвращает сокет для взаимодейския с клиентом

                PrintWriter writer = new PrintWriter(sock.getOutputStream());   //теперь мы используем соединение обьекта Сокет с клиентом для создания экзмепляра ПринтРитер после чего отправляем с его помощью строку
                String advice = getAdvice();
                writer.println(advice);
                writer.close();        //закрываем сокет так как работа закончена
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
