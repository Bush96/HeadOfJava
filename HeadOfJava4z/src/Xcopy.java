public class Xcopy {
    public static void main(String[] args) {
        String orig = "42";
        Xcopy moh = new Xcopy();
        String y = moh.go(orig);
        System.out.println(orig + " " + y);
    }
    String go(String arg){
        arg = "arg * 2";
        return arg;
    }
}
