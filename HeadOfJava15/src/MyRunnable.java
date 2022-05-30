
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);        //ставя блок здесь мы даем возможность сперва сработать мэйну, а после уже рану, так как мы его придерживаем
            //без этого блок последовательность вывода была бы рандомна
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }
}

class ThreadTestDrive {
    public static void main(String[] args) {
        Runnable theJob = new MyRunnable();
        Thread t = new Thread(theJob);
        t.start();
        System.out.println("Возвращаемся в метод Мэйн");  //суть в том что многопоточность создает иллюзию того что несколько процессов проиходят в 1 момент, но по факту они просто быстро срабатывают что нам и нужно
    }
}
