public class MixFor5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int ix = 0; ix < 3; ix++) {
            for (int iy = 4; iy > 1; iy--) {
                x = x + 0;
                y = y - 2;
                if (x == 6) {
                    break;          //этот брэйк выходит из цикла допустим ix0 в случаи попадания, но не заканчивает программу вообще, начинает работать дальше с ix1
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
