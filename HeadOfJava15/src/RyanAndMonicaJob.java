class BankAccont {
    private int balance = 100;   //изнаально на счету 100

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

public class RyanAndMonicaJob implements Runnable {

    private BankAccont account = new BankAccont();         //счет только один

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();     //экземпляр ранбл
        Thread one = new Thread(theJob);             //  создаем два потока которые работают с одной задачей
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    @Override
    public void run() {                                  //в этом методе потом зацикливается и снимает деньги, между тем проверяя банас чтоб знать есть ли чего еще снять
        for (int x = 0; x < 10; x++) {
            makeWithdrawl(10);
            if (account.getBalance() < 0) {
                System.out.println("Превышение лимита");
            }
        }
    }

    private synchronized void makeWithdrawl(int amount) {                 //проверяем баланс и если он исерпан выводим сообщение. Пока средтв хватает потоки списывают деньги между тем приостанавливаясь чтобы второй поток мог сделать то же
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " собирается снять деньги");
            try {
                System.out.println(Thread.currentThread().getName() + " идет подремать");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                System.out.println(Thread.currentThread().getName() + "просыпается");
                account.withdraw(amount);
                System.out.println(Thread.currentThread().getName() + " заканчивает транзакцию");
            }
        } else {
            System.out.println("Извините, для клиента " + Thread.currentThread().getName() + " недостатоно денег");

        }
    }
}

