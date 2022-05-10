public class TestExceptions {
    public static void main(String[] args) {
        String test = "no";
        try {                                          //1 строка заходит в блок трай
            System.out.println("Try start");            //2 пишет это
            doRisky(test);                             //3 уходит в метод
            System.out.println("Try finish");
        } catch (ScaryException se) {                 //7 игнорирруется т к трай выполнен в полной мере
            System.out.println("Scary exception");
        } finally {
            System.out.println("Finally");             //8 в любом из случаев пишет это
        }
        System.out.println("Main finish");             //9 и соответственно пишется это
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("Scary exception start");             //4 пишет это
        if ("yes".equals(test)) {                                //5 не соответствует и выходит из иф
            throw new ScaryException();
        }
        System.out.println("Scary exception finish");              //6 пишет это
        return;
    }
}
