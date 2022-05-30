import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader reader = new InputStreamReader(s.getInputStream());
            BufferedReader buff = new BufferedReader(reader);
            String advice = buff.readLine();
            buff.close();
            System.out.println("Вы получили совет " + advice);

        } catch
        (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient dac = new DailyAdviceClient();
        dac.go();
    }

}
