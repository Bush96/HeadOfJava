import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();                      //обявляем и инициализируем переменнные которыенам понадобятся
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();    //Создаеи Эррэйлист ТОЛЬКО для обьектов ДотКом
    private int numofGuesses = 0;                                       //

    private void setUpGame() {

        DotCom one = new DotCom();                                     //Создаем три обьекта ДотКом даем им имена и помещаем в Эррэйлист ДотКомЛист
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToy.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);                                          //

        System.out.println("Ваша цель - потопить три цели");                //Выводим краткую инструкцию для пользователя
        System.out.println("Pets.com, eToy.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");      //

        for (DotCom dotComToSet : dotComsList) {                          //повторяем с каждым обьектом ДотКом в списке
            ArrayList<String> newLocation = helper.placeDotCom(3);        //запашиваем у вспомогательного обьектра адрес сайта
            dotComToSet.setLocationCells(newLocation);                   //Вызываем сеттер из обьекта ДотКом чтобы передать ему текущее местоположение,
        }                                                                //которое только что получили от вспомогательного обьекта
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {                                      //До те пор пока список обьектов ДотКом не будет пустым
            String userGuess = helper.getUserInput("Сделайте ход");     //получаем пользовательский ввод
            checkUserGuess(userGuess);                                         //вызываем метод checkUserGuess
        }
        finishGame();                                                        //Вызываем наш метод finishgame
    }

    private void checkUserGuess(String userGuess) {
        numofGuesses++;                                                  //инкрементируем количество попыток которые сделал пользователь
        String result = "Мимо";                                          //подразумеваем промах пока не выяснили обратного
        for (DotCom dotComtoTest : dotComsList) {                        //повторяем это для всех обьектов ДотКом в списке
            result = dotComtoTest.checkYourself(userGuess);               //Просим ДотКом проверить ход польователья, ищем попадания или потопления
            if (result.equals("Попал")) {                                //
                break;                                                   //Выбираемся из цикла раньше времени, так как нет смысла проверять другие цели
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComtoTest);                        // ему пришел конец, так что удаляем его из списка целей и выходи из цикла
                break;
            }                                                            //
        }
        System.out.println(result);                                     // выводим для пользователя результат
    }

    private void finishGame(){                                                                     //выводим сообщение о том как пользователь прошел игру
        System.out.println("Все цели ушли ко дну! Ваш акции теперь ничего не стоят.");
        if (numofGuesses <=18){
            System.out.println("Это заняло у вас всего" + numofGuesses + " попыток");;
        } else {
            System.out.println("Это заняло у вас много времени " + numofGuesses + " попыток");
        }
    }                                                                                             //

    public static void main(String[] args) {
        DotComBust game = new DotComBust();                               //Созаем игровой обьект
        game.setUpGame();                                                 //Гооворим игровому обьектру подготовить игру
        game.startPlaying();                                               //Говорим игровому обьектру начать главный цекл ( продолжаем запрашивать пользовательскийй ввод и проверять полученные данные)
    }


}


