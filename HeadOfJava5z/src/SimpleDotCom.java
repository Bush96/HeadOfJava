public class SimpleDotCom {
    int[] locationCells;    //обьявляем массив который хранит ход игрока
    int numOfHits = 0;       //обьявляем переменную котороая считает количество ходов

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }      //обьявляем метод котороый принимает ход игрока

    public String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);   //строка которая принимает значние в буквах и переводитв цифры
        String result = "мимо";       //обьявляется новая строка результат
        for (int cell : locationCells) {    //присваиваем каждый элемент массива где находится сайт переменной сеll
            if (guess == cell) {         //если цифра игрока совпала с положением в массиве это будет означать попадание
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
