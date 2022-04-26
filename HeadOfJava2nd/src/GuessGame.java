public class GuessGame {
    Player p1 = new Player();   //Содержит переменные экземпляра для обьекктов
    Player p2 = new Player();

    public void startGame() {
        int guessp1 = 0;       //Обьявляем 2 переменные для хранения вариантов каждого игрока
        int guessp2 = 0;

        boolean p1isRight = false;    //Обявляем пеерменные для хранения неправильности или правильности ответов
        boolean p2isRight = false;


        int targetNumber = (int) (Math.random() * 10);          //Создаем число которое игроки должны угадать
        System.out.println("Я загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Число которое нужно угадать, - " + targetNumber);

            p1.guess();     //Вызываем метод из каждого обекта Player
            p2.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает что это " + guessp1);   //Извлекаем варианты из методов guess
            guessp2 = p2.number;
            System.out.println("Второй игрок думает что это " + guessp2);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p1isRight = true;
            }
            if (p1isRight || p2isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Попробуйте еще раз!");

            }

        }
    }
}
