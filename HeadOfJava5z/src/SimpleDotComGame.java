public class SimpleDotComGame {
    public static void main(String[] args) {
        int numofGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom sd = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] location = {randomNum, randomNum + 1, randomNum + 2};
        sd.setLocationCells(location);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("ВВедите число");
            String result = sd.checkYourSelf(guess);
            numofGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numofGuesses + "попыток(и)");
            }
        }

    }
}
