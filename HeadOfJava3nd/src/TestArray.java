public class TestArray {
    public static void main(String[] args) {

        String[] islands = new String[4];
        islands[0] = "Bermuds";
        islands[1] = "Fidzhi";
        islands[2] = "Azovs";
        islands[3] = "Kosumel";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;

        System.out.println("Ostrova = ");
        while (y < 4) {
            ref = index[y];
            y = y + 1;
            System.out.println(islands[ref]);

        }


    }
}
