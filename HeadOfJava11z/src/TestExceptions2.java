public class TestExceptions2 {
        public static void main(String[] args) {
            String test = "yes";
            try {                                          //1 строка заходит в блок трай
                System.out.println("Try start");            //2 пишет это
                doRisky(test);                             //3 уходит в метод
                System.out.println("Try finish");
            } catch (ScaryException se) {                 //6 срабатывает исключение и пишет свой текст
                System.out.println("Scary exception");
            } finally {
                System.out.println("Finally");             //7 в любом из случаев пишет это
            }
            System.out.println("Main finish");             //8 и соответственно пишется это
        }

        static void doRisky(String test) throws ScaryException {
            System.out.println("Scary exception start");             //4 пишет это
            if ("yes".equals(test)) {                                //5 соответствует и выходит из ифа сразу в кэтч,тк отвыбрасывает исклчение
                throw new ScaryException();
            }
            System.out.println("Scary exception finish");
            return;
        }
    }


