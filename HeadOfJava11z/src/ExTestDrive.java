class MyEx extends Exception {
}

public class ExTestDrive {

    public static void main(String[] args) {
        String test = args[0];              //не забываем чтоэто вывод с клавиатуры!!
        System.out.print("t");
        try{
            doRisky(test);
            System.out.print("r");
            System.out.print("o");
            System.out.print("w");

        } catch (MyEx e){
            System.out.print("a");
            System.out.print("w");

        } finally {
            System.out.println("s");
        }

    }

    static public void doRisky(String t) throws MyEx{
        System.out.print("h");
        if ("yes".equals(t)){
        throw new MyEx();

    }

}}
