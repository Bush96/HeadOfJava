public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();    //создаем обьект из класса

        int[] locations = {2, 3, 4}; //обьявляем массив в котором будет храниться сайт для потоплениия и его расположение в массиве
        dot.setLocationCells(locations); //вызываем у обьекта метод который говорит нам куда стрельнул игрок
        String userGuess = "1";  //место куда стреляет игрок
        String result = dot.checkYourSelf(userGuess);   //вызов метода который обьявляет результат

    }
}
